package Program_31 

object Test {
sealed trait T_A[A, B]
case class CC_A[D, C](a: D) extends T_A[C, D]

val v_a: CC_A[Int, Byte] = null
val v_b: Int = v_a match{
  case CC_A(12) => 0 
}
}
// This is not matched: (CC_B Wildcard Wildcard (CC_B (CC_A T_A) (CC_A T_A) Wildcard T_A) T_A)