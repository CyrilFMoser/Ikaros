package Program_14 

object Test {
sealed trait T_A
case class CC_A(a: Int) extends T_A

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A(12) => 0 
}
}
// This is not matched: (CC_A Wildcard
//      Wildcard
//      (CC_A Wildcard Wildcard (CC_A Int Wildcard Wildcard T_A) T_A)
//      T_A)
// Mutation information: 
// Expanded _ at position 2 into: 
// {
//  CC_A(_, _, _)
// }
//