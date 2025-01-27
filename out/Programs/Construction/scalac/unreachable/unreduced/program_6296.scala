package Program_7 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, T_A[Int, C]], b: T_A[C, C]) extends T_A[C, T_A[Int, C]]
case class CC_B[D]() extends T_A[D, T_A[Int, D]]
case class CC_C[E, F](a: CC_A[E], b: T_A[T_A[E, E], T_A[Int, T_A[E, E]]]) extends T_A[E, T_A[Int, E]]

val v_a: T_A[Int, T_A[Int, Int]] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _), _) => 0 
  case CC_A(CC_B(), _) => 1 
  case CC_B() => 2 
  case CC_C(CC_A(CC_A(_, _), _), CC_A(_, _)) => 3 
  case CC_C(CC_A(CC_A(_, _), _), CC_B()) => 4 
  case CC_C(CC_A(CC_A(_, _), _), CC_C(_, _)) => 5 
  case CC_C(CC_A(CC_B(), _), CC_A(_, _)) => 6 
  case CC_C(CC_A(CC_B(), _), CC_B()) => 7 
  case CC_C(CC_A(CC_B(), _), CC_C(_, _)) => 8 
  case CC_C(CC_A(CC_C(_, _), _), CC_A(_, _)) => 9 
  case CC_C(CC_A(CC_C(_, _), _), CC_B()) => 10 
  case CC_C(CC_A(CC_C(_, _), _), CC_C(_, _)) => 11 
}
}
// This is not matched: CC_A(CC_C(_, _), _)