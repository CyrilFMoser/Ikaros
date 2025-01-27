package Program_18 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_B[D](a: T_A[T_B, D], b: T_A[T_B, D]) extends T_A[T_B, D]
case class CC_C[E]() extends T_A[T_B, E]

val v_a: CC_B[Byte] = null
val v_b: Int = v_a match{
  case CC_B(_, CC_B(_, _)) => 0 
}
}
// This is not matched: (CC_B Wildcard Wildcard (T_B Char))
// Mutation information: 
// Expanded _ at position 0 into: 
// {
//  CC_A(_)
// }
//