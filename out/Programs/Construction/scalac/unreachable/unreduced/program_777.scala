package Program_8 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_A[C, C], b: T_A[T_B, C]) extends T_A[T_B, C]
case class CC_B[D](a: Int, b: ((T_B,(Char,Char)),Boolean), c: Byte) extends T_A[T_B, D]
case class CC_C(a: Int, b: Char, c: T_A[T_B, CC_B[T_B]]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C(_, 'x', CC_A(_, _)) => 0 
  case CC_C(_, _, CC_A(_, _)) => 1 
  case CC_C(_, 'x', CC_B(_, _, _)) => 2 
}
}
// This is not matched: CC_C(_, _, CC_B(_, _, _))