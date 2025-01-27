package Program_31 

object Test {
sealed trait T_A
case class CC_A(a: (Char,T_A)) extends T_A

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A(('x',_)) => 0 
}
}
// This is not matched: Pattern match is empty without constants
// Mutation information: 
// Changing a Wildcard in 0 at pattern position 3 to a constant expression:
// {
//  0
// }
//