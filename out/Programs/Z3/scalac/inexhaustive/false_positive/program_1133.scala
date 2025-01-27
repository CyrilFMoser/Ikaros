package Program_28 

package Program_9 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A[B, C](a: T_A[B]) extends T_A[B]
case class CC_B(a: T_A[Boolean], b: T_A[T_B]) extends T_A[CC_A[T_B, T_B]]

val v_a: T_A[T_A[CC_A[T_B, T_B]]] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_)) => 0 
}
}
// This is not matched: (CC_A (T_A (CC_A T_B T_B T_B (T_A T_B)))
//      T_B
//      Wildcard
//      (T_A (T_A (CC_A T_B T_B T_B (T_A T_B)))))
// This is not matched: (CC_A (Tuple (CC_B Wildcard T_A) (CC_B Wildcard T_A)) (CC_B Wildcard T_A) T_A)