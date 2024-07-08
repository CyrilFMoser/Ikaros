object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: Boolean, b:     C    , c: T_A[C, C]) extends T_A[C, T_A[T_A[C, C], T_A[C, C]]]
case class CC_B[D]() extends T_A[D,     T_A[D, D]            ]
val v_a: T_A[Byte, T_A[T_A[Byte, Byte], T_A[Byte, Byte]]] = null
val v_b      = v_a match{
  case CC_A(_, _, _) => 0
  case CC_B() => 1
}
}
