package Program_31 

package Program_7 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D](a: T_A[D, Byte]) extends T_A[C, T_A[C, C]]
case class CC_B(a: CC_A[Byte, Int]) extends T_A[T_A[Int, Boolean], T_A[T_A[Int, Boolean], T_A[Int, Boolean]]]

val v_a: T_A[Int, T_A[Int, Int]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
}
}
// This is not matched: (CC_A Int Boolean Wildcard (T_A Int (T_A Int Int)))
// This is not matched: (CC_E Boolean Wildcard Wildcard Wildcard Boolean (T_B (CC_B T_A) Boolean))