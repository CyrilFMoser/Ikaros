package Program_30 

package Program_15 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: T_A[B], b: T_A[B]) extends T_A[T_A[Boolean]]

val v_a: T_A[T_A[Boolean]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_A(CC_A(_, _), CC_A(_, _)) => 1 
}
}
// This is not matched: (CC_A Boolean Wildcard Wildcard (T_A (T_A Boolean)))
// This is not matched: (CC_A Boolean Wildcard Wildcard (T_A (T_A Boolean)))