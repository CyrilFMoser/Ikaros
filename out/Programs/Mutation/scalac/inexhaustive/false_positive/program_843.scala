package Program_62 

package Program_2 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D, E](a: (Byte,Byte), b: Byte, c: T_A[D, C]) extends T_A[D, C]

val v_a: T_A[Int, Int] = null
val v_b: Int = v_a match{
  case CC_A((_,0), 0, CC_A(_, _, _)) => 0 
  case CC_A((_,0), _, CC_A(_, _, _)) => 2 
  case CC_A((0,0), _, CC_A(_, _, _)) => 3 
  case CC_A((_,_), _, _) => 4 
}
}
// This is not matched: (CC_A Int Int Boolean Wildcard Wildcard Wildcard (T_A Int Int))
// Mutation information: 
// Deleted Pattern CC_A((_,_), 0, CC_A(_, _, _)) at position 1
// This is not matched: (CC_C Wildcard
//      (Tuple (CC_C Wildcard (Tuple Wildcard Wildcard) Wildcard T_B) Wildcard)
//      (CC_C Wildcard Wildcard Wildcard T_B)
//      T_B)
// Mutation information: 
// Changing a Wildcard in 12 at pattern position 2 to a constant expression:
// {
//  12
// }
//