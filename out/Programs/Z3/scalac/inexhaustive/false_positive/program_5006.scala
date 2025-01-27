package Program_11 

object Test {
sealed trait T_A[A]
case class CC_B[C](a: T_A[C]) extends T_A[C]
case class CC_C[D]() extends T_A[D]

val v_a: CC_B[Char] = null
val v_b: Int = v_a match{
  case CC_B(CC_B(_)) => 0 
}
}
// This is not matched: (CC_C Wildcard Wildcard Wildcard T_A)