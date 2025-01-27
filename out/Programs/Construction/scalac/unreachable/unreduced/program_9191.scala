package Program_0 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: Boolean, b: T_A[D], c: T_B[D, D]) extends T_A[D]
case class CC_B[E](a: Int, b: T_A[E]) extends T_A[E]
case class CC_C(a: T_B[T_A[Int], T_A[Int]], b: T_A[T_A[Char]], c: CC_A[Boolean]) extends T_A[Char]
case class CC_D[F](a: T_A[F], b: T_A[Char]) extends T_B[T_B[T_A[Char], T_A[Int]], F]
case class CC_E(a: CC_C, b: T_A[CC_D[CC_C]], c: T_A[T_A[Char]]) extends T_B[T_B[T_A[Char], T_A[Int]], CC_C]
case class CC_F[G](a: CC_C, b: T_A[G], c: CC_C) extends T_B[T_B[T_A[Char], T_A[Int]], G]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, CC_A(_, _, _), _), _) => 0 
  case CC_A(_, CC_A(_, CC_B(_, _), _), _) => 1 
  case CC_A(_, CC_A(_, CC_C(_, _, _), _), _) => 2 
  case CC_A(_, CC_B(_, CC_A(_, _, _)), _) => 3 
  case CC_A(_, CC_B(_, CC_B(_, _)), _) => 4 
  case CC_A(_, CC_C(_, _, _), _) => 5 
  case CC_B(_, CC_A(_, _, _)) => 6 
  case CC_B(_, CC_B(_, CC_A(_, _, _))) => 7 
  case CC_B(_, CC_B(_, CC_B(_, _))) => 8 
  case CC_B(_, CC_B(_, CC_C(_, _, _))) => 9 
  case CC_B(_, CC_C(_, CC_A(_, _, _), _)) => 10 
  case CC_B(_, CC_C(_, CC_B(_, _), _)) => 11 
  case CC_C(_, CC_A(_, CC_A(_, _, _), _), _) => 12 
  case CC_C(_, CC_A(_, CC_B(_, _), _), _) => 13 
  case CC_C(_, CC_B(_, _), _) => 14 
}
}
// This is not matched: CC_A(_, CC_B(_, CC_C(_, _, _)), _)