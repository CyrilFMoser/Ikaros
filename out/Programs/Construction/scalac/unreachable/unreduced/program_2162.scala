package Program_25 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: Char) extends T_A[T_A[E, E], E]
case class CC_B[F](a: T_A[T_A[F, F], F], b: F, c: T_A[F, T_A[F, F]]) extends T_B[F, T_B[T_B[Char, Int], T_A[Boolean, Boolean]]]
case class CC_C[H, G](a: G, b: CC_B[G]) extends T_B[H, G]
case class CC_D[I](a: Boolean) extends T_B[I, T_B[T_B[Char, Int], T_A[Boolean, Boolean]]]

val v_a: T_B[Char, T_B[T_B[Char, Int], T_A[Boolean, Boolean]]] = null
val v_b: Int = v_a match{
  case CC_B(_, _, _) => 0 
  case CC_D(_) => 1 
}
}
// This is not matched: CC_C(_, CC_B(_, _, _))