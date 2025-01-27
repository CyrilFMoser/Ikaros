package Program_19 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: (T_A[T_B],Byte), b: (T_B,T_B), c: T_B) extends T_A[(T_A[(Byte,Boolean)],T_A[T_B])]
case class CC_B() extends T_A[(T_A[(Byte,Boolean)],T_A[T_B])]
case class CC_C(a: CC_B) extends T_A[(T_A[(Byte,Boolean)],T_A[T_B])]
case class CC_D(a: Byte) extends T_B
case class CC_E(a: CC_A, b: T_A[CC_D]) extends T_B
case class CC_F(a: CC_E, b: CC_B, c: CC_B) extends T_B

val v_a: T_A[(T_A[(Byte,Boolean)],T_A[T_B])] = null
val v_b: Int = v_a match{
  case CC_A(_, (CC_D(_),CC_D(_)), CC_D(_)) => 0 
  case CC_A(_, (CC_D(_),CC_E(_, _)), CC_D(_)) => 1 
  case CC_A(_, (CC_D(_),CC_F(_, _, _)), CC_D(_)) => 2 
  case CC_A(_, (CC_E(_, _),CC_D(_)), CC_D(_)) => 3 
  case CC_A(_, (CC_E(_, _),CC_E(_, _)), CC_D(_)) => 4 
  case CC_A(_, (CC_E(_, _),CC_F(_, _, _)), CC_D(_)) => 5 
  case CC_A(_, (CC_F(_, _, _),CC_D(_)), CC_D(_)) => 6 
  case CC_A(_, (CC_F(_, _, _),CC_E(_, _)), CC_D(_)) => 7 
  case CC_A(_, (CC_F(_, _, _),CC_F(_, _, _)), CC_D(_)) => 8 
  case CC_A(_, (CC_D(_),CC_D(_)), CC_E(CC_A(_, _, _), _)) => 9 
  case CC_A(_, (CC_D(_),CC_E(_, _)), CC_E(CC_A(_, _, _), _)) => 10 
  case CC_A(_, (CC_D(_),CC_F(_, _, _)), CC_E(CC_A(_, _, _), _)) => 11 
  case CC_A(_, (CC_E(_, _),CC_D(_)), CC_E(CC_A(_, _, _), _)) => 12 
  case CC_A(_, (CC_E(_, _),CC_E(_, _)), CC_E(CC_A(_, _, _), _)) => 13 
  case CC_A(_, (CC_E(_, _),CC_F(_, _, _)), CC_E(CC_A(_, _, _), _)) => 14 
  case CC_A(_, (CC_F(_, _, _),CC_D(_)), CC_E(CC_A(_, _, _), _)) => 15 
  case CC_A(_, (CC_F(_, _, _),CC_E(_, _)), CC_E(CC_A(_, _, _), _)) => 16 
  case CC_A(_, (CC_F(_, _, _),CC_F(_, _, _)), CC_E(CC_A(_, _, _), _)) => 17 
  case CC_A(_, (CC_D(_),CC_D(_)), CC_F(CC_E(_, _), CC_B(), _)) => 18 
  case CC_A(_, (CC_D(_),CC_E(_, _)), CC_F(CC_E(_, _), CC_B(), _)) => 19 
  case CC_A(_, (CC_D(_),CC_F(_, _, _)), CC_F(CC_E(_, _), CC_B(), _)) => 20 
  case CC_A(_, (CC_E(_, _),CC_D(_)), CC_F(CC_E(_, _), CC_B(), _)) => 21 
  case CC_A(_, (CC_E(_, _),CC_E(_, _)), CC_F(CC_E(_, _), CC_B(), _)) => 22 
  case CC_A(_, (CC_E(_, _),CC_F(_, _, _)), CC_F(CC_E(_, _), CC_B(), _)) => 23 
  case CC_A(_, (CC_F(_, _, _),CC_D(_)), CC_F(CC_E(_, _), CC_B(), _)) => 24 
  case CC_A(_, (CC_F(_, _, _),CC_E(_, _)), CC_F(CC_E(_, _), CC_B(), _)) => 25 
  case CC_A(_, (CC_F(_, _, _),CC_F(_, _, _)), CC_F(CC_E(_, _), CC_B(), _)) => 26 
  case CC_B() => 27 
  case CC_C(CC_B()) => 28 
}
}