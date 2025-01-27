package Program_30 

package Program_10 

object Test {
sealed trait T_A[A]
case class CC_A[B, C](a: Boolean, b: T_A[B], c: T_A[B]) extends T_A[B]

val v_a: T_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_A(_, CC_A(_, _, _), _) => 1 
  case CC_A(_, CC_A(_, _, _), CC_A(_, _, _)) => 2 
}
}
// This is not matched: (CC_A Boolean Boolean Wildcard Wildcard Wildcard (T_A Boolean))
// This is not matched: (CC_B (T_A T_B) Wildcard Wildcard (T_A (T_A T_B)))