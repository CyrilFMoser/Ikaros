package Program_13 

object Test {
sealed trait T_B
case class CC_D(a: Byte, b: (T_B,T_B)) extends T_B
case class CC_F() extends T_B

val v_a: CC_D = null
val v_b: Int = v_a match{
  case CC_D(_, (_,CC_F())) => 0 
}
}
// This is not matched: (CC_A Wildcard (T_A (T_A Char)))