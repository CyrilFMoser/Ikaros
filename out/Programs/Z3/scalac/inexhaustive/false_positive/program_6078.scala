package Program_13 

object Test {
sealed trait T_A
sealed trait T_B
case class CC_B(a: T_B) extends T_A
case class CC_D() extends T_B
case class CC_E() extends T_B

val v_a: CC_B = null
val v_b: Int = v_a match{
  case CC_B(CC_E()) => 0 
}
}
// This is not matched: Pattern match is empty without constants