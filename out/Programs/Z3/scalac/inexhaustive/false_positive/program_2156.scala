package Program_29 

package Program_1 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[E, D](a: D) extends T_A[D, E]
case class CC_B[F, G](a: T_B[G], b: Char, c: T_A[G, F]) extends T_A[T_B[Char], F]
case class CC_C() extends T_A[T_B[Char], Byte]
case class CC_D[H](a: CC_B[CC_C, H], b: CC_B[H, H]) extends T_B[H]

val v_a: CC_A[CC_C, Int] = null
val v_b: Int = v_a match{
  case CC_A(12) => 0 
}
}
// This is not matched: Pattern match is empty without constants
// This is not matched: (CC_B Wildcard Wildcard T_A)