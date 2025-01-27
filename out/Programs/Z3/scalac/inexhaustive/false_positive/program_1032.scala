package Program_30 

package Program_14 

object Test {
sealed trait T_A[A]
case class CC_A[B, C](a: T_A[B], b: Int, c: T_A[C]) extends T_A[B]
case class CC_B(a: T_A[Byte], b: T_A[Int], c: (Int,Char)) extends T_A[T_A[Boolean]]
case class CC_C(a: Boolean, b: CC_B, c: T_A[CC_B]) extends T_A[T_A[Boolean]]

val v_a: T_A[T_A[Boolean]] = null
val v_b: Int = v_a match{
  case CC_B(_, CC_A(_, _, _), (12,'x')) => 0 
  case CC_B(_, CC_A(_, _, _), _) => 1 
  case CC_B(_, _, (_,_)) => 2 
  case CC_B(_, _, (12,'x')) => 3 
  case CC_B(_, _, (12,_)) => 4 
  case CC_B(CC_A(_, _, _), _, (12,'x')) => 5 
  case CC_B(CC_A(_, _, _), CC_A(_, _, _), _) => 6 
  case CC_B(CC_A(_, _, _), _, (12,_)) => 7 
  case CC_B(_, CC_A(_, _, _), (_,'x')) => 8 
  case CC_B(CC_A(_, _, _), _, _) => 9 
  case CC_B(CC_A(_, _, _), CC_A(_, _, _), (_,_)) => 10 
  case CC_B(_, _, _) => 11 
  case CC_C(_, CC_B(_, _, _), CC_A(_, _, _)) => 12 
  case CC_C(_, _, _) => 13 
  case CC_A(CC_C(_, _, _), _, CC_A(_, _, _)) => 14 
  case CC_A(_, _, CC_B(_, _, _)) => 15 
  case CC_A(CC_B(_, _, _), _, CC_C(_, _, _)) => 16 
  case CC_A(_, _, _) => 17 
  case CC_A(_, 12, _) => 18 
  case CC_A(CC_B(_, _, _), 12, CC_B(_, _, _)) => 19 
  case CC_A(CC_C(_, _, _), 12, CC_B(_, _, _)) => 20 
  case CC_A(_, 12, CC_B(_, _, _)) => 21 
}
}
// This is not matched: (CC_A (T_A Boolean) Boolean Wildcard Wildcard Wildcard (T_A (T_A Boolean)))
// This is not matched: (CC_C Wildcard Wildcard Wildcard (T_A (T_A Boolean)))