package Program_26 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E]() extends T_A[T_B[T_A[E, E], E], E]
case class CC_B[F](a: T_B[F, F]) extends T_A[T_B[T_A[F, F], F], F]
case class CC_C[G](a: (CC_A[Boolean],CC_B[Int]), b: T_A[G, G], c: T_B[G, G]) extends T_B[G, CC_A[G]]

val v_a: T_A[T_B[T_A[Byte, Byte], Byte], Byte] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_) => 1 
}
}