package Program_30 

package Program_4 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E, F](a: T_A[F, F], b: F, c: E) extends T_A[F, E]
case class CC_B[G, H]() extends T_A[H, G]
case class CC_C[I, J](a: T_B[Boolean, Boolean]) extends T_B[I, Boolean]

val v_a: T_B[Char, Boolean] = null
val v_b: Int = v_a match{
  case CC_C(_) => 0 
}
}
// This is not matched: (CC_C Char Boolean Wildcard (T_B Char Boolean))
// This is not matched: (CC_A Char Byte Wildcard Wildcard (T_A Char Byte))