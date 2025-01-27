package Program_2 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_A[E, E], b: T_B[E, E]) extends T_A[T_B[T_B[Boolean, Int], T_A[Boolean, Char]], E]
case class CC_B[F](a: T_A[F, F], b: (T_B[Byte, Char],T_B[Char, Byte])) extends T_A[T_B[T_B[Boolean, Int], T_A[Boolean, Char]], F]
case class CC_C[G](a: Char, b: T_A[G, G], c: CC_A[G]) extends T_B[CC_B[G], G]
case class CC_D[H](a: H, b: Char, c: T_B[CC_B[H], H]) extends T_B[H, (CC_B[Byte],(Boolean,Char))]
case class CC_E[I]() extends T_B[CC_B[I], I]

val v_a: T_B[Char, (CC_B[Byte],(Boolean,Char))] = null
val v_b: Int = v_a match{
  case CC_D(_, _, CC_C(_, _, CC_A(_, _))) => 0 
  case CC_D(_, _, CC_E()) => 1 
}
}