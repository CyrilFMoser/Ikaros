sealed trait T_A[+A]
sealed trait T_B[-B, +C]
case class CC_A(a: T_A[Byte], b: T_A[Int], c: T_A[T_A[Int]])
    extends T_A[T_A[Int]]
case class CC_B(a: T_A[Boolean], b: CC_A) extends T_A[T_A[Int]]
case class CC_C(a: CC_A, b: T_B[Byte, Byte], c: T_A[Boolean]) extends T_A[CC_B]
case class CC_D[B]() extends T_B[B, CC_A]
case class CC_E[B, C]() extends T_B[B, C]
case class CC_F[B, C](a: Boolean, b: CC_B) extends T_B[B, C]

val v_a: T_B[T_A[T_A[Int]], Boolean] = CC_F(true,CC_B(null,null))
val v_b: Int = v_a match {
  case CC_E()              => 0
  case CC_F(_, CC_B(_, _)) => 1
}