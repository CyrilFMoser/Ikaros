package Program_13 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: E, b: Byte, c: Byte) extends T_A[T_A[T_A[Int, Int], T_B[Char, Char]], E]
case class CC_B[F, G](a: T_A[F, G], b: G, c: CC_A[G]) extends T_A[T_A[T_A[Int, Int], T_B[Char, Char]], F]
case class CC_C[H, I](a: (T_A[Int, Char],Int), b: CC_B[H, Boolean]) extends T_B[H, CC_B[H, H]]
case class CC_D[J](a: T_B[T_B[J, J], CC_B[T_B[J, J], T_B[J, J]]], b: J, c: T_B[J, J]) extends T_B[J, CC_B[J, J]]
case class CC_E[K]() extends T_B[K, CC_B[K, K]]

val v_a: T_A[T_A[T_A[Int, Int], T_B[Char, Char]], Int] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_, _, _) => 1 
}
}