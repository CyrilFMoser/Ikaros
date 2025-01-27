package Program_23 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_D[D]() extends T_B[D]
case class CC_E[E](a: T_B[E]) extends T_B[E]

val v_a: CC_E[Char] = null
val v_b: Int = v_a match{
  case CC_E(CC_E(_)) => 0 
}
}
// This is not matched: (CC_E Char (CC_D Char Wildcard Char (T_B Char)) Wildcard (T_B Char))
// Mutation information: 
// Expanded _ at position 0 into: 
// {
//  CC_C(_)
// }
//