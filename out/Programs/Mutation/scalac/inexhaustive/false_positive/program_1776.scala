package Program_24 

package Program_18 

object Test {
sealed trait T_A
case class CC_A[A](a: T_A, b: T_A) extends T_A

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, _)) => 0 
}
}
// This is not matched: (CC_A T_A (CC_A T_A Wildcard Wildcard T_A) Wildcard T_A)
// Mutation information: 
// Deleted Pattern CC_A(CC_A(_, _), _) at position 1
// This is not matched: (CC_A Int Boolean Wildcard (T_A Int Byte))
// Mutation information: 
// Expanded _ at position 2 into: 
// {
//  CC_A(_)
//  CC_B(_, _, _)
// }
//