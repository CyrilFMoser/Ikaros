package Program_14 

package Program_15 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D, E](a: T_A[D], b: T_A[D]) extends T_A[D]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, _)) => 0 
}
}
// This is not matched: (CC_A Char Boolean Wildcard Wildcard (T_A Char))
// This is not matched: (CC_A Char Boolean Wildcard Wildcard (T_A Char))