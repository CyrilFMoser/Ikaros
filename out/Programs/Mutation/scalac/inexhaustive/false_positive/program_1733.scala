package Program_25 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_B(a: Int) extends T_B

val v_a: CC_B = null
val v_b: Int = v_a match{
  case CC_B(12) => 0 
}
}
// This is not matched: (CC_C (T_B (CC_A T_A T_A)) Wildcard Wildcard (T_B (T_B (CC_A T_A T_A))))
// Mutation information: 
// Deleted Pattern CC_C(12, CC_C(_, _)) at position 1