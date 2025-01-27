package Program_31 

object Test {
sealed trait T_A[A, B]
case class CC_B[D](a: D, b: T_A[D, D]) extends T_A[T_A[Byte, Byte], D]

val v_a: T_A[T_A[Byte, Byte], Int] = null
val v_b: Int = v_a match{
  case CC_B(12, _) => 0 
}
}
// This is not matched: (CC_C Wildcard T_A)