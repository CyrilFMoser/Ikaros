package Program_3 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E]() extends T_A[T_A[E, E], E]
case class CC_B[F](a: T_A[F, F], b: T_A[T_A[F, F], F]) extends T_A[T_A[F, F], F]
case class CC_C[G](a: Int) extends T_B[G, Int]
case class CC_D[H, I]() extends T_B[H, I]

val v_a: T_A[T_A[Int, Int], Int] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, CC_A()) => 1 
  case CC_B(_, CC_B(_, CC_A())) => 2 
}
}
// This is not matched: CC_B(_, CC_B(_, CC_B(_, _)))