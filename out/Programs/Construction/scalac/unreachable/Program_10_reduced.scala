object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[F, E](a: T_B[F,     E    ], b:     E    , c:     E    ) extends T_A[E, F]
case class CC_C[H](          )
case class CC_D[I]() extends T_B[I, CC_C[I]]
case class CC_E[J](a: T_A[J, J], b: T_B[Char, CC_C[Char]]) extends T_B[J, CC_C[J]]
val v_a: T_B[Int, CC_C[Int]] = null
val v_b      = v_a match{
  case CC_D() => 0
  case CC_E(CC_A(_, _, _), CC_D()) => 1
  case CC_E(CC_A(_, _, _), CC_E(_, _)) => 2
}
}
