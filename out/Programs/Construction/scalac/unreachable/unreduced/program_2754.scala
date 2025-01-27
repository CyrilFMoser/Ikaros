package Program_25 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_A[T_B[Boolean, Byte], E], b: T_A[E, E], c: T_A[T_B[Boolean, Byte], T_A[Char, Char]]) extends T_A[T_B[Boolean, Byte], E]
case class CC_B[G](a: T_A[T_B[Boolean, Byte], G]) extends T_A[T_B[Boolean, Byte], G]

val v_a: T_A[T_B[Boolean, Byte], Char] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_, _, _), _, _), _, CC_A(CC_A(_, _, _), _, CC_A(_, _, _))) => 0 
  case CC_A(CC_A(CC_A(_, _, _), _, _), _, CC_A(CC_B(_), _, CC_A(_, _, _))) => 1 
  case CC_A(CC_A(CC_A(_, _, _), _, _), _, CC_A(CC_A(_, _, _), _, CC_B(_))) => 2 
  case CC_A(CC_A(CC_A(_, _, _), _, _), _, CC_A(CC_B(_), _, CC_B(_))) => 3 
  case CC_A(CC_A(CC_A(_, _, _), _, _), _, CC_B(CC_A(_, _, _))) => 4 
  case CC_A(CC_A(CC_A(_, _, _), _, _), _, CC_B(CC_B(_))) => 5 
  case CC_A(CC_A(CC_B(_), _, _), _, CC_A(CC_A(_, _, _), _, CC_A(_, _, _))) => 6 
  case CC_A(CC_A(CC_B(_), _, _), _, CC_A(CC_B(_), _, CC_A(_, _, _))) => 7 
  case CC_A(CC_A(CC_B(_), _, _), _, CC_A(CC_A(_, _, _), _, CC_B(_))) => 8 
  case CC_A(CC_A(CC_B(_), _, _), _, CC_A(CC_B(_), _, CC_B(_))) => 9 
  case CC_A(CC_A(CC_B(_), _, _), _, CC_B(CC_A(_, _, _))) => 10 
  case CC_A(CC_A(CC_B(_), _, _), _, CC_B(CC_B(_))) => 11 
  case CC_A(CC_B(CC_A(_, _, _)), _, CC_A(CC_A(_, _, _), _, CC_A(_, _, _))) => 12 
  case CC_A(CC_B(CC_A(_, _, _)), _, CC_A(CC_B(_), _, CC_A(_, _, _))) => 13 
  case CC_A(CC_B(CC_A(_, _, _)), _, CC_A(CC_A(_, _, _), _, CC_B(_))) => 14 
  case CC_A(CC_B(CC_A(_, _, _)), _, CC_A(CC_B(_), _, CC_B(_))) => 15 
  case CC_A(CC_B(CC_A(_, _, _)), _, CC_B(CC_A(_, _, _))) => 16 
  case CC_A(CC_B(CC_A(_, _, _)), _, CC_B(CC_B(_))) => 17 
  case CC_A(CC_B(CC_B(_)), _, CC_A(CC_A(_, _, _), _, CC_A(_, _, _))) => 18 
  case CC_A(CC_B(CC_B(_)), _, CC_A(CC_B(_), _, CC_A(_, _, _))) => 19 
  case CC_A(CC_B(CC_B(_)), _, CC_A(CC_A(_, _, _), _, CC_B(_))) => 20 
  case CC_A(CC_B(CC_B(_)), _, CC_A(CC_B(_), _, CC_B(_))) => 21 
  case CC_A(CC_B(CC_B(_)), _, CC_B(CC_A(_, _, _))) => 22 
  case CC_A(CC_B(CC_B(_)), _, CC_B(CC_B(_))) => 23 
  case CC_B(CC_A(CC_A(_, _, _), _, CC_A(_, _, _))) => 24 
  case CC_B(CC_A(CC_B(_), _, CC_A(_, _, _))) => 25 
  case CC_B(CC_A(CC_A(_, _, _), _, CC_B(_))) => 26 
  case CC_B(CC_A(CC_B(_), _, CC_B(_))) => 27 
  case CC_B(CC_B(_)) => 28 
}
}