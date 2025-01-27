package Program_62 

object Test {
sealed trait T_A[A]
case class CC_B[E](a: E) extends T_A[E]

val v_a: CC_B[Int] = null
val v_b: Int = v_a match{
  case CC_B(12) => 0 
}
}
// This is not matched: (CC_C Wildcard (CC_B Wildcard T_A) (CC_A (CC_B Wildcard T_A) Boolean T_A) T_B)
// Mutation information: 
// Expanded _ at position 1 into: 
// {
//  CC_A(_, _)
// }
//