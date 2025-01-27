package Program_63 

object Test {
sealed trait T_B
case class CC_B(a: Char) extends T_B

val v_a: CC_B = null
val v_b: Int = v_a match{
  case CC_B('x') => 0 
}
}
// This is not matched: (CC_C Wildcard (T_B (CC_B Boolean Boolean)))
// Mutation information: 
// Expanded _ at position 1 into: 
// {
//  CC_C(_)
// }
//