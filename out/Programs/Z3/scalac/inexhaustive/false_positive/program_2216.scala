package Program_31 

package Program_1 

object Test {
sealed trait T_A
case class CC_A(a: T_A, b: T_A) extends T_A
case class CC_B[A](a: Char) extends T_A
case class CC_C() extends T_A

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_B(_) => 0 
  case CC_A(CC_B(_), CC_B(_)) => 1 
  case CC_A(_, _) => 2 
  case CC_A(CC_B(_), CC_A(_, _)) => 3 
  case CC_A(_, CC_B(_)) => 4 
  case CC_A(CC_C(), CC_B(_)) => 5 
  case CC_C() => 6 
}
}
// This is not matched: (CC_B T_A Char T_A)
// This is not matched: (CC_A Wildcard Wildcard Wildcard T_A)