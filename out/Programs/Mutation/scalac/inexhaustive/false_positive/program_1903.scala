package Program_31 

package Program_2 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A[B](a: T_A[B]) extends T_A[B]
case class CC_B[C, D](a: Int) extends T_A[C]
case class CC_C(a: T_A[T_B], b: CC_A[T_B]) extends T_B
case class CC_D() extends T_B
case class CC_E(a: T_A[CC_D]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_D() => 0 
  case CC_C(_, _) => 1 
  case CC_E(CC_B(_)) => 2 
  case CC_E(CC_A(CC_B(_))) => 3 
  case CC_E(CC_A(CC_A(_))) => 3 
}
}
// This is not matched: (CC_E (CC_B (CC_D Wildcard) T_B Int (T_A (CC_D Wildcard))) T_B)
// Mutation information: 
// Expanded _ at position 3 into: 
// {
//  CC_A(_)
//  CC_B(_)
// }
//
// This is not matched: (CC_C Wildcard Wildcard T_A)
// Mutation information: 
// Deleted Pattern CC_A('x', _, _) at position 1