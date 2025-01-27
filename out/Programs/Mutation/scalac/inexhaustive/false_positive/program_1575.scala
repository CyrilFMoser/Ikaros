package Program_41 

package Program_19 

object Test {
sealed trait T_A
case class CC_A[A](a: T_A, b: ((Char,Boolean),Boolean), c: T_A) extends T_A
case class CC_B() extends T_A

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_A(CC_A(_, _, _), ((_,_),_), _) => 1 
  case CC_A(CC_A(_, _, _), _, _) => 2 
  case CC_A(CC_B(), ((_,_),_), _) => 3 
}
}
// This is not matched: (CC_A T_A (CC_B T_A) Wildcard Wildcard T_A)
// Mutation information: 
// Expanded _ at position 3 into: 
// {
//  CC_A(_, _, _)
//  CC_B()
// }
//
// This is not matched: (CC_A T_A Wildcard Wildcard T_A)