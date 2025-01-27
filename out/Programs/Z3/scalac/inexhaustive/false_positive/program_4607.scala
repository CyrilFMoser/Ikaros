package Program_10 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_C[I, H](a: I) extends T_B[I, H]

val v_a: CC_C[Int, Boolean] = null
val v_b: Int = v_a match{
  case CC_C(12) => 0 
}
}
// This is not matched: (CC_B T_B Wildcard Wildcard T_B)