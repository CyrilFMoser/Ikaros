package Program_23 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: (T_B[Int, Byte],Byte), b: E) extends T_A[T_A[E, E], E]
case class CC_B[F](a: F, b: T_B[CC_A[F], F]) extends T_A[T_A[F, F], F]
case class CC_C(a: Byte, b: Boolean) extends T_A[T_A[T_B[CC_A[Char], CC_B[Char]], T_B[CC_A[Char], CC_B[Char]]], T_B[CC_A[Char], CC_B[Char]]]
case class CC_D[G](a: T_B[T_B[G, CC_C], G], b: CC_B[G], c: Char) extends T_B[G, CC_C]
case class CC_E[H](a: T_A[H, H], b: T_B[H, H], c: Char) extends T_B[H, T_A[T_A[CC_A[H], CC_A[H]], CC_A[H]]]

val v_a: T_A[T_A[T_B[CC_A[Char], CC_B[Char]], T_B[CC_A[Char], CC_B[Char]]], T_B[CC_A[Char], CC_B[Char]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_C(_, _) => 1 
}
}
// This is not matched: CC_B(_, _)