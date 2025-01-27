package Program_11 

package Program_7 

object Test {
sealed trait T_A[A]
case class CC_A[B, C](a: T_A[B], b: B, c: T_A[C]) extends T_A[B]

val v_a: T_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _, _), _, CC_A(_, _, _)) => 0 
}
}
// This is not matched: (CC_A Byte Boolean Wildcard Wildcard Wildcard (T_A Byte))
// Mutation information: 
// Expanded _ at position 0 into: 
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