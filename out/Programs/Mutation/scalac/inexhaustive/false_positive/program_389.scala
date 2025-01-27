package Program_58 

package Program_1 

object Test {
sealed trait T_A
case class CC_A[A](a: T_A, b: T_A) extends T_A

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, CC_A(_, _)), CC_A(_, _)) => 0 
  case CC_A(CC_A(_, CC_A(_, CC_A(_, _))), CC_A(CC_A(_, _), CC_A(_, _))) => 1 
}
}
// This is not matched: (CC_A T_A Wildcard Wildcard T_A)
// Mutation information: 
// Expanded _ at position 1 into: 
// {
//  CC_A(_, _)
// }
//
// This is not matched: (CC_B Int T_A (T_B Int T_A))
// Mutation information: 
// Deleted Pattern CC_D(_, _, CC_C((_,_), CC_A())) at position 6