package Program_31 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_B, b: Byte) extends T_A[(T_B,Char)]
case class CC_B() extends T_A[(T_B,Char)]
case class CC_C[B](a: CC_A, b: T_A[(T_B,Char)]) extends T_A[(T_B,Char)]
case class CC_D(a: (CC_B,T_A[(Byte,Char)]), b: Byte) extends T_B
case class CC_E() extends T_B
case class CC_F(a: CC_E, b: T_A[CC_A], c: CC_E) extends T_B

val v_a: T_A[(T_B,Char)] = null
val v_b: Int = v_a match{
  case CC_A(CC_D(_, _), _) => 0 
  case CC_A(CC_E(), _) => 1 
  case CC_A(CC_F(_, _, CC_E()), _) => 2 
  case CC_B() => 3 
  case CC_C(CC_A(CC_D(_, _), _), CC_A(CC_D(_, _), _)) => 4 
  case CC_C(CC_A(CC_D(_, _), _), CC_A(CC_E(), _)) => 5 
  case CC_C(CC_A(CC_D(_, _), _), CC_A(CC_F(_, _, _), _)) => 6 
  case CC_C(CC_A(CC_D(_, _), _), CC_B()) => 7 
  case CC_C(CC_A(CC_D(_, _), _), CC_C(_, _)) => 8 
  case CC_C(CC_A(CC_E(), _), CC_A(CC_D(_, _), _)) => 9 
  case CC_C(CC_A(CC_E(), _), CC_A(CC_E(), _)) => 10 
  case CC_C(CC_A(CC_E(), _), CC_A(CC_F(_, _, _), _)) => 11 
  case CC_C(CC_A(CC_E(), _), CC_B()) => 12 
  case CC_C(CC_A(CC_E(), _), CC_C(_, _)) => 13 
  case CC_C(CC_A(CC_F(_, _, _), _), CC_A(CC_D(_, _), _)) => 14 
  case CC_C(CC_A(CC_F(_, _, _), _), CC_A(CC_E(), _)) => 15 
  case CC_C(CC_A(CC_F(_, _, _), _), CC_A(CC_F(_, _, _), _)) => 16 
  case CC_C(CC_A(CC_F(_, _, _), _), CC_B()) => 17 
  case CC_C(CC_A(CC_F(_, _, _), _), CC_C(_, _)) => 18 
}
}