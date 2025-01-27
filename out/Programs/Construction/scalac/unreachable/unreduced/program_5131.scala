package Program_14 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_B[T_A[Byte], T_B[Char, Int]]) extends T_A[T_A[Int]]
case class CC_B[D](a: Byte, b: Boolean, c: D) extends T_B[D, T_A[(Char,CC_A)]]
case class CC_C[E](a: CC_B[E], b: E) extends T_B[E, T_A[(Char,CC_A)]]

val v_a: T_B[T_A[T_A[Int]], T_A[(Char,CC_A)]] = null
val v_b: Int = v_a match{
  case CC_B(_, _, _) => 0 
  case CC_C(_, CC_A(_)) => 1 
}
}