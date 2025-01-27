package Program_15 

object Test {
sealed trait T_A
case class CC_B(a: Int) extends T_A

val v_a: CC_B = null
val v_b: Int = v_a match{
  case CC_B(12) => 0 
}
}
// This is not matched: (CC_B Byte Boolean Char Wildcard (T_A Boolean Byte))