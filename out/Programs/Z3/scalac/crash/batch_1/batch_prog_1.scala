package Program_1 

object Test {
sealed trait T_A
case class CC_A(a: T_A, b: T_A) extends T_A
case class CC_B(a: CC_A) extends T_A
case class CC_C(a: CC_A) extends T_A

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_C(CC_A(_, _)) => 0 
  case CC_A(_, CC_C(_)) => 1 
  case CC_A(_, CC_A(_, _)) => 2 
  case CC_A(CC_B(_), CC_C(_)) => 3 
  case CC_A(CC_C(_), _) => 4 
  case CC_A(CC_C(_), CC_C(_)) => 5 
  case CC_A(CC_C(_), CC_B(_)) => 6 
  case CC_A(CC_A(_, _), CC_C(_)) => 7 
  case CC_A(_, CC_B(_)) => 8 
  case CC_A(CC_B(_), CC_B(_)) => 9 
  case CC_A(CC_A(_, _), CC_A(_, _)) => 10 
  case CC_A(CC_A(_, _), CC_B(_)) => 11 
  case CC_A(CC_A(_, _), _) => 12 
  case CC_A(CC_B(_), _) => 13 
  case CC_A(_, _) => 14 
}
}
// This is not matched: (CC_B Wildcard T_A)