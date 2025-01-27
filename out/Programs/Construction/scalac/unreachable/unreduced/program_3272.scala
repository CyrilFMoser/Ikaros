package Program_8 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E, F](a: T_A[E, T_A[E, E]], b: T_A[E, E], c: Byte) extends T_A[E, F]
case class CC_B[G](a: T_B[G, G]) extends T_A[T_A[T_A[Boolean, (Byte,Int)], Char], G]
case class CC_C[I, H](a: CC_B[H]) extends T_A[I, H]
case class CC_D[J](a: CC_A[J, J]) extends T_B[J, CC_C[J, J]]
case class CC_E[K](a: T_B[K, K]) extends T_B[K, CC_C[K, K]]

val v_a: T_B[Boolean, CC_C[Boolean, Boolean]] = null
val v_b: Int = v_a match{
  case CC_D(CC_A(_, _, _)) => 0 
  case CC_E(_) => 1 
}
}