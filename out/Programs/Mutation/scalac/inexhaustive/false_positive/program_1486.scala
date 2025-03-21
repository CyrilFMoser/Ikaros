package Program_45 

package Program_9 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: (Char,Int), b: T_A[B]) extends T_A[B]
case class CC_B[C, D](a: T_A[C], b: C, c: Byte) extends T_A[C]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_A(('x',_), CC_A(_, _)) => 0 
  case CC_A(_, CC_B(_, _, _)) => 1 
  case CC_A(('x',12), CC_B(_, _, _)) => 2 
  case CC_A(_, CC_A(_, _)) => 3 
  case CC_B(CC_A(_, _), _, 0) => 4 
  case CC_B(_, _, _) => 5 
  case CC_B(CC_B(_, _, _), _, _) => 6 
  case CC_B(CC_B(_, _, _), 'x', 0) => 7 
}
}
// This is not matched: (CC_B Char
//      Boolean
//      (CC_A Char
//            Wildcard
//            (CC_B Char Boolean Wildcard Wildcard Byte (T_A Char))
//            (T_A Char))
//      Wildcard
//      Wildcard
//      (T_A Char))
// Mutation information: 
// Changing a Wildcard in 12 at pattern position 2 to a constant expression:
// {
//  12
// }
//
// This is not matched: (CC_B Char Boolean Wildcard Wildcard Wildcard (T_A Char))
// Mutation information: 
// Deleted Pattern CC_A(_, _) at position 0