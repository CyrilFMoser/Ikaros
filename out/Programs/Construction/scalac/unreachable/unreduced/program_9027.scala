package Program_6 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_A, b: T_B[T_A]) extends T_A
case class CC_B(a: T_A) extends T_A
case class CC_C() extends T_A
case class CC_D() extends T_B[CC_B]
case class CC_E(a: (CC_B,Char), b: Byte) extends T_B[CC_B]
case class CC_F(a: CC_A, b: T_B[CC_B]) extends T_B[CC_B]

val v_a: T_B[CC_B] = null
val v_b: Int = v_a match{
  case CC_D() => 0 
  case CC_E((CC_B(_),_), _) => 1 
  case CC_F(CC_A(_, _), CC_D()) => 2 
  case CC_F(CC_A(_, _), CC_E((_,_), _)) => 3 
  case CC_F(CC_A(_, _), CC_F(CC_A(_, _), CC_D())) => 4 
  case CC_F(CC_A(_, _), CC_F(CC_A(_, _), CC_F(_, _))) => 5 
}
}
// This is not matched: CC_F(CC_A(_, _), CC_F(CC_A(_, _), CC_E(_, _)))