package Program_2 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_B, b: T_B) extends T_A[T_B]
case class CC_B(a: (T_A[T_B],CC_A)) extends T_A[T_B]
case class CC_C(a: T_A[Boolean], b: CC_A) extends T_A[T_B]
case class CC_D(a: (CC_B,Byte), b: CC_B, c: T_B) extends T_B
case class CC_E(a: T_A[T_B]) extends T_B
case class CC_F() extends T_B

val v_a: CC_E = null
val v_b: Int = v_a match{
  case CC_E(CC_A(CC_D(_, _, _), CC_D(_, _, _))) => 0 
  case CC_E(CC_A(CC_E(_), CC_D(_, _, _))) => 1 
  case CC_E(CC_A(CC_F(), CC_D(_, _, _))) => 2 
  case CC_E(CC_A(CC_D(_, _, _), CC_E(_))) => 3 
  case CC_E(CC_A(CC_E(_), CC_E(_))) => 4 
  case CC_E(CC_A(CC_F(), CC_E(_))) => 5 
  case CC_E(CC_A(CC_D(_, _, _), CC_F())) => 6 
  case CC_E(CC_A(CC_E(_), CC_F())) => 7 
  case CC_E(CC_A(CC_F(), CC_F())) => 8 
  case CC_E(CC_B((_,_))) => 9 
  case CC_E(CC_C(_, _)) => 10 
}
}