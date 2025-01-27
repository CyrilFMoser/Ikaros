package Program_20 

object Test {
sealed trait T_A
sealed trait T_B
case class CC_A(a: T_A, b: T_B) extends T_A
case class CC_B(a: Boolean, b: CC_A) extends T_A
case class CC_C(a: Boolean, b: CC_B) extends T_A
case class CC_D() extends T_B
case class CC_E(a: T_B, b: CC_C) extends T_B
case class CC_F(a: T_B, b: CC_D, c: (Int,T_B)) extends T_B

val v_a: CC_E = null
val v_b: Int = v_a match{
  case CC_E(CC_D(), _) => 0 
  case CC_E(CC_E(_, CC_C(_, _)), _) => 1 
  case CC_E(CC_F(CC_D(), _, (_,_)), _) => 2 
  case CC_E(CC_F(CC_E(_, _), _, (_,_)), _) => 3 
  case CC_E(CC_F(CC_F(_, _, _), _, (_,_)), _) => 4 
}
}