package Program_22 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: T_A[C, C], c: C) extends T_A[C, T_A[T_A[Byte, C], C]]
case class CC_B(a: T_A[T_A[Char, Byte], CC_A[(Byte,Int)]], b: T_A[CC_A[Char], Int]) extends T_A[T_A[CC_A[Byte], T_A[Byte, (Char,Byte)]], T_A[T_A[Byte, T_A[CC_A[Byte], T_A[Byte, (Char,Byte)]]], T_A[CC_A[Byte], T_A[Byte, (Char,Byte)]]]]
case class CC_C[D]() extends T_A[D, T_A[T_A[Byte, D], D]]

val v_a: T_A[T_A[CC_A[Byte], T_A[Byte, (Char,Byte)]], T_A[T_A[Byte, T_A[CC_A[Byte], T_A[Byte, (Char,Byte)]]], T_A[CC_A[Byte], T_A[Byte, (Char,Byte)]]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_C() => 1 
}
}
// This is not matched: CC_B(_, _)