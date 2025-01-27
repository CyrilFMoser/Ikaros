package Program_28 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: Boolean, b: T_B, c: T_B) extends T_A[(T_B,T_A[Boolean])]
case class CC_B(a: Int, b: T_A[T_A[CC_A]]) extends T_A[(T_B,T_A[Boolean])]
case class CC_C(a: CC_A) extends T_A[(T_B,T_A[Boolean])]
case class CC_D(a: T_A[CC_C], b: CC_A, c: T_B) extends T_B
case class CC_E(a: CC_D, b: Int) extends T_B
case class CC_F(a: T_B, b: Byte) extends T_B

val v_a: T_A[(T_B,T_A[Boolean])] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_D(_, _, _), _) => 0 
  case CC_A(_, CC_E(CC_D(_, _, _), _), _) => 1 
  case CC_A(_, CC_F(_, _), _) => 2 
  case CC_B(_, _) => 3 
  case CC_C(CC_A(true, CC_D(_, _, _), _)) => 4 
  case CC_C(CC_A(true, CC_E(_, _), _)) => 5 
  case CC_C(CC_A(true, CC_F(_, _), _)) => 6 
  case CC_C(CC_A(false, CC_D(_, _, _), _)) => 7 
  case CC_C(CC_A(false, CC_E(_, _), _)) => 8 
  case CC_C(CC_A(false, CC_F(_, _), _)) => 9 
}
}