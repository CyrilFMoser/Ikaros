package Program_27 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, T_A[C, C]], b: C, c: T_A[C, T_A[C, C]]) extends T_A[C, T_A[C, C]]
case class CC_B() extends T_A[T_A[T_A[Byte, Char], T_A[T_A[Byte, Char], T_A[Byte, Char]]], T_A[T_A[T_A[Byte, Char], T_A[T_A[Byte, Char], T_A[Byte, Char]]], T_A[T_A[Byte, Char], T_A[T_A[Byte, Char], T_A[Byte, Char]]]]]

val v_a: T_A[T_A[T_A[Byte, Char], T_A[T_A[Byte, Char], T_A[Byte, Char]]], T_A[T_A[T_A[Byte, Char], T_A[T_A[Byte, Char], T_A[Byte, Char]]], T_A[T_A[Byte, Char], T_A[T_A[Byte, Char], T_A[Byte, Char]]]]] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _, _), CC_A(CC_A(_, _, _), _, _), CC_A(CC_A(_, _, _), _, _)) => 0 
  case CC_A(CC_A(_, _, _), CC_A(CC_A(_, _, _), _, _), CC_A(CC_B(), _, _)) => 1 
  case CC_A(CC_A(_, _, _), CC_A(CC_A(_, _, _), _, _), CC_B()) => 2 
  case CC_A(CC_B(), CC_A(CC_A(_, _, _), _, _), CC_A(CC_A(_, _, _), _, _)) => 3 
  case CC_A(CC_B(), CC_A(CC_A(_, _, _), _, _), CC_A(CC_B(), _, _)) => 4 
  case CC_A(CC_B(), CC_A(CC_A(_, _, _), _, _), CC_B()) => 5 
  case CC_B() => 6 
}
}