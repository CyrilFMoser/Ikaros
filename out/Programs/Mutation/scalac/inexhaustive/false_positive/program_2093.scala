package Program_29 

object Test {
sealed trait T_A
case class CC_A(a: (Char,T_A)) extends T_A

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A(('x',_)) => 0 
}
}
// This is not matched: (CC_A Wildcard Wildcard Wildcard T_A)
// Mutation information: 
// Expanded _ at position 3 into: 
// {
//  CC_A(_, _, _)
//  CC_B(_, _, _)
// }
//