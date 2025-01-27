package Program_15 

object Test {
sealed trait T_B
case class CC_C(a: Int) extends T_B

val v_a: CC_C = null
val v_b: Int = v_a match{
  case CC_C(12) => 0 
}
}
// This is not matched: (CC_A Char (CC_A T_A Wildcard (CC_B T_A) T_A) Wildcard T_A)