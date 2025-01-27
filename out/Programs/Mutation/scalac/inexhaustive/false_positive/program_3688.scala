package Program_19 

object Test {
sealed trait T_A
case class CC_A() extends T_A
case class CC_B(a: T_A, b: T_A) extends T_A

val v_a: CC_B = null
val v_b: Int = v_a match{
  case CC_B(_, CC_B(_, _)) => 0 
}
}
// This is not matched: (CC_B (CC_B (CC_B Wildcard Wildcard T_A) (CC_C Wildcard T_A) T_A)
//      (CC_A (CC_C Wildcard T_A) (CC_B Wildcard Wildcard T_A) Wildcard T_A)
//      T_A)
// Mutation information: 
// Expanded _ at position 5 into: 
// {
//  CC_A(_, _, _)
// }
//