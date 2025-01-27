package Program_31 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: Char) extends T_A[B]

val v_a: CC_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A('x') => 0 
}
}
// This is not matched: (CC_B T_A)
// Mutation information: 
// Deleted Pattern CC_A(_, CC_A(_, _)) at position 4