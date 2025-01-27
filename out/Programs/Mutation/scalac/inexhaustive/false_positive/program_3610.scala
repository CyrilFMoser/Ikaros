package Program_20 

package Program_26 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D, E](a: T_A[D, E], b: T_A[D, E]) extends T_A[D, C]
case class CC_B(a: ((Byte,Char),Boolean), b: Int, c: (Boolean,Boolean)) extends T_A[T_A[Boolean, Boolean], Char]

val v_a: T_A[Boolean, CC_B] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, _)) => 0 
}
}
// This is not matched: (CC_A (CC_B Boolean Boolean Boolean Boolean)
//      Boolean
//      Boolean
//      Wildcard
//      Wildcard
//      (T_A Boolean (CC_B Boolean Boolean Boolean Boolean)))
// Mutation information: 
// Expanded _ at position 0 into: 
// {
//  CC_A(_, _)
// }
//
// This is not matched: (CC_C Wildcard Wildcard Wildcard T_B)
// Mutation information: 
// Expanded _ at position 1 into: 
// {
//  CC_B()
//  CC_C(_, _, _)
// }
//