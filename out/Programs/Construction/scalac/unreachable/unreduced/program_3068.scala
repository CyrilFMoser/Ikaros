package Program_1 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C]) extends T_A[T_A[C, C], C]
case class CC_B[D](a: CC_A[D], b: Char, c: T_A[T_A[D, D], D]) extends T_A[T_A[D, D], D]
case class CC_C[E](a: T_A[T_A[E, E], E], b: E, c: T_A[T_A[E, E], E]) extends T_A[T_A[E, E], E]

val v_a: T_A[T_A[Int, Int], Int] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(CC_A(_), _, _) => 1 
  case CC_C(CC_A(_), _, CC_A(_)) => 2 
  case CC_C(CC_B(_, _, _), _, CC_A(_)) => 3 
  case CC_C(CC_C(CC_A(_), _, _), _, CC_A(_)) => 4 
  case CC_C(CC_C(CC_B(_, _, _), _, _), _, CC_A(_)) => 5 
  case CC_C(CC_C(CC_C(_, _, _), _, _), _, CC_A(_)) => 6 
  case CC_C(CC_A(_), _, CC_B(CC_A(_), _, CC_A(_))) => 7 
  case CC_C(CC_B(_, _, _), _, CC_B(CC_A(_), _, CC_A(_))) => 8 
  case CC_C(CC_C(CC_A(_), _, _), _, CC_B(CC_A(_), _, CC_A(_))) => 9 
  case CC_C(CC_C(CC_B(_, _, _), _, _), _, CC_B(CC_A(_), _, CC_A(_))) => 10 
  case CC_C(CC_C(CC_C(_, _, _), _, _), _, CC_B(CC_A(_), _, CC_A(_))) => 11 
  case CC_C(CC_A(_), _, CC_B(CC_A(_), _, CC_B(_, _, _))) => 12 
  case CC_C(CC_B(_, _, _), _, CC_B(CC_A(_), _, CC_B(_, _, _))) => 13 
  case CC_C(CC_C(CC_A(_), _, _), _, CC_B(CC_A(_), _, CC_B(_, _, _))) => 14 
  case CC_C(CC_C(CC_B(_, _, _), _, _), _, CC_B(CC_A(_), _, CC_B(_, _, _))) => 15 
  case CC_C(CC_C(CC_C(_, _, _), _, _), _, CC_B(CC_A(_), _, CC_B(_, _, _))) => 16 
  case CC_C(CC_A(_), _, CC_B(CC_A(_), _, CC_C(_, _, _))) => 17 
  case CC_C(CC_B(_, _, _), _, CC_B(CC_A(_), _, CC_C(_, _, _))) => 18 
  case CC_C(CC_C(CC_A(_), _, _), _, CC_B(CC_A(_), _, CC_C(_, _, _))) => 19 
  case CC_C(CC_C(CC_B(_, _, _), _, _), _, CC_B(CC_A(_), _, CC_C(_, _, _))) => 20 
  case CC_C(CC_C(CC_C(_, _, _), _, _), _, CC_B(CC_A(_), _, CC_C(_, _, _))) => 21 
  case CC_C(CC_A(_), _, CC_C(_, _, _)) => 22 
  case CC_C(CC_B(_, _, _), _, CC_C(_, _, _)) => 23 
  case CC_C(CC_C(CC_A(_), _, _), _, CC_C(_, _, _)) => 24 
  case CC_C(CC_C(CC_B(_, _, _), _, _), _, CC_C(_, _, _)) => 25 
  case CC_C(CC_C(CC_C(_, _, _), _, _), _, CC_C(_, _, _)) => 26 
}
}