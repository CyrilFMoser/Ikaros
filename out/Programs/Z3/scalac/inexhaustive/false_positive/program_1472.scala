package Program_31 

object Test {
sealed trait T_A
sealed trait T_B
case class CC_D(a: Byte) extends T_B

val v_a: CC_D = null
val v_b: Int = v_a match{
  case CC_D(0) => 0 
}
}
// This is not matched: (CC_B Wildcard
//      (CC_A Wildcard Wildcard T_A)
//      (CC_B Wildcard Wildcard Wildcard T_A)
//      T_A)