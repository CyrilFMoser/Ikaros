package Program_25 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_B[D], b: T_A[T_B[T_A[Char, Char]], T_A[Char, Char]]) extends T_A[T_B[D], D]
case class CC_B[F](a: T_A[F, F], b: T_A[T_B[F], F], c: CC_A[F]) extends T_A[T_B[F], F]
case class CC_C[G](a: CC_B[G], b: T_A[G, G], c: T_B[G]) extends T_A[T_B[G], G]

val v_a: T_A[T_B[Int], Int] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, CC_A(_, _))) => 0 
  case CC_A(_, CC_A(_, CC_B(_, _, _))) => 1 
  case CC_A(_, CC_A(_, CC_C(_, _, _))) => 2 
  case CC_A(_, CC_B(_, CC_A(_, _), CC_A(_, _))) => 3 
  case CC_A(_, CC_B(_, CC_B(_, _, _), CC_A(_, _))) => 4 
  case CC_A(_, CC_B(_, CC_C(_, _, _), CC_A(_, _))) => 5 
  case CC_A(_, CC_C(_, _, _)) => 6 
  case CC_B(_, CC_A(_, _), CC_A(_, CC_A(_, _))) => 7 
  case CC_B(_, CC_B(_, CC_A(_, _), CC_A(_, _)), CC_A(_, CC_A(_, _))) => 8 
  case CC_B(_, CC_B(_, CC_B(_, _, _), CC_A(_, _)), CC_A(_, CC_A(_, _))) => 9 
  case CC_B(_, CC_B(_, CC_C(_, _, _), CC_A(_, _)), CC_A(_, CC_A(_, _))) => 10 
  case CC_B(_, CC_C(CC_B(_, _, _), _, _), CC_A(_, CC_A(_, _))) => 11 
  case CC_B(_, CC_A(_, _), CC_A(_, CC_B(_, _, _))) => 12 
  case CC_B(_, CC_B(_, CC_A(_, _), CC_A(_, _)), CC_A(_, CC_B(_, _, _))) => 13 
  case CC_B(_, CC_B(_, CC_B(_, _, _), CC_A(_, _)), CC_A(_, CC_B(_, _, _))) => 14 
  case CC_B(_, CC_B(_, CC_C(_, _, _), CC_A(_, _)), CC_A(_, CC_B(_, _, _))) => 15 
  case CC_B(_, CC_C(CC_B(_, _, _), _, _), CC_A(_, CC_B(_, _, _))) => 16 
  case CC_B(_, CC_A(_, _), CC_A(_, CC_C(_, _, _))) => 17 
  case CC_B(_, CC_B(_, CC_A(_, _), CC_A(_, _)), CC_A(_, CC_C(_, _, _))) => 18 
  case CC_B(_, CC_B(_, CC_C(_, _, _), CC_A(_, _)), CC_A(_, CC_C(_, _, _))) => 19 
  case CC_B(_, CC_C(CC_B(_, _, _), _, _), CC_A(_, CC_C(_, _, _))) => 20 
  case CC_C(_, _, _) => 21 
}
}
// This is not matched: CC_B(_, CC_B(_, CC_B(_, _, _), CC_A(_, _)), CC_A(_, CC_C(_, _, _)))