package Program_16 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: B) extends T_A[B]

val v_a: CC_A[Int] = null
val v_b: Int = v_a match{
  case CC_A(12) => 0 
}
}
// This is not matched: (CC_C Wildcard Wildcard Wildcard T_B)
// Mutation information: 
// Expanded _ at position 1 into: 
// {
//  CC_B()
//  CC_C(_, _, _)
// }
//