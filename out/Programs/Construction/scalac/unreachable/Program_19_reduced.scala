object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_B[F](a: Int, b: Int)
case class CC_C[G](                                                      ) extends T_A
case class CC_D[H](a: CC_B[H], b: H, c: T_A[    Char    , H]) extends T_B[H, CC_C[H]]
case class CC_E[I](a: I, b: Int) extends T_B[I,      I ]
val v_a: T_B[Byte, CC_C[Byte]] = null
val v_b      = v_a match{
  case CC_D(CC_B(_, _), _, _) => 0
  case CC_E(_, _) => 1
}
}
