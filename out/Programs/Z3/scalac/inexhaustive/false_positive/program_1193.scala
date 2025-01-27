package Program_31 

package Program_2 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E, F, G]() extends T_A[E, F]
case class CC_B[I, H](a: T_A[H, H], b: I, c: CC_A[H, I, I]) extends T_B[H, I]

val v_a: T_A[Char, Int] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
}
}
// This is not matched: (CC_A Char Int Boolean (T_A Char Int))
// This is not matched: (CC_C Wildcard Wildcard Wildcard T_A)