package Program_0 

object Test {
sealed trait T_A
sealed trait T_B
case class CC_A() extends T_A
case class CC_B(a: (Boolean,CC_A), b: (T_B,T_B)) extends T_A
case class CC_C(a: (T_A,(CC_B,CC_B))) extends T_A
case class CC_D(a: CC_A, b: CC_A, c: (CC_B,CC_B)) extends T_B
case class CC_E(a: CC_D, b: Char) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_D(CC_A(), _, _) => 0 
  case CC_E(_, 'x') => 1 
  case CC_E(_, _) => 2 
}
}