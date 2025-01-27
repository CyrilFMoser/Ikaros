package Program_31 

package Program_13 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[D, C, E]() extends T_A[C, D]

val v_a: T_A[Byte, Boolean] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
}
}
// This is not matched: (CC_A Boolean Byte T_B (T_A Byte Boolean))
// This is not matched: (CC_B Wildcard T_A)
// Mutation information: 
// Deleted Pattern CC_C(CC_B(_), _, _) at position 0