package Program_31 

package Program_10 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: B, b: T_A[B]) extends T_A[Boolean]

val v_a: T_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
}
}
// This is not matched: (CC_A Boolean Wildcard Wildcard (T_A Boolean))
// This is not matched: (CC_A (CC_A (CC_C Wildcard T_A) Byte T_A) Wildcard T_A)