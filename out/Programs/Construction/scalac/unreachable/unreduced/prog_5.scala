sealed trait T_A[+A, +B]
sealed trait T_B
case class CC_A[C](a: T_A[T_A[Char, Boolean], C], b: T_B) extends T_A[T_A[Char, Boolean], C]
case class CC_B[D]() extends T_A[T_A[Char, Boolean], D]
case class CC_C[E](a: CC_A[E], b: Byte) extends T_A[T_A[Char, Boolean], E]
case class CC_D[F]() extends T_A[T_A[Char, Boolean], F]
case class CC_E(a: T_A[T_A[Char, Boolean], Byte]) extends T_A[T_A[Char, Boolean], T_B]
case class CC_F[G]() extends T_A[T_A[Char, Boolean], G]
case class CC_G(a: Int, b: Char, c: T_A[T_A[Char, Boolean], Int]) extends T_B
case class CC_H() extends T_B
case class CC_I(a: CC_G, b: T_A[Char, Int]) extends T_B
case class CC_J() extends T_B
case class CC_K() extends T_B
case class CC_L() extends T_B
case class CC_M(a: CC_K) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_G(_, _, CC_A(_, _)) => 0
  case CC_G(_, _, CC_B()) => 1
  case CC_G(_, _, CC_C(_, _)) => 2
  case CC_G(_, _, CC_D()) => 3
  case CC_G(_, _, CC_E(_)) => 4
  case CC_G(_, _, CC_F()) => 5
  case CC_H() => 6
  case CC_I(CC_G(_, _, _), _) => 7
  case CC_J() => 8
  case CC_K() => 9
  case CC_L() => 10
  case CC_M(CC_K()) => 11
}
