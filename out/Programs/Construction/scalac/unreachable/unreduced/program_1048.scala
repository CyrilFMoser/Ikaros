package Program_27 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, T_A[C, C]], b: T_A[C, T_A[C, C]]) extends T_A[C, T_A[C, C]]
case class CC_B[D](a: CC_A[CC_A[D]], b: D, c: (T_A[Byte, Boolean],CC_A[Int])) extends T_A[D, T_A[D, D]]
case class CC_C(a: T_A[Char, T_A[Char, Char]], b: T_A[T_A[Char, Char], T_A[T_A[Char, Char], T_A[Char, Char]]], c: T_A[(Char,Char), CC_B[Char]]) extends T_A[T_A[CC_A[Byte], T_A[CC_A[Byte], CC_A[Byte]]], T_A[T_A[CC_A[Byte], T_A[CC_A[Byte], CC_A[Byte]]], T_A[CC_A[Byte], T_A[CC_A[Byte], CC_A[Byte]]]]]

val v_a: T_A[Char, T_A[Char, Char]] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, _)) => 0 
  case CC_A(_, CC_B(_, _, _)) => 1 
  case CC_B(CC_A(_, _), _, (_,_)) => 2 
}
}