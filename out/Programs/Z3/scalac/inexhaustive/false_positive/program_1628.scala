package Program_31 

package Program_7 

object Test {
sealed trait T_A
case class CC_A(a: T_A, b: T_A) extends T_A
case class CC_B[A]() extends T_A
case class CC_C(a: CC_A, b: T_A) extends T_A

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C(CC_A(_, _), CC_C(_, _)) => 1 
  case CC_C(_, CC_C(_, _)) => 2 
  case CC_C(CC_A(_, _), _) => 3 
  case CC_A(_, _) => 4 
  case CC_A(CC_A(_, _), _) => 5 
  case CC_A(CC_B(), _) => 6 
  case CC_A(CC_C(_, _), CC_A(_, _)) => 7 
  case CC_A(CC_B(), CC_A(_, _)) => 8 
}
}
// This is not matched: (CC_B T_A T_A)
// This is not matched: (CC_A (CC_B (CC_A Wildcard T_A) (CC_B Wildcard Wildcard T_A) T_A) T_A)