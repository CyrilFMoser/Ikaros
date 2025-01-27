sealed trait T_A[-A, -B]
sealed trait T_B
case class CC_A[C]() extends T_A[T_B, C]
case class CC_B[D]() extends T_A[T_B, D]
case class CC_C[E](a: T_A[E, E], b: Byte, c: T_B) extends T_A[T_B, E]
case class CC_D[F](a: T_A[T_B, F], b: T_A[Char, F]) extends T_A[T_B, F]
case class CC_E(a: CC_A[Boolean], b: CC_C[Byte], c: T_B) extends T_A[T_B, T_A[T_B, Char]]
case class CC_F() extends T_A[T_B, T_A[T_B, Char]]
case class CC_G[G](a: T_A[G, G]) extends T_A[T_B, G]

val v_a: T_A[T_B, CC_E] = CC_D(null,null)
val v_b: Int = v_a match{
  case CC_A() => 0
  case CC_B() => 1
  case CC_C(_, _, _) => 2
  case CC_D(_, _) => 3
  case CC_G(_) => 4
}