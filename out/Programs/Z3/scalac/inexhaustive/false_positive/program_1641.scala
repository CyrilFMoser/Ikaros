package Program_31 

package Program_15 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D, E](a: Int, b: T_A[Byte, E]) extends T_A[D, C]

val v_a: T_A[Boolean, Char] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_A(12, CC_A(_, _)) => 1 
}
}
// This is not matched: (CC_A Char Boolean Boolean Wildcard Wildcard (T_A Boolean Char))
// This is not matched: (CC_A Char Boolean Boolean Wildcard Wildcard (T_A Boolean Char))