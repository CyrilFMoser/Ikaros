package Program_15 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[D, C](a: Int) extends T_A[D, C]
case class CC_D() extends T_B

val v_a: CC_A[CC_D, Int] = null
val v_b: Int = v_a match{
  case CC_A(12) => 0 
}
}
// This is not matched: (CC_E T_B Wildcard Wildcard Wildcard T_B)