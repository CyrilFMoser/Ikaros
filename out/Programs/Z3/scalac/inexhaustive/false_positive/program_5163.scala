package Program_15 

package Program_12 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: T_A[B], b: T_A[B]) extends T_A[T_A[Int]]
case class CC_B() extends T_A[T_A[Int]]

val v_a: T_A[T_A[Int]] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_A(_, _) => 1 
  case CC_A(CC_B(), _) => 2 
}
}
// This is not matched: (CC_A Boolean Wildcard Wildcard (T_A (T_A Int)))
// This is not matched: (CC_B (T_A (T_A Int)))