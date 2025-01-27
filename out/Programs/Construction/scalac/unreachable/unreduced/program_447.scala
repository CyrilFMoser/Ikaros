package Program_19 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D](a: D, b: D, c: C) extends T_A[C, T_A[C, C]]
case class CC_B[E](a: E, b: T_A[E, T_A[E, E]], c: T_A[E, E]) extends T_A[E, T_A[T_A[E, Byte], E]]
case class CC_C[F](a: T_A[F, T_A[F, F]], b: T_A[F, T_A[F, F]]) extends T_A[F, T_A[T_A[F, Byte], F]]

val v_a: T_A[Char, T_A[T_A[Char, Byte], Char]] = null
val v_b: Int = v_a match{
  case CC_B(_, CC_A(_, _, _), _) => 0 
  case CC_C(CC_A(_, _, _), CC_A(_, _, _)) => 1 
}
}