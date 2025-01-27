package Program_22 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: D) extends T_A[D, T_A[D, D]]
case class CC_B[E]() extends T_A[E, T_A[E, E]]
case class CC_C[G, F]() extends T_A[G, F]
case class CC_D[H](a: T_A[H, H], b: CC_A[H]) extends T_B[CC_B[CC_A[Byte]]]
case class CC_E(a: T_B[T_A[Int, Boolean]]) extends T_B[CC_B[CC_A[Byte]]]
case class CC_F(a: (T_A[Int, CC_E],(CC_E,CC_E)), b: Byte) extends T_B[CC_B[CC_A[Byte]]]

val v_a: T_B[CC_B[CC_A[Byte]]] = null
val v_b: Int = v_a match{
  case CC_E(_) => 0 
  case CC_F(_, _) => 1 
}
}
// This is not matched: CC_D(_, _)