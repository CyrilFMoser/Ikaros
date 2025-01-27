package Program_31 

package Program_11 

object Test {
sealed trait T_A[A]
case class CC_A[B, C](a: T_A[C], b: B, c: T_A[B]) extends T_A[B]
case class CC_B[D](a: D, b: CC_A[D, D], c: D) extends T_A[D]

val v_a: T_A[Byte] = null
val v_b: Int = v_a match{
  case CC_B(0, CC_A(_, _, _), _) => 0 
  case CC_B(_, CC_A(_, _, _), _) => 1 
  case CC_A(CC_A(_, _, _), _, CC_B(_, _, _)) => 2 
  case CC_A(_, _, CC_B(_, _, _)) => 3 
  case CC_A(_, 0, CC_B(_, _, _)) => 4 
  case CC_A(CC_B(_, _, _), 0, CC_B(_, _, _)) => 5 
  case CC_A(CC_A(_, _, _), _, CC_A(_, _, _)) => 6 
  case CC_A(CC_A(_, _, _), 0, CC_B(_, _, _)) => 7 
  case CC_A(_, 0, _) => 8 
  case CC_A(_, _, CC_A(_, _, _)) => 9 
  case CC_A(CC_B(_, _, _), 0, _) => 10 
  case CC_A(_, _, _) => 11 
  case CC_A(CC_B(_, _, _), _, _) => 12 
}
}
// This is not matched: (CC_A Byte Boolean Wildcard Wildcard Wildcard (T_A Byte))
// This is not matched: (CC_A Byte Boolean Wildcard Wildcard Wildcard (T_A Byte))