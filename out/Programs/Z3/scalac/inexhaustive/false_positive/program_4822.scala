package Program_14 

package Program_12 

object Test {
sealed trait T_A[A]
case class CC_A[B, C](a: C, b: T_A[C]) extends T_A[B]

val v_a: CC_A[Boolean, Int] = null
val v_b: Int = v_a match{
  case CC_A(12, CC_A(_, _)) => 0 
  case CC_A(12, _) => 1 
}
}
// This is not matched: Pattern match is empty without constants
// This is not matched: (CC_D Int Wildcard (T_B Int))