package Program_54 

package Program_12 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: T_A[B], b: T_A[B]) extends T_A[B]
case class CC_B[C, D](a: C, b: (Boolean,Char), c: CC_A[C]) extends T_A[C]

val v_a: T_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_B(_, (_,_), _) => 0 
  case CC_B(_, (_,'x'), CC_A(_, _)) => 1 
  case CC_A(CC_B(_, _, _), _) => 2 
  case CC_A(_, _) => 3 
  case CC_A(_, CC_A(_, _)) => 4 
  case CC_A(_, CC_B(_, _, _)) => 5 
  case CC_A(CC_A(_, CC_A(_, _)), _) => 6 
  case CC_A(CC_A(_, _), CC_B(_, _, _)) => 7 
  case CC_A(CC_B(_, _, _), CC_B(_, _, _)) => 8 
  case CC_A(CC_B(_, _, _), CC_A(_, _)) => 9 
}
}
// This is not matched: (CC_B Boolean
//      (CC_B Boolean Boolean Boolean Boolean Boolean Boolean)
//      Wildcard
//      Wildcard
//      Wildcard
//      (T_A Boolean))
// Mutation information: 
// Expanded _ at position 6 into: 
// {
//  CC_A(_, _)
// }
//
// This is not matched: (CC_A Boolean Wildcard Wildcard (T_A Boolean))
// Mutation information: 
// Deleted Pattern CC_B(_, (_,'x'), _) at position 1