package Program_23 

object Test {
sealed trait T_A[A]
case class CC_C[D](a: Char) extends T_A[D]

val v_a: CC_C[Int] = null
val v_b: Int = v_a match{
  case CC_C('x') => 0 
}
}
// This is not matched: (CC_B T_A Wildcard Wildcard Wildcard T_A)
// Mutation information: 
// Expanded _ at position 2 into: 
// {
//  CC_A(_, _, _)
// }
//