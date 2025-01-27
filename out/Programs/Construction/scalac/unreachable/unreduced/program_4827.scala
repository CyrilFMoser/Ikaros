package Program_4 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: E, b: T_A[Char, E], c: Byte) extends T_A[T_B[T_A[Byte, Int], T_B[Boolean, Int]], E]
case class CC_B(a: T_A[CC_A[Int], CC_A[Char]]) extends T_A[T_B[T_A[Byte, Int], T_B[Boolean, Int]], CC_A[T_A[Char, Char]]]
case class CC_C[G, F, H](a: CC_B, b: T_B[H, F], c: Int) extends T_B[G, F]
case class CC_D[I](a: I, b: CC_C[I, I, I], c: (T_A[CC_B, Boolean],T_B[CC_B, CC_B])) extends T_B[CC_C[CC_A[CC_B], T_B[CC_B, Char], T_A[CC_B, CC_B]], I]
case class CC_E[J](a: CC_A[J], b: Boolean, c: Byte) extends T_B[CC_C[CC_A[CC_B], T_B[CC_B, Char], T_A[CC_B, CC_B]], J]

val v_a: T_B[CC_C[CC_A[CC_B], T_B[CC_B, Char], T_A[CC_B, CC_B]], CC_B] = null
val v_b: Int = v_a match{
  case CC_C(CC_B(_), _, _) => 0 
  case CC_E(_, _, _) => 1 
}
}
// This is not matched: CC_D(CC_B(_), _, (_,CC_C(_, _, _)))