package Program_5 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[F, E](a: T_A[T_A[E, E], E], b: F, c: (T_B[Int, Int],T_A[Int, Int])) extends T_A[F, E]
case class CC_B[G](a: Byte, b: CC_A[G, T_A[G, G]]) extends T_A[T_B[G, G], G]
case class CC_C[H]() extends T_A[T_B[H, H], H]
case class CC_D[I]() extends T_B[T_A[T_B[I, I], I], I]
case class CC_E[J](a: J) extends T_B[T_A[T_B[J, J], J], J]

val v_a: T_A[T_B[Int, Int], Int] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_, CC_A(_, 12, (_,_))) => 1 
  case CC_C() => 2 
}
}
// This is not matched: CC_B(_, CC_A(_, _, (_,_)))