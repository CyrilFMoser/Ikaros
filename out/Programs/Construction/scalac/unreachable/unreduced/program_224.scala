package Program_29 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[T_A[Boolean]]) extends T_A[Boolean]
case class CC_B(a: T_A[Boolean], b: CC_A, c: T_A[Boolean]) extends T_A[Boolean]
case class CC_C(a: Int, b: Int) extends T_A[Boolean]

val v_a: T_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_), _, CC_A(_)) => 0 
  case CC_B(CC_B(_, _, _), _, CC_A(_)) => 1 
  case CC_B(CC_C(_, _), _, CC_A(_)) => 2 
  case CC_B(CC_A(_), _, CC_B(_, _, _)) => 3 
  case CC_B(CC_B(_, _, _), _, CC_B(_, _, _)) => 4 
  case CC_B(CC_C(_, _), _, CC_B(_, _, _)) => 5 
  case CC_B(CC_A(_), _, CC_C(_, _)) => 6 
  case CC_B(CC_B(_, _, _), _, CC_C(_, _)) => 7 
  case CC_B(CC_C(_, _), _, CC_C(_, _)) => 8 
  case CC_C(_, _) => 9 
}
}
// This is not matched: CC_A(_)