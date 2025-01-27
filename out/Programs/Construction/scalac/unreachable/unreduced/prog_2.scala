sealed trait T_A[-A]
case class CC_A(a: T_A[Char], b: Byte) extends T_A[T_A[Int]]
case class CC_B() extends T_A[T_A[Int]]
case class CC_C() extends T_A[T_A[Int]]
case class CC_D(a: T_A[T_A[Int]]) extends T_A[T_A[Int]]
case class CC_E(a: Byte, b: Int) extends T_A[T_A[Int]]
case class CC_F(a: CC_D) extends T_A[T_A[Int]]
case class CC_G(a: CC_C) extends T_A[T_A[Int]]

val v_a: T_A[T_A[Int]] = null
val v_b: Int = v_a match{  case CC_A(_, _) => 0
  case CC_B() => 1
  case CC_C() => 2
  case CC_D(CC_A(_, _)) => 3
  case CC_D(CC_B()) => 4
  case CC_D(CC_C()) => 5
  case CC_D(CC_D(_)) => 6
  case CC_D(CC_E(_, _)) => 7
  case CC_D(CC_F(_)) => 8
  case CC_D(CC_G(_)) => 9
  case CC_E(_, _) => 10
  case CC_F(CC_D(_)) => 11
  case CC_G(CC_C()) => 12
}