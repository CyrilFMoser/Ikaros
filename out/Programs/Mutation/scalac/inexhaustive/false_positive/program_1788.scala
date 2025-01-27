package Program_30 

package Program_0 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D](a: Boolean) extends T_A[C, Byte]
case class CC_B[E](a: T_A[Boolean, Byte], b: Char, c: E) extends T_A[E, Byte]

val v_a: T_A[Int, Byte] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(CC_B(_, _, _), 'x', 12) => 1 
  case CC_B(CC_B(_, _, _), _, 12) => 2 
  case CC_B(_, _, _) => 3 
}
}
// This is not matched: (CC_A Int Boolean Wildcard (T_A Int Byte))
// Mutation information: 
// Changing a Wildcard in 12 at pattern position 2 to a constant expression:
// {
//  12
// }
//
// This is not matched: Pattern match is empty without constants
// Mutation information: 
// Deleted Pattern CC_B(CC_A(_), 'x', _) at position 3