package Program_30 

package Program_9 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: T_A[B], b: Byte, c: T_A[Char]) extends T_A[Char]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_A(_, _, CC_A(_, _, _)) => 0 
  case CC_A(_, _, _) => 1 
  case CC_A(_, 0, _) => 2 
  case CC_A(CC_A(_, _, _), 0, CC_A(_, _, _)) => 3 
  case CC_A(CC_A(_, _, _), _, _) => 4 
  case CC_A(_, 0, CC_A(_, _, _)) => 5 
}
}
// This is not matched: (CC_A Byte Wildcard Wildcard Wildcard (T_A Char))
// This is not matched: (CC_A (T_A (Tuple Byte Int)))