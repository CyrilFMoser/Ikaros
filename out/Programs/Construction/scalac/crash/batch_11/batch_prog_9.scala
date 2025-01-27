package Program_9 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_A[T_A[D, D], D], b: Int, c: T_B[D]) extends T_A[T_B[T_B[D]], D]
case class CC_B[E](a: E) extends T_A[T_B[T_B[E]], E]
case class CC_C[F](a: T_A[F, F]) extends T_A[T_B[T_B[F]], F]
case class CC_D[G](a: T_B[G], b: T_B[T_A[CC_A[(Byte,Boolean)], CC_A[(Byte,Boolean)]]]) extends T_B[G]
case class CC_E[I](a: T_B[I], b: I, c: CC_C[I]) extends T_B[I]
case class CC_F[J]() extends T_B[J]

val v_a: T_B[Char] = null
val v_b: Int = v_a match{
  case CC_D(CC_D(_, CC_D(_, _)), CC_D(CC_D(_, _), CC_D(_, _))) => 0 
  case CC_D(CC_D(_, CC_E(_, _, _)), CC_D(CC_D(_, _), CC_D(_, _))) => 1 
  case CC_D(CC_D(_, CC_F()), CC_D(CC_D(_, _), CC_D(_, _))) => 2 
  case CC_D(CC_E(_, _, _), CC_D(CC_D(_, _), CC_D(_, _))) => 3 
  case CC_D(CC_F(), CC_D(CC_D(_, _), CC_D(_, _))) => 4 
  case CC_D(CC_D(_, CC_D(_, _)), CC_D(CC_D(_, _), CC_E(_, _, _))) => 5 
  case CC_D(CC_D(_, CC_E(_, _, _)), CC_D(CC_D(_, _), CC_E(_, _, _))) => 6 
  case CC_D(CC_D(_, CC_F()), CC_D(CC_D(_, _), CC_E(_, _, _))) => 7 
  case CC_D(CC_E(_, _, _), CC_D(CC_D(_, _), CC_E(_, _, _))) => 8 
  case CC_D(CC_F(), CC_D(CC_D(_, _), CC_E(_, _, _))) => 9 
  case CC_D(CC_D(_, CC_D(_, _)), CC_D(CC_D(_, _), CC_F())) => 10 
  case CC_D(CC_D(_, CC_E(_, _, _)), CC_D(CC_D(_, _), CC_F())) => 11 
  case CC_D(CC_D(_, CC_F()), CC_D(CC_D(_, _), CC_F())) => 12 
  case CC_D(CC_E(_, _, _), CC_D(CC_D(_, _), CC_F())) => 13 
  case CC_D(CC_F(), CC_D(CC_D(_, _), CC_F())) => 14 
  case CC_D(CC_D(_, CC_D(_, _)), CC_D(CC_E(_, _, _), CC_D(_, _))) => 15 
  case CC_D(CC_D(_, CC_E(_, _, _)), CC_D(CC_E(_, _, _), CC_D(_, _))) => 16 
  case CC_D(CC_D(_, CC_F()), CC_D(CC_E(_, _, _), CC_D(_, _))) => 17 
  case CC_D(CC_E(_, _, _), CC_D(CC_E(_, _, _), CC_D(_, _))) => 18 
  case CC_D(CC_F(), CC_D(CC_E(_, _, _), CC_D(_, _))) => 19 
  case CC_D(CC_D(_, CC_D(_, _)), CC_D(CC_E(_, _, _), CC_E(_, _, _))) => 20 
  case CC_D(CC_D(_, CC_E(_, _, _)), CC_D(CC_E(_, _, _), CC_E(_, _, _))) => 21 
  case CC_D(CC_D(_, CC_F()), CC_D(CC_E(_, _, _), CC_E(_, _, _))) => 22 
  case CC_D(CC_E(_, _, _), CC_D(CC_E(_, _, _), CC_E(_, _, _))) => 23 
  case CC_D(CC_F(), CC_D(CC_E(_, _, _), CC_E(_, _, _))) => 24 
  case CC_D(CC_D(_, CC_D(_, _)), CC_D(CC_E(_, _, _), CC_F())) => 25 
  case CC_D(CC_D(_, CC_E(_, _, _)), CC_D(CC_E(_, _, _), CC_F())) => 26 
  case CC_D(CC_D(_, CC_F()), CC_D(CC_E(_, _, _), CC_F())) => 27 
  case CC_D(CC_E(_, _, _), CC_D(CC_E(_, _, _), CC_F())) => 28 
  case CC_D(CC_F(), CC_D(CC_E(_, _, _), CC_F())) => 29 
  case CC_D(CC_D(_, CC_D(_, _)), CC_D(CC_F(), CC_D(_, _))) => 30 
  case CC_D(CC_D(_, CC_E(_, _, _)), CC_D(CC_F(), CC_D(_, _))) => 31 
  case CC_D(CC_D(_, CC_F()), CC_D(CC_F(), CC_D(_, _))) => 32 
  case CC_D(CC_E(_, _, _), CC_D(CC_F(), CC_D(_, _))) => 33 
  case CC_D(CC_F(), CC_D(CC_F(), CC_D(_, _))) => 34 
  case CC_D(CC_D(_, CC_D(_, _)), CC_D(CC_F(), CC_E(_, _, _))) => 35 
  case CC_D(CC_D(_, CC_E(_, _, _)), CC_D(CC_F(), CC_E(_, _, _))) => 36 
  case CC_D(CC_D(_, CC_F()), CC_D(CC_F(), CC_E(_, _, _))) => 37 
  case CC_D(CC_E(_, _, _), CC_D(CC_F(), CC_E(_, _, _))) => 38 
  case CC_D(CC_F(), CC_D(CC_F(), CC_E(_, _, _))) => 39 
  case CC_D(CC_D(_, CC_D(_, _)), CC_D(CC_F(), CC_F())) => 40 
  case CC_D(CC_D(_, CC_E(_, _, _)), CC_D(CC_F(), CC_F())) => 41 
  case CC_D(CC_D(_, CC_F()), CC_D(CC_F(), CC_F())) => 42 
  case CC_D(CC_E(_, _, _), CC_D(CC_F(), CC_F())) => 43 
  case CC_D(CC_F(), CC_D(CC_F(), CC_F())) => 44 
  case CC_D(CC_D(_, CC_D(_, _)), CC_E(_, _, _)) => 45 
  case CC_D(CC_D(_, CC_E(_, _, _)), CC_E(_, _, _)) => 46 
  case CC_D(CC_D(_, CC_F()), CC_E(_, _, _)) => 47 
  case CC_D(CC_E(_, _, _), CC_E(_, _, _)) => 48 
  case CC_D(CC_F(), CC_E(_, _, _)) => 49 
  case CC_D(CC_D(_, CC_D(_, _)), CC_F()) => 50 
  case CC_D(CC_D(_, CC_E(_, _, _)), CC_F()) => 51 
  case CC_D(CC_D(_, CC_F()), CC_F()) => 52 
  case CC_D(CC_E(_, _, _), CC_F()) => 53 
  case CC_D(CC_F(), CC_F()) => 54 
  case CC_E(_, _, CC_C(_)) => 55 
  case CC_F() => 56 
}
}