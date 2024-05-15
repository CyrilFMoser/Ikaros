sealed trait T_A[-A]
sealed trait T_B[-B]
case class CC_A(a: T_A[T_B[Byte]]) extends T_A[T_B[Byte]]
case class CC_B(a: T_B[Int]) extends T_A[T_B[Byte]]
case class CC_C(a: CC_A, b: T_A[T_B[Byte]]) extends T_A[T_B[Byte]]
case class CC_D(a: T_A[T_B[Byte]], b: T_A[Boolean]) extends T_A[T_B[Byte]]
case class CC_E[C](a: Byte, b: T_A[C]) extends T_A[T_B[Byte]]
case class CC_F(a: Boolean, b: CC_C) extends T_A[CC_A]
case class CC_G(a: CC_A) extends T_B[CC_C]
case class CC_H(a: CC_C) extends T_B[CC_C]
case class CC_I(a: T_A[Byte], b: CC_G) extends T_B[CC_C]

val v_a: T_A[T_B[Byte]] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_)) => 0
  case CC_A(CC_B(_)) => 1
  case CC_A(CC_C(_, _)) => 2
  case CC_A(CC_D(_, _)) => 3
  case CC_A(CC_E(_, _)) => 4
  case CC_B(_) => 5
  case CC_C(CC_A(_), _) => 6
  case CC_D(CC_A(_), _) => 7
  case CC_D(CC_B(_), _) => 8
  case CC_D(CC_C(_, _), _) => 9
  case CC_D(CC_D(_, _), _) => 10
  case CC_D(CC_E(_, _), _) => 11
  case CC_E(_, _) => 12
}