package Program_61 

object Test {
sealed trait T_A[A]
case class CC_A(a: Int) extends T_A[Boolean]

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A(12) => 0 
}
}
// This is not matched: (CC_B Wildcard T_A)
// Mutation information: 
// Expanded _ at position 3 into: 
// {
//  CC_A(_, _, _)
// }
//