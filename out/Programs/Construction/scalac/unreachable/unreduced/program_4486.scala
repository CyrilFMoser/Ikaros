package Program_16 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, T_A[C, C]], b: C, c: T_A[T_A[T_A[Byte, (Int,Byte)], T_A[Byte, (Int,Byte)]], T_A[T_A[T_A[Byte, (Int,Byte)], T_A[Byte, (Int,Byte)]], T_A[T_A[Byte, (Int,Byte)], T_A[Byte, (Int,Byte)]]]]) extends T_A[C, T_A[C, C]]
case class CC_B[E](a: T_A[E, T_A[E, E]], b: CC_A[E]) extends T_A[E, T_A[E, E]]

val v_a: T_A[Char, T_A[Char, Char]] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _, _), _, CC_A(CC_A(_, _, _), _, CC_A(_, _, _))) => 0 
  case CC_A(CC_A(_, _, _), _, CC_A(CC_B(_, _), _, CC_A(_, _, _))) => 1 
  case CC_A(CC_A(_, _, _), _, CC_A(CC_A(_, _, _), _, CC_B(_, _))) => 2 
  case CC_A(CC_A(_, _, _), _, CC_A(CC_B(_, _), _, CC_B(_, _))) => 3 
  case CC_A(CC_A(_, _, _), _, CC_B(CC_A(_, _, _), CC_A(_, _, _))) => 4 
  case CC_A(CC_A(_, _, _), _, CC_B(CC_B(_, _), CC_A(_, _, _))) => 5 
  case CC_A(CC_B(CC_A(_, _, _), _), _, CC_A(CC_A(_, _, _), _, CC_A(_, _, _))) => 6 
  case CC_A(CC_B(CC_A(_, _, _), _), _, CC_A(CC_B(_, _), _, CC_A(_, _, _))) => 7 
  case CC_A(CC_B(CC_A(_, _, _), _), _, CC_A(CC_A(_, _, _), _, CC_B(_, _))) => 8 
  case CC_A(CC_B(CC_A(_, _, _), _), _, CC_A(CC_B(_, _), _, CC_B(_, _))) => 9 
  case CC_A(CC_B(CC_A(_, _, _), _), _, CC_B(CC_A(_, _, _), CC_A(_, _, _))) => 10 
  case CC_A(CC_B(CC_A(_, _, _), _), _, CC_B(CC_B(_, _), CC_A(_, _, _))) => 11 
  case CC_A(CC_B(CC_B(_, _), _), _, CC_A(CC_A(_, _, _), _, CC_A(_, _, _))) => 12 
  case CC_A(CC_B(CC_B(_, _), _), _, CC_A(CC_B(_, _), _, CC_A(_, _, _))) => 13 
  case CC_A(CC_B(CC_B(_, _), _), _, CC_A(CC_A(_, _, _), _, CC_B(_, _))) => 14 
  case CC_A(CC_B(CC_B(_, _), _), _, CC_A(CC_B(_, _), _, CC_B(_, _))) => 15 
  case CC_A(CC_B(CC_B(_, _), _), _, CC_B(CC_A(_, _, _), CC_A(_, _, _))) => 16 
  case CC_A(CC_B(CC_B(_, _), _), _, CC_B(CC_B(_, _), CC_A(_, _, _))) => 17 
  case CC_B(CC_A(CC_A(_, _, _), _, _), CC_A(CC_A(_, _, _), _, _)) => 18 
  case CC_B(CC_A(CC_B(_, _), _, _), CC_A(CC_A(_, _, _), _, _)) => 19 
  case CC_B(CC_B(_, CC_A(_, _, _)), CC_A(CC_A(_, _, _), _, _)) => 20 
  case CC_B(CC_A(CC_A(_, _, _), _, _), CC_A(CC_B(_, _), _, _)) => 21 
  case CC_B(CC_A(CC_B(_, _), _, _), CC_A(CC_B(_, _), _, _)) => 22 
  case CC_B(CC_B(_, CC_A(_, _, _)), CC_A(CC_B(_, _), _, _)) => 23 
}
}