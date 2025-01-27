package Program_13 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[(Boolean,Int), T_A[Boolean, (Int,Char)]], b: (T_A[Byte, Boolean],T_A[Int, Boolean])) extends T_A[T_A[Int, (Byte,Char)], T_A[(Char,Boolean), T_A[Byte, Char]]]
case class CC_B() extends T_A[T_A[Int, (Byte,Char)], T_A[(Char,Boolean), T_A[Byte, Char]]]
case class CC_C(a: T_A[CC_A, (Byte,CC_B)], b: (Byte,T_A[(Byte,Boolean), CC_B]), c: T_A[(CC_A,CC_B), CC_A]) extends T_A[T_A[Int, (Byte,Char)], T_A[(Char,Boolean), T_A[Byte, Char]]]

val v_a: T_A[T_A[Int, (Byte,Char)], T_A[(Char,Boolean), T_A[Byte, Char]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B() => 1 
}
}
// This is not matched: CC_C(_, _, _)