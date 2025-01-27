package Program_28 

package Program_7 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[T_A, Int]) extends T_A
case class CC_B[C](a: T_B[C, CC_A], b: T_A) extends T_A

val v_a: CC_B[T_A] = null
val v_b: Int = v_a match{
  case CC_B(_, CC_B(_, CC_A(_))) => 0 
}
}
// This is not matched: (CC_B T_A Wildcard (CC_A Wildcard T_A) T_A)
// Mutation information: 
// Expanded _ at position 0 into: 
// {
//  CC_A(_)
// }
//
// This is not matched: (CC_E T_A Wildcard Wildcard Wildcard (T_B T_A))