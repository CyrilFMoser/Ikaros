package Program_41 

package Program_30 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D, E](a: (Byte,Byte), b: Byte, c: T_A[D, C]) extends T_A[D, C]

val v_a: T_A[Int, Int] = null
val v_b: Int = v_a match{
  case CC_A((_,0), 0, CC_A(_, _, _)) => 0 
  case CC_A((_,_), 0, CC_A(_, _, _)) => 1 
  case CC_A((_,0), _, CC_A(_, _, _)) => 2 
  case CC_A((0,0), _, CC_A(_, _, _)) => 3 
  case CC_A((_,_), _, _) => 4 
}
}
// This is not matched: (CC_A Int Int Boolean Wildcard Wildcard Wildcard (T_A Int Int))
// This is not matched: (CC_A Int Int Boolean Wildcard Wildcard Wildcard (T_A Int Int))
// Mutation information: 
// Deleted Pattern CC_A((_,0), 0, CC_A(_, _, _)) at position 0