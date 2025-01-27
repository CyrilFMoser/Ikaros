package Program_30 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_B[E, T_B[E, E]], b: T_A[E, E]) extends T_A[T_B[E, E], E]
case class CC_B[F](a: F) extends T_A[T_B[F, F], F]
case class CC_C[G, H]() extends T_B[H, G]

val v_a: T_A[T_B[Int, Int], Int] = null
val v_b: Int = v_a match{
  case CC_A(CC_C(), _) => 0 
  case CC_B(_) => 1 
}
}