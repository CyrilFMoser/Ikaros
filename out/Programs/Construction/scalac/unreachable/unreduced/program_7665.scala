package Program_9 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E, F](a: F) extends T_A[E, F]
case class CC_B[G](a: T_B[G, G]) extends T_A[G, Int]
case class CC_C[H]() extends T_A[H, Int]
case class CC_D[I](a: CC_B[I], b: I, c: T_B[I, I]) extends T_B[I, T_A[I, I]]
case class CC_E[J](a: CC_A[J, J]) extends T_B[J, T_A[J, J]]

val v_a: T_A[Byte, Int] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_) => 1 
  case CC_C() => 2 
}
}