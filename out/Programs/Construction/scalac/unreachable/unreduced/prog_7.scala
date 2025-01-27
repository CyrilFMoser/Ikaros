sealed trait T_A[-A]
sealed trait T_B[-B]
case class CC_A(a: T_A[T_B[Char]], b: T_A[Char], c: T_B[Boolean]) extends T_A[T_B[Char]]
case class CC_B(a: CC_A) extends T_A[T_B[Char]]
case class CC_C[C](a: T_B[C], b: Int, c: T_B[C]) extends T_A[T_B[Char]]
case class CC_D(a: T_A[Int], b: CC_C[Boolean], c: T_B[Boolean]) extends T_A[T_B[Char]]
case class CC_E() extends T_A[CC_B]
case class CC_F() extends T_A[CC_B]
case class CC_G(a: T_B[Byte], b: CC_C[Int]) extends T_A[T_B[Char]]
case class CC_H() extends T_B[Byte]
case class CC_I[D](a: T_B[Byte], b: CC_H, c: CC_A) extends T_B[Byte]
case class CC_J(a: T_B[Byte], b: Boolean, c: CC_B) extends T_B[Byte]
case class CC_K() extends T_B[Byte]
case class CC_L[E]() extends T_B[E]
case class CC_M(a: T_B[Byte], b: CC_K) extends T_B[Byte]
case class CC_N[F](a: CC_H, b: CC_D, c: CC_M) extends T_B[F]

val v_a: T_B[Byte] = CC_I(CC_H(),null,CC_A(null,null,null))
val v_b: Int = v_a match{
  case CC_H() => 0
  case CC_I(CC_H(), _, CC_A(_, _, _)) => 1
  case CC_I(CC_I(_, _, _), _, CC_A(_, _, _)) => 2
  case CC_I(CC_J(_, _, _), _, CC_A(_, _, _)) => 3
  case CC_I(CC_K(), _, CC_A(_, _, _)) => 4
  case CC_I(CC_M(_, _), _, CC_A(_, _, _)) => 5
  case CC_I(CC_L(), _, CC_A(_, _, _)) => 6
  case CC_I(CC_N(_, _, _), _, CC_A(_, _, _)) => 7
  case CC_J(CC_H(), _, _) => 8
  case CC_J(CC_I(_, _, _), _, _) => 9
  case CC_J(CC_J(_, _, _), _, _) => 10
  case CC_J(CC_K(), _, _) => 11
  case CC_J(CC_M(_, _), _, _) => 12
  case CC_J(CC_L(), _, _) => 13
  case CC_J(CC_N(_, _, _), _, _) => 14
  case CC_K() => 15
  case CC_M(CC_H(), CC_K()) => 16
  case CC_M(CC_I(_, _, _), CC_K()) => 17
  case CC_M(CC_J(_, _, _), CC_K()) => 18
  case CC_M(CC_K(), CC_K()) => 19
  case CC_M(CC_M(_, _), CC_K()) => 20
  case CC_M(CC_L(), CC_K()) => 21
  case CC_M(CC_N(_, _, _), CC_K()) => 22
  case CC_L() => 23
  case CC_N(CC_H(), CC_D(_, _, _), _) => 24
}
