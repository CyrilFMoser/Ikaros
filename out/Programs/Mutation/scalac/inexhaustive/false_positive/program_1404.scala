package Program_63 

object Test {
sealed trait T_A[A, B]
case class CC_B[D](a: D, b: T_A[D, D]) extends T_A[D, T_A[D, D]]

val v_a: T_A[Int, T_A[Int, Int]] = null
val v_b: Int = v_a match{
  case CC_B(12, _) => 0 
}
}
// This is not matched: Pattern match is empty without constants
// Mutation information: 
// Changing a Wildcard in 12 at pattern position 1 to a constant expression:
// {
//  12
// }
//