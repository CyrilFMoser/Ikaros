object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A(       )
case class CC_B[E, D](a: T_B[E], b: E) extends T_A[E, D]
case class CC_C[G, F](a: CC_A) extends T_A[G, F]
case class CC_D() extends T_B
val v_a:             T_A[Byte, Char]                                                                                         = null
val v_b      = v_a match{
  case CC_B(_, _) => 0
  case CC_C     (_)  => 1
}
}
