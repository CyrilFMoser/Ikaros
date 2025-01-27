package Program_31 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D](a: D) extends T_A[D, C]

val v_a: CC_A[Boolean, Int] = null
val v_b: Int = v_a match{
  case CC_A(12) => 0 
}
}
// This is not matched: (CC_C Wildcard Wildcard Wildcard T_B)