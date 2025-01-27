package Program_15 

package Program_2 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[E, D](a: E) extends T_A[D, E]
case class CC_B[F](a: Boolean, b: F, c: F) extends T_A[F, T_A[F, F]]
case class CC_C[G]() extends T_A[G, T_A[G, G]]
case class CC_D(a: T_B[(Boolean,Int)], b: CC_A[Char, Int]) extends T_B[CC_A[Char, Int]]
case class CC_E[H](a: T_A[H, H], b: Boolean) extends T_B[CC_A[Char, Int]]

val v_a: T_B[CC_A[Char, Int]] = null
val v_b: Int = v_a match{
  case CC_D(_, _) => 0 
  case CC_E(_, _) => 1 
}
}
// This is not matched: (CC_E Boolean Wildcard Wildcard (T_B (CC_A Char Int Boolean Boolean)))
// This is not matched: (CC_B Byte Wildcard Wildcard (T_A Byte))