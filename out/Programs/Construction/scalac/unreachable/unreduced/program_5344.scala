package Program_7 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[F, E]() extends T_A[E, F]
case class CC_B[G](a: T_B[G, G]) extends T_A[G, T_A[Boolean, G]]
case class CC_C[H](a: Int, b: Boolean, c: Boolean) extends T_B[CC_B[T_A[Boolean, Char]], H]
case class CC_D[I](a: I, b: CC_A[I, I]) extends T_B[T_B[I, I], I]
case class CC_E[J](a: T_A[J, J]) extends T_B[CC_B[T_A[Boolean, Char]], J]

val v_a: T_A[Int, T_A[Boolean, Int]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_) => 1 
}
}