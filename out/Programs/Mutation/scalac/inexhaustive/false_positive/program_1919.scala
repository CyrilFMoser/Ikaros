package Program_18 

package Program_1 

object Test {
sealed trait T_A[A]
case class CC_A[B, C](a: T_A[B], b: T_A[B]) extends T_A[B]

val v_a: T_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _), CC_A(_, _)) => 0 
}
}
// This is not matched: (CC_A Byte Boolean Wildcard Wildcard (T_A Byte))
// This is not matched: (CC_B Boolean (T_A Boolean))
// Mutation information: 
// Expanded _ at position 0 into: 
// {
//  CC_A(_, _)
// }
//