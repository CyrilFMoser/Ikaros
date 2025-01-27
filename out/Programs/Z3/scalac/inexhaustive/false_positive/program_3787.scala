package Program_13 

package Program_15 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D](a: T_A[D, D]) extends T_A[C, T_A[C, C]]

val v_a: T_A[Boolean, T_A[Boolean, Boolean]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
}
}
// This is not matched: (CC_A Boolean Boolean Wildcard (T_A Boolean (T_A Boolean Boolean)))
// This is not matched: (CC_A Boolean Boolean Wildcard (T_A Boolean (T_A Boolean Boolean)))