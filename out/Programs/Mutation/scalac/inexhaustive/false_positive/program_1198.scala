package Program_49 

package Program_28 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: T_A[B], b: T_A[B], c: Byte) extends T_A[(Boolean,Int)]
case class CC_B(a: CC_A[Char]) extends T_A[CC_A[(Boolean,Int)]]

val v_a: T_A[(Boolean,Int)] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_A(CC_B(_), CC_A(_, _, _), 0) => 1 
  case CC_A(CC_A(_, _, _), CC_A(_, _, _), _) => 2 
  case CC_A(CC_B(_), CC_A(_, _, _), _) => 3 
  case CC_A(CC_A(_, _, _), CC_A(_, _, _), 0) => 3 
  case CC_A(_, CC_B(_), _) => 4 
  case CC_A(CC_B(_), CC_B(_), _) => 5 
  case CC_A(CC_A(_, _, _), CC_B(_), _) => 6 
  case CC_A(_, _, 0) => 7 
  case CC_A(CC_A(_, _, _), _, _) => 8 
  case CC_A(CC_B(_), _, 0) => 9 
  case CC_A(CC_A(_, _, _), _, 0) => 10 
  case CC_A(_, CC_A(_, _, _), _) => 11 
}
}
// This is not matched: (CC_A (Tuple Boolean Int)
//      (CC_A Wildcard Wildcard Wildcard Wildcard (T_A (Tuple Boolean Int)))
//      (CC_A (CC_A (Tuple Boolean Int) Boolean Boolean Boolean Boolean)
//            Wildcard
//            (CC_B Wildcard
//                  (T_A (CC_A (Tuple Boolean Int)
//                             Boolean
//                             Boolean
//                             Boolean
//                             Boolean)))
//            Wildcard
//            (T_A (Tuple Boolean Int)))
//      Wildcard
//      (T_A (Tuple Boolean Int)))
// Mutation information: 
// Expanded _ at position 3 into: 
// {
//  CC_A(_, _, _)
//  CC_B(_)
// }
//
// This is not matched: (CC_A (Tuple Boolean Int)
//      (CC_A Wildcard Wildcard Wildcard Wildcard (T_A (Tuple Boolean Int)))
//      (CC_A (CC_A (Tuple Boolean Int) Boolean Boolean Boolean Boolean)
//            Wildcard
//            (CC_B Wildcard
//                  (T_A (CC_A (Tuple Boolean Int)
//                             Boolean
//                             Boolean
//                             Boolean
//                             Boolean)))
//            Wildcard
//            (T_A (Tuple Boolean Int)))
//      Wildcard
//      (T_A (Tuple Boolean Int)))
// Mutation information: 
// Expanded _ at position 4 into: 
// {
//  CC_A(_, _, _)
// }
//