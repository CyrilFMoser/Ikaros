sealed trait T_A[-A]
sealed trait T_B[-B, -C]
case class CC_A() extends T_A[T_A[Char]]
case class CC_B(a: T_A[Byte], b: T_A[T_A[Char]], c: T_B[Byte, Int]) extends T_A[T_A[Char]]
case class CC_C(a: T_B[Int, Byte], b: T_A[Char], c: T_A[Byte]) extends T_A[T_A[Char]]
case class CC_D() extends T_A[T_A[Char]]
case class CC_E() extends T_A[T_A[Char]]
case class CC_F[D, E](a: Int, b: T_B[E, Int]) extends T_B[D, E]
case class CC_G[F]() extends T_B[CC_E, F]
case class CC_H[G](a: CC_B) extends T_B[CC_E, G]
case class CC_I[H](a: Boolean, b: T_B[CC_E, H]) extends T_B[CC_E, H]

val v_a: T_A[T_A[Char]] = null
val v_b: Int = v_a match{
  case CC_A() => 0
  case CC_B(_, CC_A(), CC_F(_, _)) => 1
  case CC_B(_, CC_B(_, _, _), CC_F(_, _)) => 2
  case CC_B(_, CC_C(_, _, _), CC_F(_, _)) => 3
  case CC_B(_, CC_D(), CC_F(_, _)) => 4
  case CC_B(_, CC_E(), CC_F(_, _)) => 5
  case CC_C(CC_F(_, _), _, _) => 6
  case CC_D() => 7
  case CC_E() => 8
}
