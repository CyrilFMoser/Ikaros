package Program_29 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, T_A[Byte, Char]], b: T_A[C, C], c: T_A[T_A[T_A[Byte, (Byte,Char)], T_A[Byte, (Byte,Char)]], T_A[Byte, Char]]) extends T_A[C, T_A[Byte, Char]]
case class CC_B[E](a: T_A[E, T_A[Byte, Char]]) extends T_A[E, T_A[Byte, Char]]

val v_a: T_A[Boolean, T_A[Byte, Char]] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_, _, _), _, _), _, CC_A(_, _, _)) => 0 
  case CC_A(CC_A(CC_A(_, _, _), _, _), _, CC_B(CC_A(_, _, _))) => 1 
  case CC_A(CC_A(CC_A(_, _, _), _, _), _, CC_B(CC_B(_))) => 2 
  case CC_A(CC_A(CC_B(_), _, _), _, CC_A(_, _, _)) => 3 
  case CC_A(CC_A(CC_B(_), _, _), _, CC_B(CC_A(_, _, _))) => 4 
  case CC_A(CC_A(CC_B(_), _, _), _, CC_B(CC_B(_))) => 5 
  case CC_A(CC_B(_), _, CC_A(_, _, _)) => 6 
  case CC_A(CC_B(_), _, CC_B(CC_A(_, _, _))) => 7 
  case CC_A(CC_B(_), _, CC_B(CC_B(_))) => 8 
  case CC_B(_) => 9 
}
}