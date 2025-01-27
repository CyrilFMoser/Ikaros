package Program_13 

object Test {
sealed trait T_A
case class CC_B(a: (Int,T_A)) extends T_A

val v_a: CC_B = null
val v_b: Int = v_a match{
  case CC_B((12,_)) => 0 
}
}
// This is not matched: (CC_B Byte Wildcard Wildcard (T_A Byte))