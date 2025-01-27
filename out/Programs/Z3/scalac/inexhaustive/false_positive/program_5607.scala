package Program_12 

package Program_7 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: T_A[B], b: B, c: T_A[B]) extends T_A[T_A[Boolean]]

val v_a: T_A[T_A[Boolean]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
}
}
// This is not matched: (CC_A Boolean Wildcard Wildcard Wildcard (T_A (T_A Boolean)))
// This is not matched: (CC_C Wildcard Wildcard Wildcard (T_A (CC_B Boolean Boolean)))