package Program_31 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_A[D, D], b: T_A[D, D], c: Boolean) extends T_A[T_B[T_A[Int, Char]], D]
case class CC_B[E](a: T_A[T_B[E], E], b: T_B[E]) extends T_A[T_B[T_A[Int, Char]], E]
case class CC_C[F](a: CC_B[CC_B[F]], b: F, c: F) extends T_A[F, T_B[CC_B[Byte]]]
case class CC_D[G](a: T_A[G, G], b: CC_B[G], c: T_B[G]) extends T_B[G]
case class CC_E[H]() extends T_B[H]
case class CC_F[I](a: T_A[I, T_A[Char, I]], b: (T_A[Int, Char],CC_B[Byte]), c: CC_B[I]) extends T_B[I]

val v_a: T_A[T_B[T_A[Int, Char]], T_B[CC_B[Byte]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(CC_C(_, _, _), CC_D(_, _, _)) => 1 
  case CC_B(CC_C(_, _, _), CC_F(_, _, _)) => 2 
  case CC_C(CC_B(_, _), CC_D(_, _, _), CC_D(_, _, _)) => 3 
  case CC_C(CC_B(_, _), CC_D(_, _, _), CC_E()) => 4 
  case CC_C(CC_B(_, _), CC_D(_, _, _), CC_F(_, _, _)) => 5 
  case CC_C(CC_B(_, _), CC_E(), CC_D(_, _, _)) => 6 
  case CC_C(CC_B(_, _), CC_E(), CC_E()) => 7 
  case CC_C(CC_B(_, _), CC_E(), CC_F(_, _, _)) => 8 
  case CC_C(CC_B(_, _), CC_F(_, _, _), CC_D(_, _, _)) => 9 
  case CC_C(CC_B(_, _), CC_F(_, _, _), CC_E()) => 10 
  case CC_C(CC_B(_, _), CC_F(_, _, _), CC_F(_, _, _)) => 11 
}
}
// This is not matched: CC_B(CC_C(_, _, _), CC_E())