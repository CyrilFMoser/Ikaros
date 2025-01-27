package Program_28 

package Program_5 

object Test {
sealed trait T_A[A]
case class CC_A[B, C](a: T_A[B], b: T_A[B]) extends T_A[B]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _), _) => 0 
}
}
// This is not matched: (CC_A Char (T_A Boolean) Wildcard Wildcard (T_A Char))
// This is not matched: (CC_C Wildcard Wildcard (T_A (T_A Int)))