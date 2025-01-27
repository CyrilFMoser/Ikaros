package Program_49 

package Program_27 

object Test {
sealed trait T_A
case class CC_A[A](a: T_A, b: T_A) extends T_A

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(CC_A(_, _), _)) => 0 
  case CC_A(_, _) => 1 
  case CC_A(CC_A(_, CC_A(_, _)), _) => 2 
  case CC_A(CC_A(_, _), CC_A(_, _)) => 3 
}
}
// This is not matched: (CC_A T_A Wildcard Wildcard T_A)
// Mutation information: 
// Expanded _ at position 4 into: 
// {
//  CC_A(_, _)
// }
//
// This is not matched: (CC_A T_A Wildcard Wildcard T_A)
// Mutation information: 
// Expanded _ at position 0 into: 
// {
//  CC_A(_, _)
// }
//