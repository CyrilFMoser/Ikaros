package Program_3 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E, F](a: Char, b: T_B[E, F], c: T_A[E, F]) extends T_A[E, T_B[T_A[E, E], E]]
case class CC_B[G]() extends T_A[G, T_B[T_A[G, G], G]]
case class CC_C[H, I](a: T_A[I, H], b: H, c: T_B[I, I]) extends T_B[H, I]
case class CC_D[J](a: CC_C[Char, J], b: T_B[T_A[J, J], J], c: Boolean) extends T_B[(T_B[Boolean, Byte],CC_A[Byte, Boolean]), J]

val v_a: T_A[Byte, T_B[T_A[Byte, Byte], Byte]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
}
}
// This is not matched: CC_B()