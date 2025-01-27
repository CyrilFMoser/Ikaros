package Program_30 

object Test {
sealed trait T_A[A, B]
case class CC_A[D](a: Byte) extends T_A[D, T_A[D, D]]

val v_a: CC_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A(0) => 0 
}
}
// This is not matched: (CC_C Wildcard Wildcard Wildcard T_A)