package Program_13 

object Test {
sealed trait T_A
case class CC_A(a: T_A, b: T_A, c: T_A) extends T_A
case class CC_B() extends T_A

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A(_, _, CC_A(_, _, _)) => 0 
}
}
// This is not matched: (CC_A Wildcard (CC_A Wildcard (CC_B T_A) (CC_B T_A) T_A) (CC_B T_A) T_A)
// Mutation information: 
// Expanded _ at position 2 into: 
// {
//  CC_A(_, _, _)
// }
//