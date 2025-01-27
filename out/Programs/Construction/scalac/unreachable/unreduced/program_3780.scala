package Program_23 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_A[E, E], b: E, c: Byte) extends T_A[Byte, T_B[Int, T_B[Byte, Byte]]]
case class CC_B(a: T_A[T_B[Char, Char], T_A[Byte, Byte]], b: CC_A[Byte]) extends T_A[Byte, T_B[Int, T_B[Byte, Byte]]]
case class CC_C() extends T_A[Byte, T_B[Int, T_B[Byte, Byte]]]

val v_a: T_A[Byte, T_B[Int, T_B[Byte, Byte]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_, CC_A(_, _, _)) => 1 
  case CC_C() => 2 
}
}