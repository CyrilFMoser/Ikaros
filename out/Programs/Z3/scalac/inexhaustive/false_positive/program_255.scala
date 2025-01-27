package Program_31 

package Program_3 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[Int]) extends T_A[T_A[Int]]
case class CC_B[B, C](a: T_A[CC_A], b: CC_A) extends T_A[B]

val v_a: T_A[T_A[T_A[Int]]] = null
val v_b: Int = v_a match{
  case CC_B(CC_B(_, _), _) => 0 
  case CC_B(CC_B(_, _), CC_A(_)) => 1 
  case CC_B(_, _) => 2 
}
}
// This is not matched: (CC_B (T_A (T_A Int)) Boolean Wildcard Wildcard (T_A (T_A (T_A Int))))
// This is not matched: (CC_B Wildcard Wildcard Wildcard T_A)