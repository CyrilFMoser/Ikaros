package Program_29 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A() extends T_A
case class CC_B(a: T_B[CC_A, T_A], b: CC_A) extends T_A
case class CC_C() extends T_A
case class CC_D[C](a: C, b: CC_B) extends T_B[C, T_B[Int, CC_A]]
case class CC_E[D](a: D) extends T_B[D, T_B[Int, CC_A]]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _) => 1 
}
}
// This is not matched: CC_C()