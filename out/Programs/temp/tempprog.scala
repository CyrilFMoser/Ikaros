object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C, D](a: Boolean, b: T_A[D, D], c: Char) extends T_A[C, D]
case class CC_B[E, F]() extends T_A[E, F]
case class CC_C[H, G]() extends T_A[H, G]
case class CC_D[I, J]() extends T_A[J, I]
case class CC_E[K, L]() extends T_A[L, K]
case class CC_F[M, N](a: Byte, b: CC_C[N, M]) extends T_A[N, M]
case class CC_G[P, O](a: T_A[P, CC_B[O, O]], b: T_A[O, T_B], c: CC_E[P, P]) extends T_A[P, O]
case class CC_H[Q, R, S](a: T_A[Q, R]) extends T_A[Q, R]
case class CC_I() extends T_A[CC_E[CC_G[Int, Int], T_A[Char, Byte]], T_A[Boolean, T_A[Boolean, Int]]]
case class CC_J(a: Int, b: CC_H[Boolean, CC_H[Char, Boolean, Char], Boolean], c: Byte) extends T_B
case class CC_K[T]() extends T_B
case class CC_L(a: Int, b: Int) extends T_B

val v_a: T_A[CC_I, Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, _, _), 'x') => 0 
  case CC_A(_, CC_B(), 'x') => 1 
  case CC_A(_, CC_C(), 'x') => 2 
  case CC_A(_, CC_D(), 'x') => 3 
  case CC_A(_, CC_E(), 'x') => 4 
  case CC_A(_, CC_F(_, _), 'x') => 5 
  case CC_A(_, CC_G(_, _, _), 'x') => 6 
  case CC_A(_, CC_H(_), 'x') => 7 
  case CC_A(_, CC_A(_, _, _), _) => 8 
  case CC_A(_, CC_B(), _) => 9 
  case CC_A(_, CC_C(), _) => 10 
  case CC_A(_, CC_D(), _) => 11 
  case CC_A(_, CC_E(), _) => 12 
  case CC_A(_, CC_F(_, _), _) => 13 
  case CC_A(_, CC_G(_, _, _), _) => 14 
  case CC_A(_, CC_H(_), _) => 15 
  case CC_B() => 16 
  case CC_C() => 17 
  case CC_D() => 18 
  case CC_E() => 19 
  case CC_F(_, CC_C()) => 20 
  case CC_G(CC_A(_, _, _), CC_A(_, _, _), _) => 21 
  case CC_G(CC_B(), CC_A(_, _, _), _) => 22 
  case CC_G(CC_C(), CC_A(_, _, _), _) => 23 
  case CC_G(CC_D(), CC_A(_, _, _), _) => 24 
  case CC_G(CC_E(), CC_A(_, _, _), _) => 25 
  case CC_G(CC_F(_, _), CC_A(_, _, _), _) => 26 
  case CC_G(CC_G(_, _, _), CC_A(_, _, _), _) => 27 
  case CC_G(CC_H(_), CC_A(_, _, _), _) => 28 
  case CC_G(CC_A(_, _, _), CC_B(), _) => 29 
  case CC_G(CC_B(), CC_B(), _) => 30 
  case CC_G(CC_C(), CC_B(), _) => 31 
  case CC_G(CC_D(), CC_B(), _) => 32 
  case CC_G(CC_E(), CC_B(), _) => 33 
  case CC_G(CC_F(_, _), CC_B(), _) => 34 
  case CC_G(CC_G(_, _, _), CC_B(), _) => 35 
  case CC_G(CC_H(_), CC_B(), _) => 36 
  case CC_G(CC_A(_, _, _), CC_C(), _) => 37 
  case CC_G(CC_B(), CC_C(), _) => 38 
  case CC_G(CC_C(), CC_C(), _) => 39 
  case CC_G(CC_D(), CC_C(), _) => 40 
  case CC_G(CC_E(), CC_C(), _) => 41 
  case CC_G(CC_F(_, _), CC_C(), _) => 42 
  case CC_G(CC_G(_, _, _), CC_C(), _) => 43 
  case CC_G(CC_H(_), CC_C(), _) => 44 
  case CC_G(CC_A(_, _, _), CC_D(), _) => 45 
  case CC_G(CC_B(), CC_D(), _) => 46 
  case CC_G(CC_C(), CC_D(), _) => 47 
  case CC_G(CC_D(), CC_D(), _) => 48 
  case CC_G(CC_E(), CC_D(), _) => 49 
  case CC_G(CC_F(_, _), CC_D(), _) => 50 
  case CC_G(CC_G(_, _, _), CC_D(), _) => 51 
  case CC_G(CC_H(_), CC_D(), _) => 52 
  case CC_G(CC_A(_, _, _), CC_E(), _) => 53 
  case CC_G(CC_B(), CC_E(), _) => 54 
  case CC_G(CC_C(), CC_E(), _) => 55 
  case CC_G(CC_D(), CC_E(), _) => 56 
  case CC_G(CC_E(), CC_E(), _) => 57 
  case CC_G(CC_F(_, _), CC_E(), _) => 58 
  case CC_G(CC_G(_, _, _), CC_E(), _) => 59 
  case CC_G(CC_H(_), CC_E(), _) => 60 
  case CC_G(CC_A(_, _, _), CC_F(_, _), _) => 61 
  case CC_G(CC_B(), CC_F(_, _), _) => 62 
  case CC_G(CC_C(), CC_F(_, _), _) => 63 
  case CC_G(CC_D(), CC_F(_, _), _) => 64 
  case CC_G(CC_E(), CC_F(_, _), _) => 65 
  case CC_G(CC_F(_, _), CC_F(_, _), _) => 66 
  case CC_G(CC_G(_, _, _), CC_F(_, _), _) => 67 
  case CC_G(CC_H(_), CC_F(_, _), _) => 68 
  case CC_G(CC_A(_, _, _), CC_G(_, _, _), _) => 69 
  case CC_G(CC_B(), CC_G(_, _, _), _) => 70 
  case CC_G(CC_C(), CC_G(_, _, _), _) => 71 
  case CC_G(CC_D(), CC_G(_, _, _), _) => 72 
  case CC_G(CC_E(), CC_G(_, _, _), _) => 73 
  case CC_G(CC_F(_, _), CC_G(_, _, _), _) => 74 
  case CC_G(CC_G(_, _, _), CC_G(_, _, _), _) => 75 
  case CC_G(CC_H(_), CC_G(_, _, _), _) => 76 
  case CC_G(CC_A(_, _, _), CC_H(_), _) => 77 
  case CC_G(CC_B(), CC_H(_), _) => 78 
  case CC_G(CC_C(), CC_H(_), _) => 79 
  case CC_G(CC_D(), CC_H(_), _) => 80 
  case CC_G(CC_E(), CC_H(_), _) => 81 
  case CC_G(CC_F(_, _), CC_H(_), _) => 82 
  case CC_G(CC_G(_, _, _), CC_H(_), _) => 83 
  case CC_G(CC_H(_), CC_H(_), _) => 84 
  case CC_H(CC_A(_, _, _)) => 85 
  case CC_H(CC_B()) => 86 
  case CC_H(CC_C()) => 87 
  case CC_H(CC_D()) => 88 
  case CC_H(CC_E()) => 89 
  case CC_H(CC_F(_, _)) => 90 
  case CC_H(CC_G(_, _, _)) => 91 
  case CC_H(CC_H(_)) => 92 
}
}