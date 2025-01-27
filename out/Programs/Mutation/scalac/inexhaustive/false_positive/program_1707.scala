package Program_22 

object Test {
sealed trait T_A[A]
case class CC_B[D]() extends T_A[D]
case class CC_C[E](a: T_A[E], b: T_A[E]) extends T_A[E]

val v_a: CC_C[Char] = null
val v_b: Int = v_a match{
  case CC_C(_, CC_C(_, _)) => 0 
}
}
// This is not matched: (CC_A Boolean Wildcard (T_A Boolean))
// Mutation information: 
// Expanded _ at position 0 into: 
// {
//  CC_A(_)
//  CC_B(_, _, _)
// }
//