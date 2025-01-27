package Program_15 

package Program_15 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: B, b: T_A[Boolean], c: T_A[Boolean]) extends T_A[Boolean]

val v_a: T_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, _, _), _) => 0 
  case CC_A(_, _, CC_A(_, _, _)) => 1 
}
}
// This is not matched: (CC_A (T_A Boolean) Wildcard Wildcard Wildcard (T_A Boolean))
// This is not matched: (CC_A (T_A Boolean) Wildcard Wildcard Wildcard (T_A Boolean))