package Program_23 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[F, E](a: T_A[F, T_A[E, E]], b: T_A[F, E]) extends T_A[F, E]
case class CC_B[G](a: T_B[G, G], b: G) extends T_B[G, T_A[G, T_A[G, G]]]
case class CC_C[H](a: H) extends T_B[H, T_A[H, T_A[H, H]]]
case class CC_D[I](a: T_B[I, I]) extends T_B[I, T_A[I, T_A[I, I]]]

val v_a: T_B[Byte, T_A[Byte, T_A[Byte, Byte]]] = null
val v_b: Int = v_a match{
  case CC_B(_, _) => 0 
  case CC_C(0) => 1 
  case CC_C(_) => 2 
  case CC_D(_) => 3 
}
}