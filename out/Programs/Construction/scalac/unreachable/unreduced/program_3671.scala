package Program_2 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: Boolean, b: Char, c: T_B[E, E]) extends T_A[E, T_B[E, E]]
case class CC_B[G, F](a: (CC_A[Char],T_B[Int, Boolean]), b: T_A[G, F]) extends T_A[F, G]
case class CC_C[H](a: T_A[H, T_B[H, H]], b: H, c: T_A[H, T_B[H, H]]) extends T_A[H, T_B[H, H]]
case class CC_D[I, J]() extends T_B[I, T_A[T_B[Char, Int], CC_B[Byte, Boolean]]]

val v_a: T_A[Byte, T_B[Byte, Byte]] = null
val v_b: Int = v_a match{
  case CC_A(true, _, _) => 0 
  case CC_A(false, _, _) => 1 
  case CC_B(_, _) => 2 
  case CC_C(_, _, _) => 3 
}
}