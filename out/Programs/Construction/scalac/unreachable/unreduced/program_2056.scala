package Program_14 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E]() extends T_A[T_B[E, E], E]
case class CC_B[F]() extends T_A[F, Char]
case class CC_C[G]() extends T_A[T_B[G, G], G]
case class CC_D[I, H](a: T_B[H, H], b: T_A[H, I], c: T_A[T_B[H, H], H]) extends T_B[I, H]
case class CC_E() extends T_B[T_B[CC_D[Boolean, Int], CC_C[Char]], T_A[T_B[CC_D[Int, Boolean], CC_D[Int, Boolean]], CC_D[Int, Boolean]]]
case class CC_F(a: CC_B[(Int,CC_E)], b: CC_E) extends T_B[T_B[CC_D[Boolean, Int], CC_C[Char]], T_A[T_B[CC_D[Int, Boolean], CC_D[Int, Boolean]], CC_D[Int, Boolean]]]

val v_a: T_B[T_B[CC_D[Boolean, Int], CC_C[Char]], T_A[T_B[CC_D[Int, Boolean], CC_D[Int, Boolean]], CC_D[Int, Boolean]]] = null
val v_b: Int = v_a match{
  case CC_D(_, _, CC_A()) => 0 
  case CC_E() => 1 
  case CC_F(_, _) => 2 
}
}
// This is not matched: CC_D(_, _, CC_C())