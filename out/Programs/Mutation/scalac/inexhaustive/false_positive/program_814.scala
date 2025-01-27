package Program_59 

package Program_25 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D, E](a: (Byte,Byte), b: Byte, c: T_A[D, C]) extends T_A[D, C]

val v_a: T_A[Int, Int] = null
val v_b: Int = v_a match{
  case CC_A((_,_), 0, _) => 0 
  case CC_A((0,0), 0, CC_A(_, _, _)) => 1 
  case CC_A((0,0), 0, _) => 2 
  case CC_A(_, 0, _) => 3 
  case CC_A((0,_), 0, CC_A(_, _, _)) => 4 
  case CC_A((_,_), _, CC_A(_, _, _)) => 5 
  case CC_A((_,0), _, _) => 6 
  case CC_A((0,_), 0, _) => 7 
  case CC_A((_,0), 0, _) => 8 
  case CC_A(_, _, CC_A(_, _, _)) => 9 
  case CC_A((0,_), _, CC_A(_, _, _)) => 10 
  case CC_A(_, 0, CC_A(_, _, _)) => 11 
  case CC_A((0,0), _, _) => 12 
  case CC_A(_, _, _) => 13 
  case CC_A((0,_), _, _) => 14 
}
}
// This is not matched: (CC_A Int
//      Int
//      (CC_A Boolean
//            Boolean
//            (T_A Boolean Boolean)
//            Boolean
//            Boolean
//            Boolean
//            Boolean)
//      Wildcard
//      Wildcard
//      Wildcard
//      (T_A Int Int))
// Mutation information: 
// Changing a Wildcard in 0 at pattern position 12 to a constant expression:
// {
//  0
// }
//
// This is not matched: (CC_A Int Int Boolean Wildcard Wildcard Wildcard (T_A Int Int))
// Mutation information: 
// Deleted Pattern CC_A((_,0), 0, CC_A(_, _, _)) at position 0