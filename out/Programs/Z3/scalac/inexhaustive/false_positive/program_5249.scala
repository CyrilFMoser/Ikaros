package Program_15 

object Test {
sealed trait T_A[A, B]
case class CC_B[F](a: F, b: T_A[F, F]) extends T_A[T_A[Char, Int], F]

val v_a: T_A[T_A[Char, Int], Int] = null
val v_b: Int = v_a match{
  case CC_B(12, _) => 0 
}
}
// This is not matched: (CC_A Wildcard Wildcard Wildcard (T_A (T_A Byte)))