package Program_11 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: T_A[C, Byte]) extends T_A[C, Byte]
case class CC_B(a: T_A[T_A[Byte, Char], CC_A[(Char,Int)]], b: T_A[T_A[Char, Byte], Byte], c: T_A[Int, T_A[Byte, Byte]]) extends T_A[Char, Byte]
case class CC_C(a: Char) extends T_A[Char, Byte]

val v_a: T_A[Char, Byte] = null
val v_b: Int = v_a match{
  case CC_B(_, CC_A(_, _), _) => 0 
  case CC_C('x') => 1 
  case CC_C(_) => 2 
}
}
// This is not matched: CC_A(_, _)