package Program_8 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D, E]() extends T_A[D]
case class CC_B[F](a: Byte, b: T_B[F, T_A[Boolean]], c: T_A[F]) extends T_A[F]
case class CC_C[G](a: (CC_B[Int],CC_A[Boolean, Byte]), b: G) extends T_A[G]
case class CC_D[H](a: H, b: T_A[H], c: CC_C[H]) extends T_B[T_A[H], H]
case class CC_E[I](a: Int, b: T_A[I], c: CC_D[I]) extends T_B[T_A[I], I]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_B(_, _, _) => 0 
  case CC_C((_,_), _) => 1 
}
}
// This is not matched: CC_A()