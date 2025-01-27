package Program_26 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_A[E, T_A[E, E]]) extends T_A[E, ((Boolean,(Char,Char)),T_A[Boolean, Boolean])]
case class CC_B[F](a: F, b: T_A[F, F], c: CC_A[F]) extends T_B[T_A[Char, CC_A[Byte]], F]
case class CC_C[H, G](a: CC_B[G], b: ((Int,Char),T_B[Char, Int]), c: CC_B[G]) extends T_B[H, G]
case class CC_D[I](a: T_B[I, I], b: CC_A[I], c: CC_B[I]) extends T_B[T_A[Char, CC_A[Byte]], I]

val v_a: T_B[T_A[Char, CC_A[Byte]], Char] = null
val v_b: Int = v_a match{
  case CC_B(_, _, _) => 0 
  case CC_C(_, _, _) => 1 
  case CC_D(CC_C(_, _, _), CC_A(_), _) => 2 
}
}