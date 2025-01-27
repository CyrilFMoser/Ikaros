package Program_30 

package Program_10 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D, E](a: E, b: T_A[C, C]) extends T_A[C, D]

val v_a: T_A[Boolean, Char] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
}
}
// This is not matched: (CC_A Boolean Char Boolean Wildcard Wildcard (T_A Boolean Char))
// This is not matched: (CC_B T_A T_A)