package Program_31 

package Program_11 

object Test {
sealed trait T_A[A]
case class CC_A[B, C](a: Boolean, b: T_A[B], c: T_A[C]) extends T_A[B]
case class CC_B() extends T_A[CC_A[Int, Int]]

val v_a: CC_A[Boolean, T_A[CC_A[Int, Int]]] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, _, _), CC_A(_, _, _)) => 0 
}
}
// This is not matched: (CC_A Boolean
//      (T_A (CC_A Int Int Boolean Boolean Boolean Boolean))
//      Wildcard
//      (CC_A Boolean Boolean Wildcard Wildcard Wildcard (T_A Boolean))
//      Wildcard
//      (T_A Boolean))
// This is not matched: (CC_B (CC_E T_B T_B) (T_A (CC_E T_B T_B)))