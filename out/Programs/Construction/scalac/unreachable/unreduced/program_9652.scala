package Program_10 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_B, b: C, c: C) extends T_A[T_A[Byte, (Byte,T_B)], C]
case class CC_B(a: CC_A[T_B], b: T_A[T_B, T_B]) extends T_A[T_A[Byte, (Byte,T_B)], T_B]
case class CC_C(a: CC_A[T_B]) extends T_A[T_A[Byte, (Byte,T_B)], T_B]
case class CC_D(a: CC_C) extends T_B
case class CC_E[D](a: CC_C, b: CC_B, c: T_A[D, T_B]) extends T_B
case class CC_F(a: Boolean) extends T_B

val v_a: T_A[T_A[Byte, (Byte,T_B)], T_B] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(CC_D(_), CC_D(_), CC_D(_)), _) => 0 
  case CC_B(CC_A(CC_E(_, _, _), CC_D(_), CC_D(_)), _) => 1 
  case CC_B(CC_A(CC_F(_), CC_D(_), CC_D(_)), _) => 2 
  case CC_B(CC_A(CC_D(_), CC_D(_), CC_E(_, _, _)), _) => 3 
  case CC_B(CC_A(CC_E(_, _, _), CC_D(_), CC_E(_, _, _)), _) => 4 
  case CC_B(CC_A(CC_F(_), CC_D(_), CC_E(_, _, _)), _) => 5 
  case CC_B(CC_A(CC_D(_), CC_D(_), CC_F(_)), _) => 6 
  case CC_B(CC_A(CC_E(_, _, _), CC_D(_), CC_F(_)), _) => 7 
  case CC_B(CC_A(CC_F(_), CC_D(_), CC_F(_)), _) => 8 
  case CC_B(CC_A(CC_D(_), CC_E(_, _, _), CC_D(_)), _) => 9 
  case CC_B(CC_A(CC_E(_, _, _), CC_E(_, _, _), CC_D(_)), _) => 10 
  case CC_B(CC_A(CC_F(_), CC_E(_, _, _), CC_D(_)), _) => 11 
  case CC_B(CC_A(CC_D(_), CC_E(_, _, _), CC_E(_, _, _)), _) => 12 
  case CC_B(CC_A(CC_E(_, _, _), CC_E(_, _, _), CC_E(_, _, _)), _) => 13 
  case CC_B(CC_A(CC_F(_), CC_E(_, _, _), CC_E(_, _, _)), _) => 14 
  case CC_B(CC_A(CC_D(_), CC_E(_, _, _), CC_F(_)), _) => 15 
  case CC_B(CC_A(CC_E(_, _, _), CC_E(_, _, _), CC_F(_)), _) => 16 
  case CC_B(CC_A(CC_F(_), CC_E(_, _, _), CC_F(_)), _) => 17 
  case CC_B(CC_A(CC_D(_), CC_F(_), CC_D(_)), _) => 18 
  case CC_B(CC_A(CC_E(_, _, _), CC_F(_), CC_D(_)), _) => 19 
  case CC_B(CC_A(CC_F(_), CC_F(_), CC_D(_)), _) => 20 
  case CC_B(CC_A(CC_D(_), CC_F(_), CC_E(_, _, _)), _) => 21 
  case CC_B(CC_A(CC_E(_, _, _), CC_F(_), CC_E(_, _, _)), _) => 22 
  case CC_B(CC_A(CC_F(_), CC_F(_), CC_E(_, _, _)), _) => 23 
  case CC_B(CC_A(CC_D(_), CC_F(_), CC_F(_)), _) => 24 
  case CC_B(CC_A(CC_E(_, _, _), CC_F(_), CC_F(_)), _) => 25 
  case CC_B(CC_A(CC_F(_), CC_F(_), CC_F(_)), _) => 26 
  case CC_C(CC_A(_, CC_D(_), _)) => 27 
  case CC_C(CC_A(_, CC_E(_, _, _), _)) => 28 
  case CC_C(CC_A(_, CC_F(_), _)) => 29 
}
}
// This is not matched: CC_A(_, _, _)