object Test {
sealed trait T_A[A, B]
case class CC_A[C](a:     C    , b: T_A[C, C]) extends T_A[C, T_A[T_A[C, C], C]]
case class CC_B[D](a: D, b: Int) extends T_A[D,     T_A[D, D]    ]
val v_a: T_A[Byte, T_A[T_A[Byte, Byte], Byte]] = null
val v_b      = v_a match{
  case CC_A(_, _) => 0
  case CC_B(_, _) => 1
}
}
