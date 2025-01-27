package Program_28 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[D, C](a: T_A[D, T_B]) extends T_A[D, C]
case class CC_B[F, E]() extends T_A[E, F]

val v_a: CC_A[T_B, T_B] = null
val v_b: Int = v_a match{
  case CC_A(CC_B()) => 0 
}
}
// This is not matched: Pattern match is empty without constants
// Mutation information: 
// Expanded _ at position 0 into: 
// {
//  CC_A(_, _)
// }
//