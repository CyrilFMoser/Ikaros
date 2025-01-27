package Program_12 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: Byte, b: T_A[Byte]) extends T_A[T_B[T_B[(Byte,Int), Char], T_A[Boolean]]]
case class CC_B[D]() extends T_B[T_A[D], D]
case class CC_C[F, E](a: T_A[E], b: CC_B[F]) extends T_B[F, E]
case class CC_D[G](a: T_B[G, G], b: T_B[G, G]) extends T_B[T_A[G], G]

val v_a: T_B[T_A[Byte], Byte] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C(_, CC_B()) => 1 
  case CC_D(CC_C(_, CC_B()), CC_C(_, CC_B())) => 2 
}
}