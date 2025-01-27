package Program_20 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E, F](a: Boolean, b: E, c: F) extends T_A[T_B[T_A[(Int,Boolean), Boolean], T_B[Char, Byte]], E]
case class CC_B() extends T_A[T_B[T_A[(Int,Boolean), Boolean], T_B[Char, Byte]], T_B[T_A[Byte, Char], CC_A[Char, Boolean]]]
case class CC_C[G, H](a: Char, b: CC_A[H, H], c: (CC_B,T_A[CC_B, CC_B])) extends T_B[G, H]
case class CC_D[I, J]() extends T_B[I, J]
case class CC_E[K](a: T_A[K, K], b: CC_D[K, K], c: CC_D[K, K]) extends T_B[T_B[CC_A[Byte, CC_B], CC_D[CC_B, CC_B]], K]

val v_a: T_B[T_B[CC_A[Byte, CC_B], CC_D[CC_B, CC_B]], Char] = null
val v_b: Int = v_a match{
  case CC_C(_, _, _) => 0 
  case CC_E(_, _, _) => 1 
}
}
// This is not matched: CC_D()