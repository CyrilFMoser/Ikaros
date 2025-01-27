package Program_10 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E, F](a: T_A[(Int,Boolean), T_B[F, E]], b: Char, c: T_B[E, E]) extends T_A[F, E]
case class CC_B[G](a: T_A[G, G], b: T_A[G, T_A[G, G]]) extends T_A[T_A[T_A[Byte, Char], Byte], G]
case class CC_C[H](a: T_B[H, H], b: H) extends T_A[T_A[T_A[Byte, Char], Byte], H]
case class CC_D[I](a: I) extends T_B[I, Int]
case class CC_E[J](a: CC_A[J, J]) extends T_B[J, Int]

val v_a: T_A[T_A[T_A[Byte, Char], Byte], Char] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_, _, _), _, _), _, _) => 0 
  case CC_B(_, _) => 1 
  case CC_C(_, _) => 2 
}
}