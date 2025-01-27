package Program_19 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_B, b: T_A[Boolean], c: T_A[(T_B,T_B)]) extends T_A[Boolean]
case class CC_B(a: T_A[Boolean], b: T_B, c: CC_A) extends T_A[Boolean]
case class CC_C() extends T_A[Boolean]

val v_a: T_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, _, _), _) => 0 
  case CC_A(_, CC_B(_, _, _), _) => 1 
  case CC_A(_, CC_C(), _) => 2 
  case CC_B(CC_A(_, _, _), _, CC_A(_, CC_A(_, _, _), _)) => 3 
  case CC_B(CC_A(_, _, _), _, CC_A(_, CC_B(_, _, _), _)) => 4 
  case CC_B(CC_A(_, _, _), _, CC_A(_, CC_C(), _)) => 5 
  case CC_B(CC_B(CC_A(_, _, _), _, CC_A(_, _, _)), _, CC_A(_, CC_A(_, _, _), _)) => 6 
  case CC_B(CC_B(CC_A(_, _, _), _, CC_A(_, _, _)), _, CC_A(_, CC_B(_, _, _), _)) => 7 
  case CC_B(CC_B(CC_A(_, _, _), _, CC_A(_, _, _)), _, CC_A(_, CC_C(), _)) => 8 
  case CC_B(CC_B(CC_B(_, _, _), _, CC_A(_, _, _)), _, CC_A(_, CC_A(_, _, _), _)) => 9 
  case CC_B(CC_B(CC_B(_, _, _), _, CC_A(_, _, _)), _, CC_A(_, CC_B(_, _, _), _)) => 10 
  case CC_B(CC_B(CC_B(_, _, _), _, CC_A(_, _, _)), _, CC_A(_, CC_C(), _)) => 11 
  case CC_B(CC_B(CC_C(), _, CC_A(_, _, _)), _, CC_A(_, CC_A(_, _, _), _)) => 12 
  case CC_B(CC_B(CC_C(), _, CC_A(_, _, _)), _, CC_A(_, CC_B(_, _, _), _)) => 13 
  case CC_B(CC_B(CC_C(), _, CC_A(_, _, _)), _, CC_A(_, CC_C(), _)) => 14 
  case CC_B(CC_C(), _, CC_A(_, CC_A(_, _, _), _)) => 15 
  case CC_B(CC_C(), _, CC_A(_, CC_B(_, _, _), _)) => 16 
  case CC_B(CC_C(), _, CC_A(_, CC_C(), _)) => 17 
  case CC_C() => 18 
}
}