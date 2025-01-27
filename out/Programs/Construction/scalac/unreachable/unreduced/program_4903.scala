package Program_10 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, Char], b: T_A[T_A[Char, Int], C]) extends T_A[T_A[Char, Int], C]
case class CC_B[D](a: T_A[T_A[Char, Int], D]) extends T_A[T_A[Char, Int], D]
case class CC_C[E](a: T_A[T_A[Char, Int], E], b: E, c: E) extends T_A[T_A[Char, Int], E]

val v_a: T_A[T_A[Char, Int], Int] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(CC_A(_, CC_A(_, _))) => 1 
  case CC_B(CC_A(_, CC_B(_))) => 2 
  case CC_B(CC_A(_, CC_C(_, _, _))) => 3 
  case CC_B(CC_B(CC_A(_, _))) => 4 
  case CC_B(CC_B(CC_C(_, _, _))) => 5 
  case CC_B(CC_C(CC_A(_, _), _, _)) => 6 
  case CC_B(CC_C(CC_B(_), _, _)) => 7 
  case CC_B(CC_C(CC_C(_, _, _), _, _)) => 8 
  case CC_C(CC_A(_, CC_A(_, _)), _, _) => 9 
  case CC_C(CC_A(_, CC_B(_)), _, _) => 10 
  case CC_C(CC_A(_, CC_C(_, _, _)), _, _) => 11 
  case CC_C(CC_B(CC_A(_, _)), _, _) => 12 
  case CC_C(CC_B(CC_B(_)), _, _) => 13 
  case CC_C(CC_B(CC_C(_, _, _)), _, _) => 14 
  case CC_C(CC_C(_, _, 12), _, _) => 15 
  case CC_C(CC_C(_, _, _), _, _) => 16 
}
}
// This is not matched: CC_B(CC_B(CC_B(_)))