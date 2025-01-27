package Program_12 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_A[T_B[E, E], E], b: Int) extends T_A[T_B[E, E], E]
case class CC_B[F](a: F, b: T_B[F, F], c: F) extends T_B[F, T_B[F, F]]
case class CC_C[G](a: T_A[T_B[G, G], G], b: T_B[G, G], c: T_A[T_B[G, G], G]) extends T_B[G, T_B[G, G]]
case class CC_D[H](a: T_B[CC_A[H], T_B[CC_A[H], CC_A[H]]]) extends T_B[H, T_B[H, H]]

val v_a: T_B[Byte, T_B[Byte, Byte]] = null
val v_b: Int = v_a match{
  case CC_C(_, _, CC_A(_, _)) => 0 
  case CC_D(_) => 1 
}
}
// This is not matched: CC_B(_, _, _)