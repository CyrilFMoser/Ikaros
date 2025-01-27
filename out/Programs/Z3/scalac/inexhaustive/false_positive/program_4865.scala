package Program_11 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C, D](a: D, b: T_B) extends T_A[C, D]
case class CC_C() extends T_B
case class CC_D() extends T_B

val v_a: CC_A[CC_C, T_B] = null
val v_b: Int = v_a match{
  case CC_A(CC_D(), _) => 0 
}
}
// This is not matched: (CC_A Wildcard Wildcard T_A)