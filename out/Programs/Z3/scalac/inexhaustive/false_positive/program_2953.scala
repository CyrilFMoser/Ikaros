package Program_15 

package Program_10 

object Test {
sealed trait T_A[A]
case class CC_A[B, C](a: T_A[B]) extends T_A[B]

val v_a: CC_A[Int, Boolean] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_)) => 0 
}
}
// This is not matched: (CC_A Int
//      Boolean
//      (CC_A Int Boolean (CC_A Int Boolean Wildcard (T_A Int)) (T_A Int))
//      (T_A Int))
// This is not matched: (CC_A Char Char Wildcard (T_A Char Char))