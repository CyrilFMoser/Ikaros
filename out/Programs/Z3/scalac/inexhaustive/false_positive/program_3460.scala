package Program_14 

object Test {
sealed trait T_A
sealed trait T_B
case class CC_C(a: Int) extends T_B

val v_a: CC_C = null
val v_b: Int = v_a match{
  case CC_C(12) => 0 
}
}
// This is not matched: (CC_B Byte Boolean (T_A Byte))