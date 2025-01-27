package Program_22 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D, E](a: Char, b: T_A[D, E], c: D) extends T_A[D, T_A[D, D]]
case class CC_B[F](a: T_A[F, F], b: Int, c: T_B[F]) extends T_A[F, T_A[F, F]]

val v_a: T_A[Byte, T_A[Byte, Byte]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_, _, _) => 1 
}
}