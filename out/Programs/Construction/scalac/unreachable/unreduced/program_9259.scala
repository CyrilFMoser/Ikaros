package Program_21 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A(a: T_A[Int, T_B]) extends T_A[T_B, T_A[(T_B,T_B), Boolean]]
case class CC_B(a: Byte, b: CC_A) extends T_B
case class CC_C(a: T_B, b: T_B, c: T_A[(CC_A,Char), CC_A]) extends T_B
case class CC_D(a: Char) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B(_, CC_A(_)) => 0 
  case CC_C(CC_B(0, _), CC_B(_, CC_A(_)), _) => 1 
  case CC_C(CC_B(0, _), CC_C(_, _, _), _) => 2 
  case CC_C(CC_B(0, _), CC_D(_), _) => 3 
  case CC_C(CC_B(_, _), CC_B(_, CC_A(_)), _) => 4 
  case CC_C(CC_B(_, _), CC_C(_, _, _), _) => 5 
  case CC_C(CC_B(_, _), CC_D(_), _) => 6 
  case CC_C(CC_C(CC_B(_, _), CC_B(_, _), _), CC_B(_, CC_A(_)), _) => 7 
  case CC_C(CC_C(CC_B(_, _), CC_B(_, _), _), CC_C(_, _, _), _) => 8 
  case CC_C(CC_C(CC_B(_, _), CC_B(_, _), _), CC_D(_), _) => 9 
  case CC_C(CC_C(CC_B(_, _), CC_C(_, _, _), _), CC_B(_, CC_A(_)), _) => 10 
  case CC_C(CC_C(CC_B(_, _), CC_C(_, _, _), _), CC_C(_, _, _), _) => 11 
  case CC_C(CC_C(CC_B(_, _), CC_C(_, _, _), _), CC_D(_), _) => 12 
  case CC_C(CC_C(CC_B(_, _), CC_D(_), _), CC_B(_, CC_A(_)), _) => 13 
  case CC_C(CC_C(CC_B(_, _), CC_D(_), _), CC_C(_, _, _), _) => 14 
  case CC_C(CC_C(CC_B(_, _), CC_D(_), _), CC_D(_), _) => 15 
  case CC_C(CC_C(CC_C(_, _, _), CC_B(_, _), _), CC_B(_, CC_A(_)), _) => 16 
  case CC_C(CC_C(CC_C(_, _, _), CC_B(_, _), _), CC_C(_, _, _), _) => 17 
  case CC_C(CC_C(CC_C(_, _, _), CC_B(_, _), _), CC_D(_), _) => 18 
  case CC_C(CC_C(CC_C(_, _, _), CC_C(_, _, _), _), CC_B(_, CC_A(_)), _) => 19 
  case CC_C(CC_C(CC_C(_, _, _), CC_C(_, _, _), _), CC_C(_, _, _), _) => 20 
  case CC_C(CC_C(CC_C(_, _, _), CC_C(_, _, _), _), CC_D(_), _) => 21 
  case CC_C(CC_C(CC_C(_, _, _), CC_D(_), _), CC_B(_, CC_A(_)), _) => 22 
  case CC_C(CC_C(CC_C(_, _, _), CC_D(_), _), CC_C(_, _, _), _) => 23 
  case CC_C(CC_C(CC_C(_, _, _), CC_D(_), _), CC_D(_), _) => 24 
  case CC_C(CC_C(CC_D(_), CC_B(_, _), _), CC_B(_, CC_A(_)), _) => 25 
  case CC_C(CC_C(CC_D(_), CC_B(_, _), _), CC_C(_, _, _), _) => 26 
  case CC_C(CC_C(CC_D(_), CC_B(_, _), _), CC_D(_), _) => 27 
  case CC_C(CC_C(CC_D(_), CC_C(_, _, _), _), CC_B(_, CC_A(_)), _) => 28 
  case CC_C(CC_C(CC_D(_), CC_C(_, _, _), _), CC_C(_, _, _), _) => 29 
  case CC_C(CC_C(CC_D(_), CC_C(_, _, _), _), CC_D(_), _) => 30 
  case CC_C(CC_C(CC_D(_), CC_D(_), _), CC_B(_, CC_A(_)), _) => 31 
  case CC_C(CC_C(CC_D(_), CC_D(_), _), CC_C(_, _, _), _) => 32 
  case CC_C(CC_D(_), CC_B(_, CC_A(_)), _) => 33 
  case CC_C(CC_D(_), CC_C(_, _, _), _) => 34 
  case CC_C(CC_D(_), CC_D(_), _) => 35 
  case CC_D(_) => 36 
}
}
// This is not matched: CC_C(CC_C(CC_D(_), CC_D(_), _), CC_D(_), _)