package Program_31 

package Program_14 

object Test {
sealed trait T_A
case class CC_A(a: T_A) extends T_A
case class CC_B(a: T_A, b: T_A, c: CC_A) extends T_A
case class CC_C[A](a: ((Int,Byte),T_A)) extends T_A

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(CC_C(_)) => 0 
  case CC_A(CC_B(_, _, _)) => 1 
  case CC_A(_) => 2 
  case CC_C(_) => 3 
  case CC_B(CC_A(_), CC_A(_), _) => 4 
  case CC_B(_, CC_A(_), _) => 5 
  case CC_B(CC_A(_), _, CC_A(_)) => 6 
  case CC_B(CC_B(_, _, _), CC_A(_), _) => 7 
  case CC_B(CC_B(_, _, _), _, CC_A(_)) => 8 
  case CC_B(CC_A(_), CC_B(_, _, _), CC_A(_)) => 9 
  case CC_B(CC_B(_, _, _), CC_B(_, _, _), CC_A(_)) => 10 
  case CC_B(CC_C(_), CC_B(_, _, _), _) => 11 
  case CC_B(_, CC_C(_), _) => 12 
  case CC_B(_, CC_B(_, _, _), _) => 13 
  case CC_B(CC_C(_), CC_B(_, _, _), CC_A(_)) => 14 
  case CC_B(CC_A(_), _, _) => 15 
  case CC_B(CC_A(_), CC_A(_), CC_A(_)) => 16 
  case CC_B(CC_C(_), CC_A(_), CC_A(_)) => 17 
  case CC_B(CC_B(_, _, _), CC_C(_), CC_A(_)) => 18 
  case CC_B(_, _, _) => 19 
  case CC_B(CC_C(_), CC_C(_), _) => 20 
  case CC_B(CC_B(_, _, _), CC_A(_), CC_A(_)) => 21 
}
}
// This is not matched: (CC_C T_A Wildcard T_A)
// This is not matched: (CC_A (CC_C T_A Wildcard T_A) T_A)