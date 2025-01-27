package Program_13 

package Program_7 

object Test {
sealed trait T_A
case class CC_A[A](a: T_A, b: T_A) extends T_A
case class CC_B() extends T_A
case class CC_C(a: CC_B) extends T_A

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_C(_) => 0 
  case CC_C(CC_B()) => 1 
  case CC_B() => 2 
  case CC_A(CC_C(_), CC_A(_, _)) => 3 
  case CC_A(CC_B(), CC_A(_, _)) => 4 
  case CC_A(_, _) => 5 
  case CC_A(_, CC_B()) => 6 
  case CC_A(CC_B(), _) => 7 
  case CC_A(CC_C(_), CC_B()) => 8 
  case CC_A(CC_B(), CC_B()) => 9 
  case CC_A(CC_A(_, _), _) => 10 
  case CC_A(CC_A(_, _), CC_C(_)) => 11 
  case CC_A(_, CC_A(_, _)) => 12 
}
}
// This is not matched: (CC_A T_A Wildcard Wildcard T_A)
// This is not matched: Pattern match is empty without constants