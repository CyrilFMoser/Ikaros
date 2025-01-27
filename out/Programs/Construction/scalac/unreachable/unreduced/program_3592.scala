package Program_3 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: Byte, b: C, c: T_A[C, C]) extends T_A[C, T_A[T_A[Int, Int], T_A[Int, Boolean]]]
case class CC_B() extends T_A[(Byte,CC_A[Boolean]), T_A[T_A[Int, Int], T_A[Int, Boolean]]]
case class CC_C[D](a: Char, b: Boolean) extends T_A[D, T_A[T_A[Int, Int], T_A[Int, Boolean]]]

val v_a: T_A[(Byte,CC_A[Boolean]), T_A[T_A[Int, Int], T_A[Int, Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_C('x', _) => 1 
  case CC_C(_, _) => 2 
}
}
// This is not matched: CC_B()