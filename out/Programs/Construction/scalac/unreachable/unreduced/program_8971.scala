package Program_27 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_A[E, T_B[E, E]], b: T_A[E, E]) extends T_A[E, T_B[E, E]]
case class CC_B[F](a: T_A[F, T_B[F, F]], b: T_A[F, T_B[F, F]]) extends T_A[F, T_B[F, F]]
case class CC_C[G](a: CC_B[G], b: Char, c: T_B[G, G]) extends T_A[G, T_B[G, G]]
case class CC_D[H](a: Int) extends T_B[CC_B[H], H]
case class CC_E[I](a: (T_B[Byte, Char],CC_A[Int])) extends T_B[CC_B[I], I]

val v_a: T_A[Byte, T_B[Byte, Byte]] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _), _) => 0 
  case CC_A(CC_B(_, CC_A(_, _)), _) => 1 
  case CC_A(CC_B(_, CC_B(_, _)), _) => 2 
  case CC_A(CC_B(_, CC_C(_, _, _)), _) => 3 
  case CC_A(CC_C(_, _, _), _) => 4 
  case CC_B(_, CC_A(_, _)) => 5 
  case CC_B(_, CC_B(CC_A(_, _), CC_A(_, _))) => 6 
  case CC_B(_, CC_B(CC_B(_, _), CC_A(_, _))) => 7 
  case CC_B(_, CC_B(CC_C(_, _, _), CC_A(_, _))) => 8 
  case CC_B(_, CC_B(CC_A(_, _), CC_B(_, _))) => 9 
  case CC_B(_, CC_B(CC_B(_, _), CC_B(_, _))) => 10 
  case CC_B(_, CC_B(CC_C(_, _, _), CC_B(_, _))) => 11 
  case CC_B(_, CC_B(CC_A(_, _), CC_C(_, _, _))) => 12 
  case CC_B(_, CC_B(CC_B(_, _), CC_C(_, _, _))) => 13 
  case CC_B(_, CC_B(CC_C(_, _, _), CC_C(_, _, _))) => 14 
  case CC_B(_, CC_C(_, _, _)) => 15 
  case CC_C(_, _, _) => 16 
}
}