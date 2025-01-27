package Program_15 

package Program_3 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[D, C, E]() extends T_A[C, D]

val v_a: T_A[Char, Char] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
}
}
// This is not matched: (CC_A Char Char T_B (T_A Char Char))
// This is not matched: (CC_A Wildcard Wildcard T_A)