package Program_0 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: T_A[C, C]) extends T_A[C, T_A[Char, T_A[Byte, Byte]]]
case class CC_B[D]() extends T_A[D, T_A[Char, T_A[Byte, Byte]]]
case class CC_C[E](a: E, b: E) extends T_A[E, T_A[Char, T_A[Byte, Byte]]]

val v_a: T_A[Int, T_A[Char, T_A[Byte, Byte]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_C(_, _) => 1 
}
}
// This is not matched: CC_B()