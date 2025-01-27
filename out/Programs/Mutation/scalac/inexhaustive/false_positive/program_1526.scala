package Program_58 

package Program_20 

object Test {
sealed trait T_A[A]
case class CC_A[B, C](a: B, b: Char) extends T_A[B]
case class CC_B(a: T_A[Char], b: CC_A[Char, Char], c: CC_A[Boolean, Char]) extends T_A[(Int,Boolean)]

val v_a: T_A[(Int,Boolean)] = null
val v_b: Int = v_a match{
  case CC_A(_, 'x') => 0 
  case CC_A((_,_), _) => 1 
  case CC_A((_,_), 'x') => 2 
  case CC_A((12,_), _) => 3 
  case CC_B(_, CC_A(_, _), _) => 4 
  case CC_B(CC_A(_, _), CC_A(_, _), _) => 5 
  case CC_B(_, CC_A(_, _), CC_A(_, _)) => 7 
}
}
// This is not matched: (CC_A (Tuple Int Boolean) Boolean Wildcard Wildcard (T_A (Tuple Int Boolean)))
// Mutation information: 
// Deleted Pattern CC_B(CC_A(_, _), _, CC_A(_, _)) at position 6
// This is not matched: (CC_A (Tuple Int Boolean) Boolean Wildcard Wildcard (T_A (Tuple Int Boolean)))