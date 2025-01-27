package Program_30 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[F, E](a: T_B[E, F], b: Byte, c: T_A[E, E]) extends T_A[F, E]
case class CC_B[G](a: T_B[G, G], b: T_A[Boolean, G], c: CC_A[G, G]) extends T_A[T_A[G, G], G]
case class CC_C[H]() extends T_A[T_A[H, H], H]
case class CC_D[I]() extends T_B[CC_A[I, I], I]

val v_a: T_A[T_A[Char, Char], Char] = null
val v_b: Int = v_a match{
  case CC_A(_, _, CC_A(_, _, _)) => 0 
  case CC_B(_, CC_A(_, _, CC_A(_, _, _)), CC_A(_, _, _)) => 1 
  case CC_C() => 2 
}
}