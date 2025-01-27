package Program_27 

package Program_1 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[Char]) extends T_A[T_A[Boolean]]
case class CC_B[B](a: (CC_A,CC_A)) extends T_A[T_A[Boolean]]

val v_a: T_A[T_A[Boolean]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_) => 1 
}
}
// This is not matched: (CC_B Boolean
//      (Tuple Wildcard (CC_A Wildcard (T_A (T_A Boolean))))
//      (T_A (T_A Boolean)))
// This is not matched: (CC_A Int (CC_A Int Wildcard Wildcard (T_A Int)) Wildcard (T_A Int))