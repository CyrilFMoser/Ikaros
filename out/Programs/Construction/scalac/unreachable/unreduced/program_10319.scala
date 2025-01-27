package Program_3 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: Char, b: T_A[C, C]) extends T_A[T_A[Int, T_A[Int, Int]], C]
case class CC_B[D](a: CC_A[D], b: D, c: (CC_A[Int],Byte)) extends T_A[T_A[Int, T_A[Int, Int]], D]

val v_a: T_A[T_A[Int, T_A[Int, Int]], Char] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, _, _) => 1 
}
}