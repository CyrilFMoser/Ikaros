package Program_61 

package Program_20 

object Test {
sealed trait T_A
case class CC_A[A](a: A, b: T_A, c: T_A) extends T_A
case class CC_B() extends T_A

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, CC_B(), CC_A(_, CC_B(), _)) => 0 
  case CC_A(_, CC_B(), CC_A(_, CC_A(_, _, _), _)) => 0 
  case CC_A(_, _, _) => 1 
  case CC_B() => 2 
}
}
// This is not matched: (CC_A T_A Wildcard Wildcard Wildcard T_A)
// Mutation information: 
// Expanded _ at position 0 into: 
// {
//  CC_A(_, _, _)
//  CC_B()
// }
//
// This is not matched: (CC_B T_A)
// Mutation information: 
// Expanded _ at position 0 into: 
// {
//  CC_A(_, _, _)
// }
//