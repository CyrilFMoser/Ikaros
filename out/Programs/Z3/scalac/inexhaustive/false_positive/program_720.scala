package Program_30 

package Program_11 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D, E](a: T_A[E, E]) extends T_A[C, D]

val v_a: T_A[Boolean, Char] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
}
}
// This is not matched: (CC_A Boolean Char Boolean Wildcard (T_A Boolean Char))
// This is not matched: Pattern match is empty without constants