package Program_31 

object Test {
sealed trait T_A[A, B]
case class CC_A[F, E](a: F) extends T_A[F, E]

val v_a: CC_A[Int, Boolean] = null
val v_b: Int = v_a match{
  case CC_A(12) => 0 
}
}
// This is not matched: (CC_D T_B)
// Mutation information: 
// Expanded _ at position 2 into: 
// {
//  CC_C()
// }
//