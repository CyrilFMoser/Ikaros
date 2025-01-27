package Program_12 

object Test {
sealed trait T_A
case class CC_B(a: Byte) extends T_A

val v_a: CC_B = null
val v_b: Int = v_a match{
  case CC_B(0) => 0 
}
}
// This is not matched: (CC_A (CC_B (Tuple Boolean Wildcard) Wildcard T_A)
//      (Tuple Wildcard (CC_B Wildcard Wildcard T_A))
//      T_A)