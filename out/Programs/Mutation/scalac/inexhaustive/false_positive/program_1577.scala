package Program_62 

package Program_0 

object Test {
sealed trait T_A
case class CC_A[A](a: T_A, b: A) extends T_A

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _), _) => 0 
}
}
// This is not matched: (CC_A T_A Wildcard Wildcard T_A)
// Mutation information: 
// Expanded _ at position 0 into: 
// {
//  CC_A(_, _)
// }
//
// This is not matched: Pattern match is empty without constants
// Mutation information: 
// Deleted Pattern CC_B('x', CC_A(_, _), _) at position 4