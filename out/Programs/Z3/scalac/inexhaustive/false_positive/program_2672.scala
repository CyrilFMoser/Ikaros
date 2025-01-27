package Program_30 

package Program_1 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D](a: T_A[C, D], b: T_A[C, D]) extends T_A[T_A[C, C], C]
case class CC_B[E]() extends T_A[T_A[E, E], E]

val v_a: T_A[T_A[Char, Char], Char] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_A(_, _) => 1 
}
}
// This is not matched: (CC_A Char Boolean Wildcard Wildcard (T_A (T_A Char Char) Char))
// This is not matched: (CC_C Byte Wildcard Wildcard (T_B (CC_A Byte Boolean) Byte))