package Program_12 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C]) extends T_A[C, T_A[C, C]]
case class CC_B[D](a: D, b: T_A[D, T_A[D, D]]) extends T_A[D, T_A[D, D]]
case class CC_C(a: CC_B[Byte]) extends T_A[CC_A[((Int,Char),Char)], T_A[CC_A[((Int,Char),Char)], CC_A[((Int,Char),Char)]]]

val v_a: T_A[T_A[CC_A[((Int,Char),Char)], T_A[CC_A[((Int,Char),Char)], CC_A[((Int,Char),Char)]]], T_A[T_A[CC_A[((Int,Char),Char)], T_A[CC_A[((Int,Char),Char)], CC_A[((Int,Char),Char)]]], T_A[CC_A[((Int,Char),Char)], T_A[CC_A[((Int,Char),Char)], CC_A[((Int,Char),Char)]]]]] = null
val v_b: Int = v_a match{
  case CC_B(_, CC_A(_)) => 0 
  case CC_B(_, CC_B(_, _)) => 1 
}
}
// This is not matched: CC_A(_)