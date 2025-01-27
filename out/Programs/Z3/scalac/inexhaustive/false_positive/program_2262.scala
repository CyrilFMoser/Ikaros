package Program_31 

package Program_14 

object Test {
sealed trait T_A[A]
case class CC_A(a: Byte, b: (Int,Char), c: Byte) extends T_A[Boolean]
case class CC_B[B](a: CC_A, b: T_A[Boolean], c: CC_A) extends T_A[Boolean]

val v_a: T_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_, (_,_), _) => 0 
  case CC_A(0, (12,_), 0) => 1 
  case CC_A(0, (_,_), 0) => 2 
  case CC_A(_, (12,'x'), _) => 3 
  case CC_A(_, _, _) => 4 
  case CC_A(0, (12,'x'), 0) => 5 
  case CC_A(_, (12,_), 0) => 6 
  case CC_A(_, (12,'x'), 0) => 7 
  case CC_B(CC_A(_, _, _), _, _) => 8 
  case CC_B(CC_A(_, _, _), CC_B(_, _, _), _) => 9 
  case CC_B(_, _, _) => 10 
  case CC_B(_, _, CC_A(_, _, _)) => 11 
}
}
// This is not matched: (CC_B Boolean Wildcard Wildcard Wildcard (T_A Boolean))
// This is not matched: (CC_A Wildcard Wildcard Wildcard (T_A Boolean))