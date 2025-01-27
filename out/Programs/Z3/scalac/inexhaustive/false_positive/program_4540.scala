package Program_14 

package Program_7 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[F, E, G]() extends T_A[F, E]
case class CC_B[H](a: T_B[H, H]) extends T_B[CC_A[H, H, H], H]

val v_a: T_A[Byte, Char] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
}
}
// This is not matched: (CC_A Byte Char Boolean (T_A Byte Char))
// This is not matched: (CC_B Boolean Wildcard (T_B Boolean))