package Program_14 

package Program_9 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: D, b: Byte, c: T_A[D, D]) extends T_A[D, Byte]
case class CC_B[E, F]() extends T_A[E, F]
case class CC_C[G](a: G, b: T_A[G, G]) extends T_A[CC_B[G, G], G]
case class CC_D[H, I]() extends T_B[H]

val v_a: T_B[Char] = null
val v_b: Int = v_a match{
  case CC_D() => 0 
}
}
// This is not matched: (CC_D Char Boolean (T_B Char))
// This is not matched: (CC_B (CC_A Wildcard Wildcard T_A) Wildcard Wildcard T_A)