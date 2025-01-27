package Program_21 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_B, b: T_A[(T_B,T_B)], c: T_A[T_B]) extends T_A[(T_B,T_B)]
case class CC_B(a: T_B, b: T_B, c: Int) extends T_A[(T_B,T_B)]
case class CC_C(a: T_A[(T_B,T_B)]) extends T_A[(T_B,T_B)]

val v_a: T_A[(T_B,T_B)] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, _, _), _) => 0 
  case CC_A(_, CC_B(_, _, _), _) => 1 
  case CC_A(_, CC_C(CC_A(_, _, _)), _) => 2 
  case CC_A(_, CC_C(CC_B(_, _, _)), _) => 3 
  case CC_A(_, CC_C(CC_C(_)), _) => 4 
  case CC_B(_, _, _) => 5 
  case CC_C(CC_A(_, CC_A(_, _, _), _)) => 6 
  case CC_C(CC_A(_, CC_B(_, _, _), _)) => 7 
  case CC_C(CC_A(_, CC_C(_), _)) => 8 
  case CC_C(CC_B(_, _, _)) => 9 
  case CC_C(CC_C(CC_A(_, _, _))) => 10 
  case CC_C(CC_C(CC_B(_, _, _))) => 11 
}
}
// This is not matched: CC_C(CC_C(CC_C(_)))