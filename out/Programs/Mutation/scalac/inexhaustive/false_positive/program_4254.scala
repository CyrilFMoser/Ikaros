package Program_30 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: Int) extends T_A[B]

val v_a: CC_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A(12) => 0 
}
}
// This is not matched: (CC_A (CC_C (Tuple (CC_E T_B) (Tuple Wildcard Wildcard)) T_A) T_A)
// Mutation information: 
// Deleted Pattern CC_B(_, CC_C(_)) at position 3