sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[B](a: Boolean) extends T_A[Int, B]
case class CC_B[B](a: CC_A[B], b: Char) extends T_A[T_A[Byte, Byte], B]
case class CC_C[B](a: T_A[Int, B], b: T_A[B, B]) extends T_A[T_A[Byte, Byte], B]
case class CC_D[B](a: T_A[T_A[Byte, Byte], B], b: CC_A[Byte], c: CC_A[B]) extends T_A[T_A[Byte, Byte], B]
case class CC_E[B, C](a: CC_C[C], b: Byte) extends T_A[CC_A[Int], B]
case class CC_F(a: CC_C[Boolean]) extends T_B

val v_a: T_A[T_A[Byte, Byte], Boolean] = null
val v_b: Int = v_a match{
  case CC_B(_, _) => 0
  case CC_C(_, _) => 1
  case CC_D(_, _, _) => 2
}
