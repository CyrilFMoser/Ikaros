package Program_15 

package Program_6 

object Test {
sealed trait T_A
case class CC_A(a: T_A, b: T_A) extends T_A
case class CC_B[A](a: T_A) extends T_A

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, CC_B(_)) => 0 
  case CC_A(CC_B(_), CC_B(_)) => 1 
  case CC_A(_, CC_A(_, _)) => 2 
  case CC_A(CC_A(_, _), _) => 3 
  case CC_A(CC_A(_, _), CC_A(_, _)) => 4 
  case CC_A(CC_B(_), _) => 5 
  case CC_B(_) => 6 
}
}
// This is not matched: (CC_B (CC_A T_A T_A T_A) Wildcard T_A)
// This is not matched: (CC_C Char Char Wildcard (T_A Char Boolean))