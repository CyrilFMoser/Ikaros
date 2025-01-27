package Program_2 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: (Char,T_A[Char, Boolean]), b: (T_B[Int, Char],T_B[Char, Char])) extends T_A[T_B[E, E], E]
case class CC_B[F]() extends T_A[T_B[F, F], F]
case class CC_C[G, H]() extends T_B[G, H]
case class CC_D[I](a: T_A[I, I], b: T_B[I, I], c: T_A[T_B[CC_C[I, I], CC_C[I, I]], CC_C[I, I]]) extends T_B[Char, I]
case class CC_E[J]() extends T_B[Char, J]

val v_a: T_B[Char, Int] = null
val v_b: Int = v_a match{
  case CC_C() => 0 
  case CC_D(_, _, _) => 1 
  case CC_E() => 2 
}
}