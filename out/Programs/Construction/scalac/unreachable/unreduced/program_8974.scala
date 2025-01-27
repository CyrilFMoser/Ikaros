package Program_6 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: (Boolean,T_A[Int, Char]), b: Byte, c: E) extends T_A[T_A[E, E], E]
case class CC_B[G, F, H]() extends T_A[G, F]
case class CC_C[I](a: I, b: T_B[I, I]) extends T_A[T_A[I, I], I]
case class CC_D[J](a: CC_A[J]) extends T_B[CC_B[T_A[Int, Char], T_A[Char, Boolean], CC_B[Char, Char, Boolean]], J]
case class CC_E[K](a: K) extends T_B[CC_B[T_A[Int, Char], T_A[Char, Boolean], CC_B[Char, Char, Boolean]], K]
case class CC_F[L](a: (CC_A[Boolean],CC_C[Int])) extends T_B[L, CC_D[CC_E[Char]]]

val v_a: T_A[T_A[Int, Int], Int] = null
val v_b: Int = v_a match{
  case CC_A((_,CC_B()), _, _) => 0 
  case CC_B() => 1 
  case CC_C(_, _) => 2 
}
}