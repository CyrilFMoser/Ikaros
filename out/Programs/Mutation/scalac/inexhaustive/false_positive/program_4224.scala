package Program_26 

package Program_18 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_B[D], b: Char, c: Char) extends T_A[D, T_A[D, D]]
case class CC_B[E, F](a: E, b: CC_A[E], c: F) extends T_A[E, CC_A[E]]

val v_a: CC_B[Int, Char] = null
val v_b: Int = v_a match{
  case CC_B(12, _, _) => 0 
  case CC_B(12, CC_A(_, _, _), _) => 1 
  case CC_B(_, _, 'x') => 2 
}
}
// This is not matched: Pattern match is empty without constants
// Mutation information: 
// Changing a Wildcard in 12 at pattern position 1 to a constant expression:
// {
//  12
// }
//
// This is not matched: (CC_B Wildcard T_B)
// Mutation information: 
// Expanded _ at position 1 into: 
// {
//  CC_A(_, _)
// }
//