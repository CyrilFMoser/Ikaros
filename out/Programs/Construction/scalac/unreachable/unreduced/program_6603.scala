package Program_11 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: Int, b: T_A, c: T_A) extends T_A
case class CC_B() extends T_A
case class CC_C(a: (CC_A,(CC_B,(Char,Int))), b: Char, c: T_A) extends T_A
case class CC_D(a: CC_C, b: CC_B, c: Byte) extends T_B[CC_B]
case class CC_E() extends T_B[CC_B]
case class CC_F(a: Char, b: T_B[CC_A]) extends T_B[CC_B]

val v_a: T_B[CC_B] = null
val v_b: Int = v_a match{
  case CC_D(_, CC_B(), _) => 0 
  case CC_E() => 1 
  case CC_F(_, _) => 2 
}
}