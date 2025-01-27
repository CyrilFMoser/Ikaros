package Program_29 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_A[T_A[Boolean]], b: T_B[T_A[Char], T_A[Byte]]) extends T_A[T_A[T_A[(Int,Int)]]]
case class CC_B() extends T_A[T_A[T_A[(Int,Int)]]]
case class CC_C(a: (T_A[CC_A],CC_B), b: T_B[T_B[CC_A, CC_A], Boolean]) extends T_A[T_A[T_A[(Int,Int)]]]
case class CC_D[E, D](a: T_B[D, D], b: D, c: CC_B) extends T_B[E, D]
case class CC_E[G, F](a: CC_A) extends T_B[G, F]
case class CC_F[I, H](a: T_B[I, H], b: CC_E[I, T_A[H]], c: CC_A) extends T_B[H, I]

val v_a: T_B[T_A[T_A[T_A[(Int,Int)]]], Boolean] = null
val v_b: Int = v_a match{
  case CC_D(_, true, _) => 0 
  case CC_D(_, false, _) => 1 
  case CC_E(_) => 2 
  case CC_F(CC_D(CC_D(_, _, _), CC_A(_, _), CC_B()), CC_E(CC_A(_, _)), CC_A(_, CC_D(_, _, _))) => 3 
  case CC_F(CC_D(CC_D(_, _, _), CC_B(), CC_B()), CC_E(CC_A(_, _)), CC_A(_, CC_D(_, _, _))) => 4 
  case CC_F(CC_D(CC_D(_, _, _), CC_C(_, _), CC_B()), CC_E(CC_A(_, _)), CC_A(_, CC_D(_, _, _))) => 5 
  case CC_F(CC_D(CC_E(_), CC_A(_, _), CC_B()), CC_E(CC_A(_, _)), CC_A(_, CC_D(_, _, _))) => 6 
  case CC_F(CC_D(CC_E(_), CC_B(), CC_B()), CC_E(CC_A(_, _)), CC_A(_, CC_D(_, _, _))) => 7 
  case CC_F(CC_D(CC_E(_), CC_C(_, _), CC_B()), CC_E(CC_A(_, _)), CC_A(_, CC_D(_, _, _))) => 8 
  case CC_F(CC_D(CC_F(_, _, _), CC_A(_, _), CC_B()), CC_E(CC_A(_, _)), CC_A(_, CC_D(_, _, _))) => 9 
  case CC_F(CC_D(CC_F(_, _, _), CC_B(), CC_B()), CC_E(CC_A(_, _)), CC_A(_, CC_D(_, _, _))) => 10 
  case CC_F(CC_D(CC_F(_, _, _), CC_C(_, _), CC_B()), CC_E(CC_A(_, _)), CC_A(_, CC_D(_, _, _))) => 11 
  case CC_F(CC_E(CC_A(_, _)), CC_E(CC_A(_, _)), CC_A(_, CC_D(_, _, _))) => 12 
  case CC_F(CC_F(_, CC_E(_), _), CC_E(CC_A(_, _)), CC_A(_, CC_D(_, _, _))) => 13 
  case CC_F(CC_D(CC_D(_, _, _), CC_A(_, _), CC_B()), CC_E(CC_A(_, _)), CC_A(_, CC_E(_))) => 14 
  case CC_F(CC_D(CC_D(_, _, _), CC_B(), CC_B()), CC_E(CC_A(_, _)), CC_A(_, CC_E(_))) => 15 
  case CC_F(CC_D(CC_D(_, _, _), CC_C(_, _), CC_B()), CC_E(CC_A(_, _)), CC_A(_, CC_E(_))) => 16 
  case CC_F(CC_D(CC_E(_), CC_A(_, _), CC_B()), CC_E(CC_A(_, _)), CC_A(_, CC_E(_))) => 17 
  case CC_F(CC_D(CC_E(_), CC_B(), CC_B()), CC_E(CC_A(_, _)), CC_A(_, CC_E(_))) => 18 
  case CC_F(CC_D(CC_E(_), CC_C(_, _), CC_B()), CC_E(CC_A(_, _)), CC_A(_, CC_E(_))) => 19 
  case CC_F(CC_D(CC_F(_, _, _), CC_A(_, _), CC_B()), CC_E(CC_A(_, _)), CC_A(_, CC_E(_))) => 20 
  case CC_F(CC_D(CC_F(_, _, _), CC_B(), CC_B()), CC_E(CC_A(_, _)), CC_A(_, CC_E(_))) => 21 
  case CC_F(CC_D(CC_F(_, _, _), CC_C(_, _), CC_B()), CC_E(CC_A(_, _)), CC_A(_, CC_E(_))) => 22 
  case CC_F(CC_E(CC_A(_, _)), CC_E(CC_A(_, _)), CC_A(_, CC_E(_))) => 23 
  case CC_F(CC_F(_, CC_E(_), _), CC_E(CC_A(_, _)), CC_A(_, CC_E(_))) => 24 
  case CC_F(CC_D(CC_D(_, _, _), CC_A(_, _), CC_B()), CC_E(CC_A(_, _)), CC_A(_, CC_F(_, _, _))) => 25 
  case CC_F(CC_D(CC_D(_, _, _), CC_B(), CC_B()), CC_E(CC_A(_, _)), CC_A(_, CC_F(_, _, _))) => 26 
  case CC_F(CC_D(CC_D(_, _, _), CC_C(_, _), CC_B()), CC_E(CC_A(_, _)), CC_A(_, CC_F(_, _, _))) => 27 
  case CC_F(CC_D(CC_E(_), CC_A(_, _), CC_B()), CC_E(CC_A(_, _)), CC_A(_, CC_F(_, _, _))) => 28 
  case CC_F(CC_D(CC_E(_), CC_B(), CC_B()), CC_E(CC_A(_, _)), CC_A(_, CC_F(_, _, _))) => 29 
  case CC_F(CC_D(CC_E(_), CC_C(_, _), CC_B()), CC_E(CC_A(_, _)), CC_A(_, CC_F(_, _, _))) => 30 
  case CC_F(CC_D(CC_F(_, _, _), CC_B(), CC_B()), CC_E(CC_A(_, _)), CC_A(_, CC_F(_, _, _))) => 31 
  case CC_F(CC_D(CC_F(_, _, _), CC_C(_, _), CC_B()), CC_E(CC_A(_, _)), CC_A(_, CC_F(_, _, _))) => 32 
  case CC_F(CC_E(CC_A(_, _)), CC_E(CC_A(_, _)), CC_A(_, CC_F(_, _, _))) => 33 
  case CC_F(CC_F(_, CC_E(_), _), CC_E(CC_A(_, _)), CC_A(_, CC_F(_, _, _))) => 34 
}
}
// This is not matched: CC_F(CC_D(CC_F(_, _, _), CC_A(_, _), CC_B()), CC_E(CC_A(_, _)), CC_A(_, CC_F(_, _, _)))