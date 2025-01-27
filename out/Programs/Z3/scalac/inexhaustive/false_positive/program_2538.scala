package Program_29 

package Program_7 

object Test {
sealed trait T_A[A]
case class CC_A[B, C](a: T_A[B], b: T_A[C], c: T_A[B]) extends T_A[B]
case class CC_B[D]() extends T_A[D]

val v_a: T_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_A(CC_B(), _, _) => 1 
  case CC_A(CC_B(), CC_B(), _) => 2 
  case CC_A(_, CC_A(_, _, _), _) => 3 
  case CC_A(CC_A(_, _, _), CC_A(_, _, _), CC_A(_, _, _)) => 4 
  case CC_A(_, _, CC_B()) => 5 
  case CC_A(_, CC_B(), _) => 6 
  case CC_A(CC_A(_, _, _), CC_A(_, _, _), CC_B()) => 7 
  case CC_A(CC_A(_, _, _), CC_B(), CC_A(_, _, _)) => 8 
  case CC_A(_, CC_A(_, _, _), CC_A(_, _, _)) => 9 
  case CC_A(CC_B(), CC_B(), CC_B()) => 10 
  case CC_A(_, _, _) => 11 
  case CC_A(CC_B(), CC_A(_, _, _), CC_A(_, _, _)) => 12 
  case CC_A(CC_B(), _, CC_A(_, _, _)) => 13 
  case CC_A(CC_B(), _, CC_B()) => 14 
  case CC_A(_, CC_B(), CC_B()) => 15 
  case CC_A(CC_B(), CC_B(), CC_A(_, _, _)) => 16 
  case CC_A(CC_A(_, _, _), _, CC_A(_, _, _)) => 17 
}
}
// This is not matched: (CC_A Boolean Boolean Wildcard Wildcard Wildcard (T_A Boolean))
// This is not matched: (CC_B Wildcard T_A)