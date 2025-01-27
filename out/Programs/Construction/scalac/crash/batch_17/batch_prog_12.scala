package Program_12 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A() extends T_A
case class CC_B(a: (CC_A,CC_A)) extends T_A
case class CC_C(a: Boolean, b: CC_A, c: CC_B) extends T_A
case class CC_D[B](a: (T_A,T_A), b: (CC_A,T_B[CC_B])) extends T_B[B]
case class CC_E[C](a: (Boolean,T_A), b: CC_A, c: CC_A) extends T_B[C]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_C(_, CC_A(), _) => 1 
}
}
// This is not matched: CC_B((CC_A(),CC_A()))