package Program_31 

package Program_2 

object Test {
sealed trait T_A[A]
case class CC_A[B, C](a: T_A[B]) extends T_A[B]

val v_a: T_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
}
}
// This is not matched: (CC_A Boolean Boolean Wildcard (T_A Boolean))
// This is not matched: (CC_F Int Wildcard Wildcard Int (T_B Int))