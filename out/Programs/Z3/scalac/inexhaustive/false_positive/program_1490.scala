package Program_31 

package Program_7 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D, E](a: T_A[D, D]) extends T_A[D, C]

val v_a: T_A[Boolean, Char] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
}
}
// This is not matched: (CC_A Char Boolean Boolean Wildcard (T_A Boolean Char))
// This is not matched: (CC_E Wildcard Wildcard T_B)