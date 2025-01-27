package Program_12 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: E, b: (Int,T_B[Int, Char])) extends T_A[T_B[T_A[Int, Int], Int], E]
case class CC_B[F](a: T_A[F, F], b: F, c: F) extends T_A[T_B[T_A[Int, Int], Int], F]
case class CC_C[G](a: CC_B[G], b: G) extends T_A[G, T_A[T_A[G, G], G]]
case class CC_D[H]() extends T_B[Int, H]
case class CC_E[I](a: Byte, b: T_B[I, I], c: ((Int,Char),Char)) extends T_B[Int, I]
case class CC_F() extends T_B[T_B[T_B[Int, Boolean], CC_A[Byte]], CC_C[(Boolean,Byte)]]

val v_a: CC_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, (_,CC_D())) => 0 
  case CC_A(_, (_,CC_E(_, _, _))) => 1 
}
}