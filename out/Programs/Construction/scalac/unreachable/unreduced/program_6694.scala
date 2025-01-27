package Program_21 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_B[E, E]) extends T_A[T_A[T_A[(Boolean,Char), Boolean], Int], E]
case class CC_B[F]() extends T_A[T_A[T_A[(Boolean,Char), Boolean], Int], F]
case class CC_C[G](a: T_A[G, G], b: T_B[G, G]) extends T_A[T_A[T_A[(Boolean,Char), Boolean], Int], G]
case class CC_D[I, H](a: T_A[I, T_B[I, I]]) extends T_B[H, I]
case class CC_E[J](a: T_A[J, J], b: Int) extends T_B[J, CC_A[J]]
case class CC_F[K](a: (Byte,Char)) extends T_B[K, CC_A[K]]

val v_a: T_A[T_A[T_A[(Boolean,Char), Boolean], Int], Int] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_C(_, _) => 1 
}
}
// This is not matched: CC_B()