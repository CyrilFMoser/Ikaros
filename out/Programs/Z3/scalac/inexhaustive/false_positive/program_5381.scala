package Program_12 

package Program_9 

object Test {
sealed trait T_A
case class CC_A(a: T_A) extends T_A
case class CC_B[A](a: Int, b: CC_A, c: A) extends T_A

val v_a: CC_B[T_A] = null
val v_b: Int = v_a match{
  case CC_B(12, CC_A(_), _) => 0 
  case CC_B(_, _, CC_B(_, _, _)) => 1 
  case CC_B(_, CC_A(_), CC_B(_, _, _)) => 2 
  case CC_B(12, CC_A(_), CC_B(_, _, _)) => 3 
  case CC_B(_, CC_A(_), CC_A(_)) => 4 
  case CC_B(12, _, CC_B(_, _, _)) => 5 
  case CC_B(12, CC_A(_), CC_A(_)) => 6 
}
}
// This is not matched: (CC_B T_A
//      Wildcard
//      (CC_A Wildcard T_A)
//      (CC_B Boolean Int (CC_A (CC_A Wildcard T_A) T_A) Boolean T_A)
//      T_A)
// This is not matched: (CC_B Wildcard Wildcard (T_A (T_A Byte Int) (Tuple Int Char)))