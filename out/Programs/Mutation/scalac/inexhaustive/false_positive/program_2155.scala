package Program_30 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E]() extends T_A[E, T_B[E, E]]
case class CC_E[I, J](a: T_A[J, I], b: Char) extends T_B[I, J]

val v_a: T_B[Char, Byte] = null
val v_b: Int = v_a match{
  case CC_E(_, 'x') => 0 
}
}
// This is not matched: (CC_E Char Byte Wildcard Wildcard Wildcard (T_B Char Byte))
// Mutation information: 
// Deleted Pattern CC_D(12, CC_D(_, _, _), (0,_)) at position 9