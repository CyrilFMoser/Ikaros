package Program_31 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_B[F](a: Int, b: T_B[F, F]) extends T_B[F, T_B[F, F]]

val v_a: T_B[Byte, T_B[Byte, Byte]] = null
val v_b: Int = v_a match{
  case CC_B(12, _) => 0 
}
}
// This is not matched: (CC_A Wildcard T_A)