package Program_27 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C, b: T_A[Int, C]) extends T_A[C, T_A[T_A[(Byte,Int), Char], T_A[Int, Byte]]]
case class CC_B[D](a: CC_A[D]) extends T_A[D, T_A[T_A[(Byte,Int), Char], T_A[Int, Byte]]]

val v_a: T_A[Byte, T_A[T_A[(Byte,Int), Char], T_A[Int, Byte]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_) => 1 
}
}