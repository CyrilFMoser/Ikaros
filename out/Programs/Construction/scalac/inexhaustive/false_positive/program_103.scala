package Program_29 

object Test {
sealed trait T_A
sealed trait T_B
case class CC_B(a: T_B) extends T_A
case class CC_C(a: CC_B) extends T_A
case class CC_D() extends T_B
case class CC_E() extends T_B

val v_a: CC_C = null
val v_b: Int = v_a match{
  case CC_C(CC_B(CC_D())) => 0 
}
}
// This is not matched: CC_C(CC_D(), CC_A(), _)