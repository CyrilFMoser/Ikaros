package Program_15 

package Program_13 

object Test {
sealed trait T_A
case class CC_A(a: T_A, b: T_A, c: T_A) extends T_A
case class CC_B[A](a: CC_A, b: Byte) extends T_A

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_B(_, 0) => 0 
  case CC_B(CC_A(_, _, _), _) => 1 
  case CC_A(CC_A(_, _, _), _, CC_A(_, _, _)) => 2 
  case CC_A(CC_A(_, _, _), CC_A(_, _, _), CC_B(_, _)) => 3 
  case CC_A(_, CC_B(_, _), _) => 4 
  case CC_A(CC_B(_, _), _, _) => 5 
  case CC_A(_, CC_B(_, _), CC_B(_, _)) => 6 
  case CC_A(CC_A(_, _, _), CC_A(_, _, _), CC_A(_, _, _)) => 7 
  case CC_A(_, _, _) => 8 
  case CC_A(CC_A(_, _, _), CC_A(_, _, _), _) => 9 
  case CC_A(CC_A(_, _, _), _, _) => 10 
  case CC_A(CC_B(_, _), CC_A(_, _, _), CC_A(_, _, _)) => 11 
  case CC_A(_, _, CC_A(_, _, _)) => 12 
  case CC_A(_, CC_B(_, _), CC_A(_, _, _)) => 13 
  case CC_A(CC_A(_, _, _), CC_B(_, _), CC_B(_, _)) => 14 
  case CC_A(CC_B(_, _), _, CC_B(_, _)) => 15 
  case CC_A(_, CC_A(_, _, _), _) => 16 
  case CC_A(CC_B(_, _), CC_B(_, _), CC_B(_, _)) => 17 
  case CC_A(_, CC_A(_, _, _), CC_B(_, _)) => 18 
  case CC_A(CC_B(_, _), _, CC_A(_, _, _)) => 19 
  case CC_A(_, CC_A(_, _, _), CC_A(_, _, _)) => 20 
  case CC_A(CC_B(_, _), CC_B(_, _), _) => 21 
  case CC_A(CC_A(_, _, _), CC_B(_, _), _) => 22 
}
}
// This is not matched: (CC_B T_A Wildcard Wildcard T_A)
// This is not matched: (CC_A Boolean Wildcard (T_A (T_A Byte Char) Boolean))