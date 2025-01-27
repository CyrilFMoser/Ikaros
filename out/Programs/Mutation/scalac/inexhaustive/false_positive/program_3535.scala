package Program_22 

object Test {
sealed trait T_A[A, B]
case class CC_A[D, C](a: T_A[C, D]) extends T_A[C, D]
case class CC_B[E, F]() extends T_A[E, F]

val v_a: CC_A[Int, Boolean] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_)) => 0 
}
}
// This is not matched: Pattern match is empty without constants
// Mutation information: 
// Expanded _ at position 0 into: 
// {
//  CC_A(_, _, _)
// }
//