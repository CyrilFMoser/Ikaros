package Program_4 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E]() extends T_A[E, T_A[E, T_B[E, E]]]
case class CC_B[F](a: T_A[(Byte,Boolean), F], b: Byte) extends T_A[F, T_A[F, T_B[F, F]]]
case class CC_C[G, H](a: H, b: CC_A[G]) extends T_B[G, H]
case class CC_D[I](a: Boolean) extends T_B[T_A[CC_C[Byte, Int], Boolean], I]
case class CC_E[J, K](a: J, b: (CC_C[Int, Char],CC_A[Char])) extends T_B[J, K]

val v_a: T_A[Int, T_A[Int, T_B[Int, Int]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _) => 1 
}
}