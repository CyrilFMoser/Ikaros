package Program_18 

object Test {
sealed trait T_A
case class CC_A(a: T_A) extends T_A
case class CC_C() extends T_A

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_)) => 0 
}
}
// This is not matched: (CC_A Wildcard (Tuple (CC_C T_A) (CC_A (CC_C T_A) Wildcard T_A)) T_A)
// Mutation information: 
// Expanded _ at position 8 into: 
// {
//  CC_A(_, _)
// }
//