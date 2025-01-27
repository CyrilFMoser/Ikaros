package Program_31 

package Program_9 

object Test {
sealed trait T_A
case class CC_A(a: T_A) extends T_A
case class CC_B[A](a: CC_A, b: CC_A, c: A) extends T_A
case class CC_C(a: Boolean, b: CC_A) extends T_A

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(CC_B(_, _, _)) => 0 
  case CC_A(_) => 1 
  case CC_A(CC_C(_, _)) => 2 
  case CC_B(CC_A(_), _, _) => 3 
  case CC_B(_, CC_A(_), _) => 4 
  case CC_C(_, CC_A(_)) => 5 
}
}
// This is not matched: (CC_B T_A Wildcard Wildcard Wildcard T_A)
// This is not matched: (CC_A Boolean Wildcard Wildcard (T_A Boolean (Tuple Int Char)))