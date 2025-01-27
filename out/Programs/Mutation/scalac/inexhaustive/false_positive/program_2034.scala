package Program_25 

package Program_20 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D](a: T_A[D, Char], b: T_A[D, Char], c: T_A[D, D]) extends T_A[C, Char]

val v_a: CC_A[Boolean, Byte] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _, _), CC_A(_, CC_A(_, _, _), _), _) => 0 
  case CC_A(_, CC_A(_, _, _), _) => 1 
}
}
// This is not matched: (CC_A Boolean
//      Byte
//      Wildcard
//      (CC_A Byte
//            Char
//            Wildcard
//            Wildcard
//            (CC_A Char Boolean Wildcard Wildcard Wildcard (T_A Char Char))
//            (T_A Byte Char))
//      Wildcard
//      (T_A Boolean Char))
// Mutation information: 
// Expanded _ at position 0 into: 
// {
//  CC_A(_, _, _)
// }
//
// This is not matched: (CC_A Boolean
//      Byte
//      (CC_A Byte
//            Boolean
//            (CC_A Boolean Boolean Wildcard Wildcard Wildcard (T_A Boolean Char))
//            Wildcard
//            Wildcard
//            (T_A Byte Char))
//      Wildcard
//      Wildcard
//      (T_A Boolean Char))
// Mutation information: 
// Expanded _ at position 0 into: 
// {
//  CC_A(_, _, _)
// }
//