package Program_31 

package Program_22 

object Test {
sealed trait T_A
case class CC_A[A](a: A, b: T_A, c: A) extends T_A

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, CC_A(_, _, _), _), _) => 0 
}
}
// This is not matched: (CC_A T_A Wildcard Wildcard Wildcard T_A)
// Mutation information: 
// Expanded _ at position 0 into: 
// {
//  CC_A(_, _, _)
// }
//
// This is not matched: (CC_A Int Byte Wildcard (CC_B Int Int (T_A Int Int)) (T_A Byte Int))
// Mutation information: 
// Expanded _ at position 2 into: 
// {
//  CC_A(_, _)
// }
//