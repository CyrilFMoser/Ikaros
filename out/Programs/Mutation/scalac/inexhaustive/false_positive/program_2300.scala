package Program_19 

object Test {
sealed trait T_A
case class CC_A(a: Char, b: Int, c: T_A) extends T_A
case class CC_C() extends T_A

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A(_, _, CC_C()) => 0 
}
}
// This is not matched: (CC_A Wildcard Wildcard (CC_C T_A) T_A)
// Mutation information: 
// Expanded _ at position 5 into: 
// {
//  CC_A(_, _, _)
//  CC_B(_)
// }
//