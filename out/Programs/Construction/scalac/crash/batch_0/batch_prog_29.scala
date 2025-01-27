package Program_29 

object Test {
sealed trait T_A
case class CC_A() extends T_A
case class CC_B(a: Boolean, b: CC_A, c: Byte) extends T_A
case class CC_C(a: CC_A, b: (CC_B,CC_A), c: CC_B) extends T_A

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A() => 0 
}
}