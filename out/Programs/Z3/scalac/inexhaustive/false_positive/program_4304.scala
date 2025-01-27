package Program_15 

package Program_2 

object Test {
sealed trait T_A
case class CC_A(a: T_A, b: T_A) extends T_A
case class CC_B[A](a: Char, b: T_A, c: T_A) extends T_A

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _), _) => 0 
  case CC_A(CC_A(_, _), CC_B(_, _, _)) => 1 
  case CC_A(CC_B(_, _, _), CC_B(_, _, _)) => 2 
  case CC_A(CC_B(_, _, _), CC_A(_, _)) => 3 
  case CC_A(CC_B(_, _, _), _) => 4 
  case CC_A(_, CC_B(_, _, _)) => 5 
  case CC_B(_, _, _) => 6 
  case CC_B(_, CC_B(_, _, _), CC_B(_, _, _)) => 7 
  case CC_B('x', CC_B(_, _, _), CC_B(_, _, _)) => 8 
  case CC_B(_, CC_A(_, _), CC_A(_, _)) => 9 
  case CC_B('x', _, CC_A(_, _)) => 10 
}
}
// This is not matched: (CC_A (CC_B T_A Char Wildcard (CC_B T_A Char Wildcard Wildcard T_A) T_A)
//      (CC_B T_A Char Wildcard Wildcard T_A)
//      T_A)
// This is not matched: (CC_C Byte (T_A (Tuple Char Byte) Byte))