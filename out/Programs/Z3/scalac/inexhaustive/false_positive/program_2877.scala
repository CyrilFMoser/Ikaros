package Program_31 

object Test {
sealed trait T_B
case class CC_D(a: Byte) extends T_B

val v_a: CC_D = null
val v_b: Int = v_a match{
  case CC_D(0) => 0 
}
}
// This is not matched: (CC_D (CC_A T_A T_A)
//      Wildcard
//      (CC_B (CC_A (T_B T_A) T_A) (T_B (CC_A (T_B T_A) T_A)))
//      Wildcard
//      (T_B (CC_A T_A T_A)))