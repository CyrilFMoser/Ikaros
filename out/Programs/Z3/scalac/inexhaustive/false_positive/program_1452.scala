package Program_31 

package Program_9 

object Test {
sealed trait T_A
case class CC_A(a: T_A, b: T_A) extends T_A
case class CC_B() extends T_A
case class CC_C[A]() extends T_A

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A(CC_B(), CC_A(_, _)) => 0 
  case CC_A(CC_A(_, _), CC_B()) => 1 
  case CC_A(_, CC_C()) => 2 
  case CC_A(_, CC_A(_, _)) => 3 
  case CC_A(CC_B(), CC_B()) => 4 
  case CC_A(CC_A(_, _), _) => 5 
  case CC_A(CC_C(), CC_A(_, _)) => 6 
  case CC_A(CC_C(), _) => 7 
  case CC_A(CC_A(_, _), CC_A(_, _)) => 8 
}
}
// This is not matched: (CC_A (CC_C T_A T_A) (CC_B T_A) T_A)
// This is not matched: (CC_C (T_B Char))