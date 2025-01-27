package Program_24 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[T_A[T_A[T_A[Char, Boolean], T_A[Char, Boolean]], T_A[T_A[Char, Boolean], T_A[Char, Boolean]]], T_A[T_A[Char, Boolean], T_A[Char, Boolean]]], b: C, c: T_A[T_A[C, C], C]) extends T_A[T_A[C, C], C]
case class CC_B[E](a: T_A[E, E], b: E, c: T_A[T_A[E, E], E]) extends T_A[T_A[E, E], E]
case class CC_C(a: T_A[T_A[Boolean, Boolean], Boolean]) extends T_A[T_A[Boolean, Boolean], Boolean]

val v_a: T_A[T_A[Boolean, Boolean], Boolean] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _, _), _, CC_A(_, _, _)) => 0 
  case CC_A(CC_B(_, _, _), _, CC_A(_, _, _)) => 1 
  case CC_A(CC_A(_, _, _), _, CC_B(_, _, _)) => 2 
  case CC_A(CC_B(_, _, _), _, CC_B(_, _, _)) => 3 
  case CC_A(CC_A(_, _, _), _, CC_C(_)) => 4 
  case CC_A(CC_B(_, _, _), _, CC_C(_)) => 5 
  case CC_B(_, _, _) => 6 
  case CC_C(_) => 7 
}
}