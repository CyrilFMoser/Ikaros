package Program_21 

package Program_27 

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
// Changing a Wildcard in 'x' at pattern position 1 to a constant expression:
// {
//  'x'
// }
//
// This is not matched: (CC_A Int Boolean Wildcard (T_A Int Byte))
// Mutation information: 
// Expanded _ at position 2 into: 
// {
//  CC_A(_)
//  CC_B(_, _, _)
// }
//