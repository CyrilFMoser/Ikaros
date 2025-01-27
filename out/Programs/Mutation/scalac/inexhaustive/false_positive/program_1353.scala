package Program_62 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D](a: D) extends T_A[C, D]

val v_a: CC_A[Int, Byte] = null
val v_b: Int = v_a match{
  case CC_A(0) => 0 
}
}
// This is not matched: (CC_A Wildcard Wildcard Wildcard T_A)
// Mutation information: 
// Expanded _ at position 0 into: 
// {
//  CC_C(_, _)
// }
//