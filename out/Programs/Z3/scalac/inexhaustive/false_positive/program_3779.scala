package Program_12 

object Test {
sealed trait T_A
sealed trait T_B
case class CC_B(a: Int, b: T_B) extends T_A
case class CC_C() extends T_B
case class CC_D() extends T_B

val v_a: CC_B = null
val v_b: Int = v_a match{
  case CC_B(_, CC_D()) => 0 
}
}
// This is not matched: (CC_A Char (T_A Char))