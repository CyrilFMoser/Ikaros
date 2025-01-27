package Program_20 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_B, b: T_B) extends T_A[T_A[T_B]]
case class CC_B() extends T_A[T_A[T_B]]
case class CC_C(a: T_B, b: T_B, c: T_B) extends T_A[T_A[T_B]]
case class CC_D(a: CC_A) extends T_B
case class CC_E() extends T_B
case class CC_F(a: Boolean, b: T_A[CC_B]) extends T_B

val v_a: T_A[T_A[T_B]] = null
val v_b: Int = v_a match{
  case CC_A(CC_D(_), _) => 0 
  case CC_A(CC_E(), _) => 1 
  case CC_A(CC_F(_, _), _) => 2 
  case CC_B() => 3 
  case CC_C(CC_D(CC_A(_, _)), CC_D(_), CC_D(_)) => 4 
  case CC_C(CC_D(CC_A(_, _)), CC_E(), CC_D(_)) => 5 
  case CC_C(CC_D(CC_A(_, _)), CC_F(_, _), CC_D(_)) => 6 
  case CC_C(CC_E(), CC_D(_), CC_D(_)) => 7 
  case CC_C(CC_E(), CC_E(), CC_D(_)) => 8 
  case CC_C(CC_E(), CC_F(_, _), CC_D(_)) => 9 
  case CC_C(CC_F(_, _), CC_D(_), CC_D(_)) => 10 
  case CC_C(CC_F(_, _), CC_E(), CC_D(_)) => 11 
  case CC_C(CC_F(_, _), CC_F(_, _), CC_D(_)) => 12 
  case CC_C(CC_D(CC_A(_, _)), CC_D(_), CC_E()) => 13 
  case CC_C(CC_D(CC_A(_, _)), CC_E(), CC_E()) => 14 
  case CC_C(CC_D(CC_A(_, _)), CC_F(_, _), CC_E()) => 15 
  case CC_C(CC_E(), CC_D(_), CC_E()) => 16 
  case CC_C(CC_E(), CC_E(), CC_E()) => 17 
  case CC_C(CC_E(), CC_F(_, _), CC_E()) => 18 
  case CC_C(CC_F(_, _), CC_D(_), CC_E()) => 19 
  case CC_C(CC_F(_, _), CC_E(), CC_E()) => 20 
  case CC_C(CC_F(_, _), CC_F(_, _), CC_E()) => 21 
  case CC_C(CC_D(CC_A(_, _)), CC_D(_), CC_F(_, _)) => 22 
  case CC_C(CC_D(CC_A(_, _)), CC_E(), CC_F(_, _)) => 23 
  case CC_C(CC_D(CC_A(_, _)), CC_F(_, _), CC_F(_, _)) => 24 
  case CC_C(CC_E(), CC_D(_), CC_F(_, _)) => 25 
  case CC_C(CC_E(), CC_E(), CC_F(_, _)) => 26 
  case CC_C(CC_E(), CC_F(_, _), CC_F(_, _)) => 27 
  case CC_C(CC_F(_, _), CC_D(_), CC_F(_, _)) => 28 
  case CC_C(CC_F(_, _), CC_E(), CC_F(_, _)) => 29 
  case CC_C(CC_F(_, _), CC_F(_, _), CC_F(_, _)) => 30 
}
}