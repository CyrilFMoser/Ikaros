package Program_30 

package Program_15 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D, E](a: T_A[C, D], b: T_A[E, E]) extends T_A[C, D]

val v_a: T_A[Int, Byte] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, CC_A(_, _)), _) => 0 
}
}
// This is not matched: (CC_A Int Byte Boolean Wildcard Wildcard (T_A Int Byte))
// Mutation information: 
// Expanded _ at position 0 into: 
// {
//  CC_A(_, _)
// }
//
// This is not matched: (CC_A Byte (T_A Byte))
// Mutation information: 
// Expanded _ at position 2 into: 
// {
//  CC_A()
//  CC_B(_, _, _)
// }
//