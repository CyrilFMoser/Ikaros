package Program_53 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C]() extends T_A[C, T_A[C, C]]
case class CC_B(a: Int) extends T_A[CC_A[T_B], T_A[CC_A[T_B], CC_A[T_B]]]

val v_a: CC_B = null
val v_b: Int = v_a match{
  case CC_B(12) => 0 
}
}
// This is not matched: Pattern match is empty without constants
// Mutation information: 
// Changing a Wildcard in 0 at pattern position 0 to a constant expression:
// {
//  0
// }
//