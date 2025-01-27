package Program_0 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[T_A[C, C], C], b: T_A[C, C], c: T_A[(Char,Boolean), C]) extends T_A[T_A[T_A[C, C], Char], C]
case class CC_B(a: Boolean) extends T_A[T_A[T_A[T_A[Char, T_A[Byte, (Int,Char)]], T_A[Char, T_A[Byte, (Int,Char)]]], Char], T_A[Char, T_A[Byte, (Int,Char)]]]

val v_a: T_A[T_A[T_A[T_A[Char, T_A[Byte, (Int,Char)]], T_A[Char, T_A[Byte, (Int,Char)]]], Char], T_A[Char, T_A[Byte, (Int,Char)]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_) => 1 
}
}