package Program_24 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[T_A[T_A[(Int,Byte), Boolean], Boolean], Boolean], b: T_A[C, Boolean]) extends T_A[C, Boolean]
case class CC_B[E](a: T_A[E, Boolean], b: T_A[E, E], c: CC_A[E]) extends T_A[E, Boolean]
case class CC_C[F](a: T_A[F, Boolean], b: T_A[F, Boolean]) extends T_A[F, Boolean]

val v_a: T_A[Char, Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(CC_A(_, _), _, CC_A(_, _)) => 1 
  case CC_B(CC_B(_, _, _), _, CC_A(_, _)) => 2 
  case CC_B(CC_C(_, _), _, CC_A(_, _)) => 3 
  case CC_C(CC_A(_, _), CC_A(_, _)) => 4 
  case CC_C(CC_B(_, _, _), CC_A(_, _)) => 5 
  case CC_C(CC_C(_, _), CC_A(_, _)) => 6 
  case CC_C(CC_A(_, _), CC_B(_, _, _)) => 7 
  case CC_C(CC_B(_, _, _), CC_B(_, _, _)) => 8 
  case CC_C(CC_A(_, _), CC_C(_, _)) => 9 
  case CC_C(CC_B(_, _, _), CC_C(_, _)) => 10 
  case CC_C(CC_C(_, _), CC_C(_, _)) => 11 
}
}
// This is not matched: CC_C(CC_C(_, _), CC_B(_, _, _))