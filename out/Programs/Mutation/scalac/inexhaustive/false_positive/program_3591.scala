package Program_20 

object Test {
sealed trait T_A
case class CC_A(a: Int) extends T_A

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A(12) => 0 
}
}
// This is not matched: Pattern match is empty without constants
// Mutation information: 
// Changing a Wildcard in 'x' at pattern position 1 to a constant expression:
// {
//  'x'
// }
//