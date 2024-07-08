object Test {
sealed trait T_B[C, D]
case class CC_B[F](a: F, b: F) extends T_B[F, T_B[    F       , F]]
case class CC_C[G](a:      G , b: T_B[G,     G    ]) extends T_B[G, T_B[T_B[G, Char], G]]
val v_a: T_B[Byte, T_B[T_B[Byte, Char], Byte]] = null
val v_b      = v_a match{
  case CC_B(_, _) => 0
  case CC_C     (_, _)     => 1
}
}
