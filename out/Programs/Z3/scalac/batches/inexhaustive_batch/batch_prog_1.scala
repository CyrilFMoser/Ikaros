package Program_1 

 object Test {
sealed trait T_A
sealed trait T_B
case class CC_A() extends T_A
case class CC_B(a: CC_A, b: Boolean) extends T_A
case class CC_C(a: T_B) extends T_B
case class CC_D(a: Byte) extends T_B
case class CC_E(a: Int) extends T_B

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_B(_, _) => 0 
  case CC_B(CC_A(), _) => 1 
}
}