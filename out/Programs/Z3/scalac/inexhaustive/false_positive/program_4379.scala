package Program_14 

object Test {
sealed trait T_A[A, B]
case class CC_B[D](a: D) extends T_A[D, T_A[D, D]]

val v_a: CC_B[Byte] = null
val v_b: Int = v_a match{
  case CC_B(0) => 0 
}
}
// This is not matched: (CC_E Wildcard Wildcard (T_B (CC_C T_A T_A T_A)))