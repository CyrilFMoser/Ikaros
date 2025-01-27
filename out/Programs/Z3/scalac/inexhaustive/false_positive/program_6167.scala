package Program_15 

object Test {
sealed trait T_A
case class CC_C(a: Int) extends T_A

val v_a: CC_C = null
val v_b: Int = v_a match{
  case CC_C(12) => 0 
}
}
// This is not matched: (CC_B T_A T_A)