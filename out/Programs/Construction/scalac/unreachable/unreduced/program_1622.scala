package Program_18 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_A[T_A[E, E], E]) extends T_A[T_A[E, E], E]
case class CC_B[F, G](a: T_A[F, F], b: G) extends T_B[F, G]
case class CC_C[H, I](a: T_B[H, H]) extends T_B[I, H]

val v_a: T_B[Int, Boolean] = null
val v_b: Int = v_a match{
  case CC_B(_, true) => 0 
  case CC_B(_, false) => 1 
  case CC_C(_) => 2 
}
}