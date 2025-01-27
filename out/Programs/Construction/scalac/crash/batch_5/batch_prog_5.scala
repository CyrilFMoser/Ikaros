package Program_5 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_B) extends T_A[Byte, C]
case class CC_B[D, E](a: D, b: E, c: Byte) extends T_A[D, E]
case class CC_C[F](a: T_A[F, F]) extends T_A[Byte, F]

val v_a: CC_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
}
}