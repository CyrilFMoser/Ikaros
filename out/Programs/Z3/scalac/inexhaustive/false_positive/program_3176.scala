package Program_15 

package Program_4 

object Test {
sealed trait T_A
sealed trait T_B
case class CC_A(a: T_A) extends T_A
case class CC_B[A](a: T_A, b: T_B, c: CC_A) extends T_B
case class CC_C(a: Char) extends T_B
case class CC_D(a: Int, b: CC_C) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C(_) => 0 
  case CC_B(CC_A(_), CC_B(_, _, _), CC_A(_)) => 1 
  case CC_B(_, CC_B(_, _, _), _) => 2 
  case CC_B(CC_A(_), CC_C(_), CC_A(_)) => 3 
  case CC_B(CC_A(_), CC_D(_, _), CC_A(_)) => 4 
  case CC_B(CC_A(_), CC_B(_, _, _), _) => 5 
  case CC_B(_, CC_D(_, _), CC_A(_)) => 6 
  case CC_B(_, CC_B(_, _, _), CC_A(_)) => 7 
  case CC_B(_, CC_C(_), _) => 8 
  case CC_B(CC_A(_), _, _) => 9 
  case CC_B(CC_A(_), _, CC_A(_)) => 10 
  case CC_B(_, _, CC_A(_)) => 11 
  case CC_D(12, CC_C(_)) => 12 
  case CC_D(_, CC_C(_)) => 13 
}
}
// This is not matched: (CC_B T_A Wildcard Wildcard Wildcard T_B)
// This is not matched: Pattern match is empty without constants