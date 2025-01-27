package Program_6 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A() extends T_A
case class CC_B() extends T_A
case class CC_C(a: T_B[CC_B, (T_A,CC_A)], b: (CC_A,CC_B), c: Boolean) extends T_A
case class CC_D[C]() extends T_B[Boolean, C]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C(_, (CC_A(),CC_B()), _) => 1 
}
}
// This is not matched: CC_A()