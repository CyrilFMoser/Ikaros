package Program_12 

object Test {
sealed trait T_A[A, B]
case class CC_B(a: T_A[Char, Byte], b: Char) extends T_A[(Char,(Int,Boolean)), T_A[Byte, Boolean]]

val v_a: T_A[(Char,(Int,Boolean)), T_A[Byte, Boolean]] = null
val v_b: Int = v_a match{
  case CC_B(_, 'x') => 0 
}
}
// This is not matched: (CC_A T_A Wildcard T_A)
// Mutation information: 
// Expanded _ at position 4 into: 
// {
//  CC_A(_)
//  CC_B(_, _)
// }
//