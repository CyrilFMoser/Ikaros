package Program_31 

package Program_11 

object Test {
sealed trait T_A[A]
case class CC_A[B, C]() extends T_A[B]
case class CC_B[D](a: CC_A[D, D]) extends T_A[D]
case class CC_C[E](a: E, b: CC_A[E, E]) extends T_A[E]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_) => 1 
  case CC_C('x', CC_A()) => 2 
  case CC_C(_, _) => 3 
  case CC_C(_, CC_A()) => 4 
  case CC_C('x', _) => 5 
}
}
// This is not matched: (CC_A Char Boolean (T_A Char))
// This is not matched: (CC_A Wildcard (T_A (T_B Byte) (Tuple Char Char)))