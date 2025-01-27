package Program_31 

package Program_4 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C, D]() extends T_A[C]
case class CC_B[E](a: T_A[E]) extends T_B[E]

val v_a: T_B[Char] = null
val v_b: Int = v_a match{
  case CC_B(CC_A()) => 0 
}
}
// This is not matched: (CC_B Char (CC_A Char Boolean (T_A Char)) (T_B Char))
// This is not matched: (CC_A Wildcard Wildcard Wildcard T_A)