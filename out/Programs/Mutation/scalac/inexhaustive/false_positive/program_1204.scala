package Program_43 

package Program_17 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: T_A[B], b: T_A[B], c: Byte) extends T_A[(Boolean,Int)]
case class CC_B(a: CC_A[Char]) extends T_A[CC_A[(Boolean,Int)]]

val v_a: T_A[(Boolean,Int)] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_A(CC_A(_, _, _), CC_A(_, _, _), _) => 2 
  case CC_A(CC_B(_), _, _) => 3 
  case CC_A(CC_A(_, _, _), CC_A(_, _, _), 0) => 4 
  case CC_A(_, CC_B(_), _) => 5 
  case CC_A(CC_B(_), CC_B(_), _) => 6 
  case CC_A(CC_A(_, _, _), CC_B(_), _) => 7 
  case CC_A(_, _, 0) => 8 
  case CC_A(CC_A(_, _, _), _, _) => 9 
  case CC_A(CC_B(_), _, 0) => 10 
  case CC_A(CC_A(_, _, _), _, 0) => 11 
  case CC_A(_, CC_A(_, _, _), _) => 12 
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
// Deleted Pattern CC_A(CC_B(_), CC_A(_, _, _), 0) at position 1
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