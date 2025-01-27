package Program_14 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_A[C, T_B], b: T_A[C, C], c: Byte) extends T_A[C, T_B]
case class CC_B[D](a: T_A[Int, T_B]) extends T_A[D, Int]
case class CC_C[E](a: T_B, b: E) extends T_A[E, Int]
case class CC_D(a: Byte, b: CC_C[T_A[T_B, Int]], c: T_A[T_A[T_B, Int], (T_B,T_B)]) extends T_B
case class CC_E() extends T_B
case class CC_F(a: CC_D, b: CC_E) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_D(_, CC_C(_, _), _) => 0 
  case CC_E() => 1 
  case CC_F(_, CC_E()) => 2 
}
}