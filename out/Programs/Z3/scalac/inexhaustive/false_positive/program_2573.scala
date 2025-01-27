package Program_30 

package Program_4 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C, D]() extends T_A[C, D]
case class CC_B[E, F](a: CC_A[E, Byte], b: Int) extends T_A[F, E]
case class CC_C[G](a: Int, b: T_A[T_B, G]) extends T_A[G, T_B]
case class CC_D() extends T_B
case class CC_E[H](a: Char, b: CC_C[H]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_D() => 0 
  case CC_E(_, CC_C(_, _)) => 1 
  case CC_E('x', _) => 2 
}
}
// This is not matched: (CC_E (T_A T_B T_B) Wildcard Wildcard T_B)
// This is not matched: (CC_B Wildcard Wildcard Wildcard T_A)