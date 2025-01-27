package Program_60 

package Program_25 

object Test {
sealed trait T_A[A]
case class CC_A[B, C](a: B, b: Char) extends T_A[B]
case class CC_B(a: T_A[Char], b: CC_A[Char, Char], c: CC_A[Boolean, Char]) extends T_A[(Int,Boolean)]

val v_a: T_A[(Int,Boolean)] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, _, _) => 2 
  case CC_B(CC_A(_, _), CC_A(_, _), CC_A(_, _)) => 3 
}
}
// This is not matched: (CC_A (Tuple Int Boolean) Boolean Wildcard Wildcard (T_A (Tuple Int Boolean)))
// Mutation information: 
// Deleted Pattern CC_A((12,_), 'x') at position 1
// This is not matched: (CC_A (Tuple Int Boolean) Boolean Wildcard Wildcard (T_A (Tuple Int Boolean)))