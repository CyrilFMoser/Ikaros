package Program_63 

package Program_2 

object Test {
sealed trait T_A
case class CC_A[A](a: A, b: T_A) extends T_A
case class CC_B(a: CC_A[T_A]) extends T_A

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(CC_A(CC_B(_), _)) => 1 
  case CC_B(CC_A(CC_A(_, _), _)) => 1 
}
}
// This is not matched: (CC_A T_A Wildcard Wildcard T_A)
// Mutation information: 
// Expanded _ at position 1 into: 
// {
//  CC_A(_, _)
//  CC_B(_)
// }
//
// This is not matched: (CC_B T_A)
// Mutation information: 
// Expanded _ at position 2 into: 
// {
//  CC_A(_, _, _)
// }
//