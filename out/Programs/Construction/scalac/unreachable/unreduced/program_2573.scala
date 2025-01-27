package Program_24 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: Int, b: T_A[C, C], c: T_A[C, C]) extends T_A[T_A[Int, T_A[Byte, Char]], C]
case class CC_B(a: CC_A[T_A[Char, Char]]) extends T_A[T_A[Int, T_A[Byte, Char]], Int]

val v_a: T_A[T_A[Int, T_A[Byte, Char]], Int] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_) => 1 
}
}