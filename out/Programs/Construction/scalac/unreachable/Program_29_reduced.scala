object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[C,         C        ]
case class CC_C[E](a: T_A[E, CC_A[E]]) extends T_A[E, T_A[T_A[E, E], E]]
val v_a: T_A[Byte, T_A[T_A[Byte, Byte], Byte]] = null
val v_b      = v_a match{
  case CC_A() => 0
  case CC_C(_) => 2
}
}
