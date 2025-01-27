package Program_31 

package Program_8 

object Test {
sealed trait T_A
case class CC_A[A](a: T_A) extends T_A
case class CC_B(a: ((Byte,Char),T_A)) extends T_A
case class CC_C(a: T_A, b: CC_A[CC_B], c: CC_A[T_A]) extends T_A

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_C(CC_A(_), CC_A(_), CC_A(_)) => 0 
  case CC_C(CC_B(_), _, _) => 1 
  case CC_C(_, _, _) => 2 
  case CC_C(CC_A(_), CC_A(_), _) => 3 
  case CC_C(CC_B(_), CC_A(_), CC_A(_)) => 4 
  case CC_C(CC_B(_), CC_A(_), _) => 5 
  case CC_C(CC_B(_), _, CC_A(_)) => 6 
  case CC_C(CC_C(_, _, _), CC_A(_), CC_A(_)) => 7 
  case CC_C(CC_A(_), _, CC_A(_)) => 8 
  case CC_C(_, _, CC_A(_)) => 9 
  case CC_C(CC_A(_), _, _) => 10 
  case CC_B(_) => 11 
  case CC_A(_) => 12 
}
}
// This is not matched: (CC_A T_A Wildcard T_A)
// This is not matched: (CC_E Char (T_B Char))