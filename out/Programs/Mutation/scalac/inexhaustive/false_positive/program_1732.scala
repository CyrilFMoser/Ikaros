package Program_26 

package Program_21 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[D, C](a: T_A[C, C]) extends T_A[D, C]
case class CC_B[E](a: Int, b: T_A[E, E]) extends T_B

val v_a: CC_B[Char] = null
val v_b: Int = v_a match{
  case CC_B(12, CC_A(_)) => 0 
}
}
// This is not matched: Pattern match is empty without constants
// Mutation information: 
// Expanded _ at position 1 into: 
// {
//  CC_A(_)
// }
//
// This is not matched: (CC_C (T_B (CC_A T_A T_A)) Wildcard Wildcard (T_B (T_B (CC_A T_A T_A))))
// Mutation information: 
// Deleted Pattern CC_C(12, CC_C(_, _)) at position 1