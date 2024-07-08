object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A()
case class CC_B(                                            ) extends     T_A
case class CC_C[D, E](a: T_B[D, D], b: D) extends T_B[D, E]
case class CC_D[G, F](a: CC_A, b: F, c:     G ) extends T_B[F, G]
val v_a: T_B[    T_A[    CC_A       ] , Int] = null
val v_b      = v_a match{
  case CC_C(_, CC_B         ) => 0
  case CC_D(CC_A(), _, _) => 1
}
}
