package Program_25 

object Test {
sealed trait T_A[A]
case class CC_B[E](a: Int) extends T_A[E]

val v_a: CC_B[Boolean] = null
val v_b: Int = v_a match{
  case CC_B(12) => 0 
}
}
// This is not matched: (CC_A Char Wildcard (T_A Char))
// Mutation information: 
// Deleted Pattern CC_B(_, CC_A(_), CC_B(_, _, _)) at position 0