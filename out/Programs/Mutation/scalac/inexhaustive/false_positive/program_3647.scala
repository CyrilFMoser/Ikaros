package Program_6 

package Program_16 

object Test {
sealed trait T_A[A]
case class CC_A[B, C](a: T_A[B], b: B, c: T_A[C]) extends T_A[B]

val v_a: T_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _, _), 0, CC_A(_, _, _)) => 0 
  case CC_A(CC_A(CC_A(_, _, _), _, _), _, CC_A(_, _, _)) => 1 
  case CC_A(_, _, _) => 2 
  case CC_A(_, _, CC_A(_, _, _)) => 3 
  case CC_A(CC_A(_, _, _), 0, _) => 4 
  case CC_A(_, 0, CC_A(_, _, _)) => 5 
}
}
// This is not matched: (CC_A Byte Boolean Wildcard Wildcard Wildcard (T_A Byte))
// Mutation information: 
// Expanded _ at position 1 into: 
// {
//  CC_A(_, _, _)
// }
//
// This is not matched: (CC_A Byte Boolean Wildcard Wildcard Wildcard (T_A Byte))
// Mutation information: 
// Expanded _ at position 4 into: 
// {
//  CC_A(_, _, _)
// }
//