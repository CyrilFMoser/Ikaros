package Program_56 

object Test {
sealed trait T_A
case class CC_B(a: Char) extends T_A
case class CC_C(a: CC_B) extends T_A

val v_a: CC_C = null
val v_b: Int = v_a match{
  case CC_C(CC_B('x')) => 0 
}
}
// This is not matched: (CC_B T_B)