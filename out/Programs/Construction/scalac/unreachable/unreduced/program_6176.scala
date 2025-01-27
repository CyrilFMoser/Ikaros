package Program_27 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: T_A[C, C], c: Char) extends T_A[C, T_A[(Char,Byte), T_A[Char, Byte]]]
case class CC_B[D]() extends T_A[D, T_A[(Char,Byte), T_A[Char, Byte]]]
case class CC_C[E](a: E, b: E, c: CC_B[E]) extends T_A[E, T_A[(Char,Byte), T_A[Char, Byte]]]

val v_a: T_A[Int, T_A[(Char,Byte), T_A[Char, Byte]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B() => 1 
}
}
// This is not matched: CC_C(_, _, _)