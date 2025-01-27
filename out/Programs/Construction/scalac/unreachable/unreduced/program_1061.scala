package Program_11 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: T_A[C, C], c: (Byte,Byte)) extends T_A[T_A[C, C], C]
case class CC_B(a: T_A[T_A[Byte, Byte], Byte], b: CC_A[CC_A[Boolean]]) extends T_A[T_A[T_A[CC_A[(Byte,Char)], CC_A[Boolean]], T_A[CC_A[(Byte,Char)], CC_A[Boolean]]], T_A[CC_A[(Byte,Char)], CC_A[Boolean]]]
case class CC_C[D, E](a: Char, b: T_A[T_A[D, D], D], c: T_A[T_A[CC_B, CC_B], CC_B]) extends T_A[T_A[D, D], D]

val v_a: CC_C[CC_B, Char] = null
val v_b: Int = v_a match{
  case CC_C(_, CC_A(_, _, _), CC_A(_, _, _)) => 0 
  case CC_C(_, CC_C(_, _, _), CC_A(_, _, _)) => 1 
  case CC_C(_, CC_A(_, _, _), CC_C(_, _, _)) => 2 
  case CC_C(_, CC_C(_, _, _), CC_C(_, _, _)) => 3 
}
}