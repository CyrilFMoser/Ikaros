package Program_15 

object Test {
sealed trait T_A
sealed trait T_B
case class CC_A() extends T_A
case class CC_B() extends T_A
case class CC_C(a: T_B, b: CC_A) extends T_A
case class CC_D(a: T_B) extends T_B
case class CC_E(a: CC_D, b: CC_A) extends T_B
case class CC_F(a: CC_B, b: Char, c: CC_C) extends T_B

val v_a: CC_C = null
val v_b: Int = v_a match{
  case CC_C(CC_D(CC_D(_)), _) => 0 
  case CC_C(CC_D(CC_E(_, _)), _) => 1 
  case CC_C(CC_D(CC_F(_, _, _)), _) => 2 
  case CC_C(CC_E(CC_D(_), CC_A()), _) => 3 
  case CC_C(CC_F(_, _, _), _) => 4 
}
}