package Program_13 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_B[T_A[Char]]) extends T_A[Char]
case class CC_B(a: CC_A, b: T_A[T_A[Char]], c: T_A[Char]) extends T_A[Char]
case class CC_C(a: CC_A, b: T_B[CC_A], c: T_A[Byte]) extends T_A[Char]
case class CC_D[C](a: T_A[Char], b: C) extends T_B[C]
case class CC_E[D]() extends T_B[D]
case class CC_F[E]() extends T_B[E]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_A(CC_D(CC_A(_), _)) => 0 
  case CC_A(CC_D(CC_B(_, _, _), _)) => 1 
  case CC_A(CC_D(CC_C(_, _, _), _)) => 2 
  case CC_A(CC_E()) => 3 
  case CC_A(CC_F()) => 4 
  case CC_B(CC_A(_), _, CC_A(_)) => 5 
  case CC_B(CC_A(_), _, CC_B(_, _, CC_A(_))) => 6 
  case CC_B(CC_A(_), _, CC_B(_, _, CC_B(_, _, _))) => 7 
  case CC_B(CC_A(_), _, CC_B(_, _, CC_C(_, _, _))) => 8 
  case CC_B(CC_A(_), _, CC_C(CC_A(_), CC_D(_, _), _)) => 9 
  case CC_B(CC_A(_), _, CC_C(CC_A(_), CC_E(), _)) => 10 
  case CC_B(CC_A(_), _, CC_C(CC_A(_), CC_F(), _)) => 11 
  case CC_C(_, CC_D(CC_A(_), CC_A(_)), _) => 12 
  case CC_C(_, CC_D(CC_B(_, _, _), CC_A(_)), _) => 13 
  case CC_C(_, CC_D(CC_C(_, _, _), CC_A(_)), _) => 14 
  case CC_C(_, CC_E(), _) => 15 
  case CC_C(_, CC_F(), _) => 16 
}
}