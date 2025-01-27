package Program_21 

object Test {
sealed trait T_A
sealed trait T_B
case class CC_A(a: Byte, b: T_A, c: T_B) extends T_A
case class CC_B(a: T_B, b: T_B, c: CC_A) extends T_A
case class CC_C(a: T_A) extends T_B
case class CC_D() extends T_B
case class CC_E() extends T_B

val v_a: CC_D = null
val v_b: Int = v_a match{
  case CC_D() => 0 
}
}