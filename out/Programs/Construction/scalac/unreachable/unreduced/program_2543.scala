package Program_4 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D, E](a: Boolean, b: D, c: T_A[E, E]) extends T_A[T_B[D], D]
case class CC_B(a: T_A[T_B[T_A[Boolean, Byte]], T_A[Boolean, Byte]], b: T_A[T_B[T_B[Char]], T_B[Char]]) extends T_A[T_B[T_A[T_B[T_B[Byte]], T_B[Byte]]], T_A[T_B[T_B[Byte]], T_B[Byte]]]
case class CC_C[F](a: F, b: Int) extends T_A[T_B[F], F]
case class CC_D[G](a: Byte, b: CC_A[G, G], c: CC_B) extends T_B[G]
case class CC_E[H]() extends T_B[H]
case class CC_F[I]() extends T_B[I]

val v_a: T_B[Char] = null
val v_b: Int = v_a match{
  case CC_D(_, CC_A(true, 'x', _), CC_B(CC_A(_, _, _), CC_A(_, _, _))) => 0 
  case CC_D(_, CC_A(true, 'x', _), CC_B(CC_A(_, _, _), CC_C(_, _))) => 1 
  case CC_D(_, CC_A(true, 'x', _), CC_B(CC_C(_, _), CC_A(_, _, _))) => 2 
  case CC_D(_, CC_A(true, 'x', _), CC_B(CC_C(_, _), CC_C(_, _))) => 3 
  case CC_D(_, CC_A(true, _, _), CC_B(CC_A(_, _, _), CC_A(_, _, _))) => 4 
  case CC_D(_, CC_A(true, _, _), CC_B(CC_A(_, _, _), CC_C(_, _))) => 5 
  case CC_D(_, CC_A(true, _, _), CC_B(CC_C(_, _), CC_A(_, _, _))) => 6 
  case CC_D(_, CC_A(true, _, _), CC_B(CC_C(_, _), CC_C(_, _))) => 7 
  case CC_D(_, CC_A(false, 'x', _), CC_B(CC_A(_, _, _), CC_A(_, _, _))) => 8 
  case CC_D(_, CC_A(false, 'x', _), CC_B(CC_A(_, _, _), CC_C(_, _))) => 9 
  case CC_D(_, CC_A(false, 'x', _), CC_B(CC_C(_, _), CC_A(_, _, _))) => 10 
  case CC_D(_, CC_A(false, 'x', _), CC_B(CC_C(_, _), CC_C(_, _))) => 11 
  case CC_D(_, CC_A(false, _, _), CC_B(CC_A(_, _, _), CC_A(_, _, _))) => 12 
  case CC_D(_, CC_A(false, _, _), CC_B(CC_A(_, _, _), CC_C(_, _))) => 13 
  case CC_D(_, CC_A(false, _, _), CC_B(CC_C(_, _), CC_A(_, _, _))) => 14 
  case CC_D(_, CC_A(false, _, _), CC_B(CC_C(_, _), CC_C(_, _))) => 15 
  case CC_E() => 16 
  case CC_F() => 17 
}
}