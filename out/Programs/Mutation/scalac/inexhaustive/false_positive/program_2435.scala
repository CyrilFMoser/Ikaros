package Program_22 

object Test {
sealed trait T_A
sealed trait T_B[C]
case class CC_B[D]() extends T_B[D]
case class CC_C[E](a: T_B[E], b: T_A, c: T_B[E]) extends T_B[E]

val v_a: CC_C[Boolean] = null
val v_b: Int = v_a match{
  case CC_C(_, _, CC_B()) => 0 
}
}
// This is not matched: (CC_B Wildcard T_A)
// Mutation information: 
// Deleted Pattern CC_C(CC_B(_)) at position 0