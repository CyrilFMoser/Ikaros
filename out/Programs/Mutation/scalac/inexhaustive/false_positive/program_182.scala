package Program_63 

package Program_23 

object Test {
sealed trait T_A
sealed trait T_B
case class CC_A[A](a: A, b: T_B, c: T_A) extends T_A
case class CC_B(a: Byte) extends T_A
case class CC_C[B]() extends T_B

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_B(_) => 0 
  case CC_A(_, CC_C(), CC_A(_, _, _)) => 1 
  case CC_A(_, CC_C(), CC_B(_)) => 2 
  case CC_A(_, _, CC_A(_, _, CC_A(_, _, _))) => 3 
  case CC_A(_, _, CC_A(_, CC_C(), _)) => 4 
}
}
// This is not matched: (CC_A T_A Wildcard Wildcard Wildcard T_A)
// Mutation information: 
// Expanded _ at position 1 into: 
// {
//  CC_A(_, _, _)
// }
//
// This is not matched: (CC_A T_A Wildcard Wildcard Wildcard T_A)
// Mutation information: 
// Expanded _ at position 3 into: 
// {
//  CC_A(_, _, _)
//  CC_B(_)
// }
//