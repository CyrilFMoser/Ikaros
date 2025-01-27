package Program_25 

object Test {
sealed trait T_A[A, B]
case class CC_A[D, C]() extends T_A[D, C]
case class CC_C[F, E](a: T_A[E, E]) extends T_A[F, E]

val v_a: CC_C[Int, Boolean] = null
val v_b: Int = v_a match{
  case CC_C(CC_A()) => 0 
}
}
// This is not matched: (CC_B Byte Boolean Wildcard Wildcard (T_A Byte))
// Mutation information: 
// Expanded _ at position 1 into: 
// {
//  CC_A(_)
//  CC_B(_, _)
// }
//