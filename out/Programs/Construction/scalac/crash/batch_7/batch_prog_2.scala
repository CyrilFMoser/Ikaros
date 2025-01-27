package Program_2 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_A[E, T_A[E, E]]) extends T_A[T_B[T_B[Boolean, Int], T_B[Byte, Char]], E]
case class CC_B[F](a: CC_A[F]) extends T_A[T_B[T_B[Boolean, Int], T_B[Byte, Char]], F]
case class CC_C[G]() extends T_B[CC_A[G], G]

val v_a: CC_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
}
}