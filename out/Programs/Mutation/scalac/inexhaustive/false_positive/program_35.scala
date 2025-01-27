package Program_61 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: Int) extends T_A[D]
case class CC_B[E](a: T_B[Boolean, E], b: CC_A[E]) extends T_B[CC_A[Boolean], E]

val v_a: T_B[CC_A[Boolean], Int] = null
val v_b: Int = v_a match{
  case CC_B(_, CC_A(12)) => 0 
}
}
// This is not matched: Pattern match is empty without constants
// Mutation information: 
// Changing a Wildcard in 12 at pattern position 1 to a constant expression:
// {
//  12
// }
//