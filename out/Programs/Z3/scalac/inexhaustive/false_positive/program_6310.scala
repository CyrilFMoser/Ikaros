package Program_12 

package Program_4 

object Test {
sealed trait T_A[A]
case class CC_A[B, C](a: T_A[B], b: T_A[C]) extends T_A[B]

val v_a: CC_A[Int, Boolean] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _), _) => 0 
}
}
// This is not matched: (CC_A Int
//      Boolean
//      (CC_A Int Boolean Wildcard Wildcard (T_A Int))
//      Wildcard
//      (T_A Int))
// This is not matched: (CC_A Int (T_A Int))