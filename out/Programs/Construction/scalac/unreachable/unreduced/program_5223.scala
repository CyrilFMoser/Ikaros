package Program_3 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_A, b: T_B[(T_A,Byte)]) extends T_A
case class CC_B(a: CC_A, b: Boolean) extends T_A
case class CC_C(a: T_B[(T_A,T_A)]) extends T_B[(T_A,T_A)]
case class CC_D(a: (CC_A,T_B[CC_A]), b: T_A) extends T_B[(T_A,T_A)]
case class CC_E(a: (CC_B,T_A), b: CC_D, c: T_B[CC_A]) extends T_B[(T_A,T_A)]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_, _), _), _) => 0 
  case CC_A(CC_A(CC_B(_, _), _), _) => 1 
  case CC_A(CC_B(_, _), _) => 2 
  case CC_B(_, true) => 3 
  case CC_B(_, false) => 4 
}
}