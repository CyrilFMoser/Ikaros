package Program_22 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: E, b: T_A[E, Int]) extends T_A[E, T_A[T_B[(Int,Char), Int], T_B[Boolean, Byte]]]
case class CC_B[F](a: T_A[F, T_B[F, F]]) extends T_B[T_B[F, F], F]
case class CC_C[G, H](a: CC_A[G], b: T_B[H, H], c: CC_B[G]) extends T_B[G, H]
case class CC_D[I, J](a: J, b: T_B[I, I]) extends T_B[I, J]

val v_a: T_B[T_B[Char, Char], Char] = null
val v_b: Int = v_a match{
  case CC_B(_) => 0 
  case CC_C(CC_A(CC_C(_, _, _), _), CC_C(CC_A(_, _), CC_C(_, _, _), CC_B(_)), _) => 1 
  case CC_C(CC_A(CC_C(_, _, _), _), CC_C(CC_A(_, _), CC_D(_, _), CC_B(_)), _) => 2 
  case CC_C(CC_A(CC_C(_, _, _), _), CC_D(_, CC_C(_, _, _)), _) => 3 
  case CC_C(CC_A(CC_C(_, _, _), _), CC_D(_, CC_D(_, _)), _) => 4 
  case CC_C(CC_A(CC_D(_, _), _), CC_C(CC_A(_, _), CC_C(_, _, _), CC_B(_)), _) => 5 
  case CC_C(CC_A(CC_D(_, _), _), CC_C(CC_A(_, _), CC_D(_, _), CC_B(_)), _) => 6 
  case CC_C(CC_A(CC_D(_, _), _), CC_D(_, CC_C(_, _, _)), _) => 7 
  case CC_C(CC_A(CC_D(_, _), _), CC_D(_, CC_D(_, _)), _) => 8 
  case CC_D(_, CC_C(CC_A(_, _), CC_C(_, _, _), CC_B(_))) => 9 
  case CC_D(_, CC_C(CC_A(_, _), CC_D(_, _), CC_B(_))) => 10 
  case CC_D(_, CC_D(CC_C(_, _, _), CC_C(_, _, _))) => 11 
  case CC_D(_, CC_D(CC_C(_, _, _), CC_D(_, _))) => 12 
  case CC_D(_, CC_D(CC_D(_, _), CC_C(_, _, _))) => 13 
  case CC_D(_, CC_D(CC_D(_, _), CC_D(_, _))) => 14 
}
}