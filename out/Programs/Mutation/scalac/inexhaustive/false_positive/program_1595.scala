package Program_55 

package Program_6 

object Test {
sealed trait T_A
case class CC_A[A](a: T_A, b: T_A) extends T_A

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, CC_A(_, _)), _) => 0 
  case CC_A(CC_A(_, _), CC_A(_, _)) => 1 
  case CC_A(_, _) => 2 
}
}
// This is not matched: (CC_A T_A Wildcard (CC_A T_A Wildcard Wildcard T_A) T_A)
// Mutation information: 
// Expanded _ at position 0 into: 
// {
//  CC_A(_, _)
// }
//
// This is not matched: (CC_D T_B)