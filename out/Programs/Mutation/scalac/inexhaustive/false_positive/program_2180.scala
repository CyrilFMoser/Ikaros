package Program_5 

object Test {
sealed trait T_B[B]
case class CC_D[D]() extends T_B[D]
case class CC_E[E](a: T_B[E]) extends T_B[E]

val v_a: CC_E[Char] = null
val v_b: Int = v_a match{
  case CC_E(CC_E(CC_D())) => 0 
}
}
// This is not matched: (CC_E Char Byte Wildcard Wildcard Wildcard (T_B Char Byte))
// Mutation information: 
// Deleted Pattern CC_D(12, CC_D(_, _, _), (0,_)) at position 9