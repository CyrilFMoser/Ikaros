package Program_19 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E]() extends T_A[T_A[E, E], E]
case class CC_B[G, F](a: F, b: T_B[Int, F]) extends T_B[G, F]
case class CC_C[H](a: T_A[H, H]) extends T_B[H, Int]
case class CC_D[I](a: T_A[T_A[I, I], I]) extends T_B[I, Int]

val v_a: T_B[Boolean, Int] = null
val v_b: Int = v_a match{
  case CC_B(_, CC_B(_, CC_B(_, _))) => 0 
  case CC_B(_, CC_B(_, CC_C(_))) => 1 
  case CC_B(_, CC_B(_, CC_D(_))) => 2 
  case CC_B(_, CC_C(_)) => 3 
  case CC_B(_, CC_D(CC_A())) => 4 
  case CC_C(_) => 5 
  case CC_D(CC_A()) => 6 
}
}