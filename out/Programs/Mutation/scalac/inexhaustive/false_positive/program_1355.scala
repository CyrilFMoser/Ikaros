package Program_62 

package Program_27 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: (Byte,Byte)) extends T_A[T_A[Boolean, Boolean], (Int,Byte)]

val v_a: T_A[T_A[Boolean, Boolean], (Int,Byte)] = null
val v_b: Int = v_a match{
  case CC_A(_) => 1 
}
}
// This is not matched: (CC_A Boolean Wildcard (T_A (T_A Boolean Boolean) (Tuple Int Byte)))
// Mutation information: 
// Deleted Pattern CC_A((_,_)) at position 0
// This is not matched: Pattern match is empty without constants
// Mutation information: 
// Changing a Wildcard in 0 at pattern position 0 to a constant expression:
// {
//  0
// }
//