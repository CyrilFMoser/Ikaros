package Program_19 

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
// This is not matched: Pattern match is empty without constants
// Mutation information: 
// Deleted Pattern CC_D(_, CC_D(_, _, _), (0,0)) at position 4