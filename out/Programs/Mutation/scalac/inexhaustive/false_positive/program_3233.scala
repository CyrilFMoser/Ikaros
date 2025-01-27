package Program_31 

package Program_29 

object Test {
sealed trait T_A
case class CC_A(a: T_A) extends T_A
case class CC_B[A](a: CC_A, b: (CC_A,CC_A), c: A) extends T_A
case class CC_C() extends T_A

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_) => 1 
  case CC_B(CC_A(_), _, _) => 2 
  case CC_B(_, (CC_A(_),CC_A(_)), _) => 3 
  case CC_C() => 4 
}
}
// This is not matched: (CC_B T_A Wildcard Wildcard Wildcard T_A)
// Mutation information: 
// Deleted Pattern CC_A(CC_C()) at position 0
// This is not matched: (CC_B T_A Wildcard Wildcard Wildcard T_A)
// Mutation information: 
// Expanded _ at position 1 into: 
// {
//  CC_A(_)
// }
//