package Program_26 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D]() extends T_A[D]
case class CC_B[E](a: CC_A[Char], b: T_B[E, E]) extends T_A[E]
case class CC_C[F](a: CC_A[F], b: CC_A[F]) extends T_A[F]
case class CC_D[G](a: G, b: Byte, c: T_A[G]) extends T_B[T_A[(Boolean,Byte)], G]
case class CC_E[H](a: H) extends T_B[T_A[(Boolean,Byte)], H]
case class CC_F[I]() extends T_B[T_A[(Boolean,Byte)], I]

val v_a: T_B[T_A[(Boolean,Byte)], Int] = null
val v_b: Int = v_a match{
  case CC_D(_, _, CC_A()) => 0 
  case CC_D(_, _, CC_B(CC_A(), _)) => 1 
  case CC_D(_, _, CC_C(CC_A(), _)) => 2 
  case CC_E(_) => 3 
}
}
// This is not matched: CC_F()