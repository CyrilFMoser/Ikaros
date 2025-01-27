package Program_2 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[Boolean, C]) extends T_A[C, T_A[Byte, T_A[Int, Boolean]]]
case class CC_B[D](a: CC_A[T_A[D, D]]) extends T_A[D, T_A[Byte, T_A[Int, Boolean]]]

val v_a: T_A[Char, T_A[Byte, T_A[Int, Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_) => 1 
}
}