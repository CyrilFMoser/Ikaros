package Program_31 

package Program_6 

object Test {
sealed trait T_A
case class CC_A(a: T_A, b: T_A) extends T_A
case class CC_B[A](a: CC_A, b: A, c: A) extends T_A
case class CC_C(a: CC_A, b: CC_B[T_A], c: T_A) extends T_A

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_B(_, _, _) => 0 
  case CC_A(CC_C(_, _, _), CC_C(_, _, _)) => 1 
  case CC_A(CC_B(_, _, _), CC_B(_, _, _)) => 2 
  case CC_A(CC_B(_, _, _), CC_A(_, _)) => 3 
  case CC_A(CC_A(_, _), _) => 4 
  case CC_A(CC_C(_, _, _), _) => 5 
  case CC_A(_, _) => 6 
  case CC_A(CC_A(_, _), CC_B(_, _, _)) => 7 
  case CC_A(CC_C(_, _, _), CC_B(_, _, _)) => 8 
  case CC_A(_, CC_B(_, _, _)) => 9 
  case CC_A(_, CC_C(_, _, _)) => 10 
  case CC_A(CC_A(_, _), CC_A(_, _)) => 11 
  case CC_A(CC_B(_, _, _), CC_C(_, _, _)) => 12 
  case CC_A(CC_B(_, _, _), _) => 13 
  case CC_A(_, CC_A(_, _)) => 14 
  case CC_C(CC_A(_, _), CC_B(_, _, _), _) => 15 
  case CC_C(_, _, CC_C(_, _, _)) => 16 
  case CC_C(CC_A(_, _), CC_B(_, _, _), CC_C(_, _, _)) => 17 
  case CC_C(_, _, _) => 18 
}
}
// This is not matched: (CC_B T_A Wildcard Wildcard Wildcard T_A)
// This is not matched: (CC_B Wildcard Wildcard (CC_A Wildcard Wildcard Wildcard T_A) T_A)