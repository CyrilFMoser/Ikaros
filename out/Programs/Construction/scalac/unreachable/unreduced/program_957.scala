package Program_24 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[F, E](a: T_B[E, E], b: E) extends T_A[F, E]
case class CC_B[G, H](a: T_A[G, H]) extends T_A[G, H]
case class CC_C[J, I](a: Boolean) extends T_A[I, J]
case class CC_D[K](a: K) extends T_B[K, T_A[(Int,Int), T_A[Byte, Boolean]]]

val v_a: T_A[Boolean, Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_) => 1 
  case CC_C(_) => 2 
}
}