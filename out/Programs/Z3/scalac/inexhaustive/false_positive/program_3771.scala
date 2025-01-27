package Program_14 

package Program_14 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: B, b: T_A[Boolean], c: T_A[Boolean]) extends T_A[Boolean]

val v_a: T_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
}
}
// This is not matched: (CC_A Boolean Wildcard Wildcard Wildcard (T_A Boolean))
// This is not matched: (CC_A (T_A Boolean) Wildcard Wildcard Wildcard (T_A Boolean))