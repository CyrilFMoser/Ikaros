package Program_4 

object Test {
sealed trait T_A
sealed trait T_B
case class CC_A(a: T_B) extends T_A
case class CC_B() extends T_A
case class CC_C(a: (CC_B,CC_B)) extends T_A
case class CC_D(a: CC_A) extends T_B
case class CC_E(a: CC_C, b: Boolean, c: Char) extends T_B
case class CC_F(a: T_B, b: CC_C) extends T_B

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(CC_D(_)) => 0 
  case CC_A(CC_E(_, _, _)) => 1 
  case CC_A(CC_F(_, CC_C(_))) => 2 
  case CC_B() => 3 
  case CC_C((CC_B(),CC_B())) => 4 
}
}