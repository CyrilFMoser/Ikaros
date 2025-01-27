package Program_24 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_B[D, D]) extends T_A[D]
case class CC_B[E]() extends T_A[E]
case class CC_C[F, G](a: T_B[G, T_A[G]], b: T_A[F]) extends T_A[F]
case class CC_D[H]() extends T_B[H, CC_A[H]]
case class CC_E[I]() extends T_B[I, CC_A[I]]
case class CC_F[J](a: Byte, b: (CC_A[Boolean],T_A[Char]), c: CC_C[J, J]) extends T_B[J, CC_A[J]]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B() => 1 
}
}
// This is not matched: CC_C(_, _)