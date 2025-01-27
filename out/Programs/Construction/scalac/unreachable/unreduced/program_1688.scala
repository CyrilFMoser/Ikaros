package Program_26 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E, F](a: F, b: T_A[F, E], c: T_A[F, F]) extends T_A[T_B[E, E], E]
case class CC_B[G](a: CC_A[G, G], b: T_B[G, G], c: T_B[G, G]) extends T_A[T_B[G, G], G]
case class CC_C[H]() extends T_B[H, Boolean]
case class CC_D[I](a: T_B[CC_C[I], Boolean], b: CC_A[I, I]) extends T_B[I, Boolean]

val v_a: T_A[T_B[Int, Int], Int] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(CC_A(_, _, _), _, _) => 1 
}
}