package Program_13 

object Test {
sealed trait T_B
case class CC_B(a: Char) extends T_B

val v_a: CC_B = null
val v_b: Int = v_a match{
  case CC_B('x') => 0 
}
}
// This is not matched: (CC_A Boolean Wildcard (T_A (T_A Byte Char) Boolean))