package Program_15 

object Test {
sealed trait T_B
case class CC_B(a: (T_B,T_B)) extends T_B
case class CC_C() extends T_B

val v_a: CC_B = null
val v_b: Int = v_a match{
  case CC_B((CC_B(_),_)) => 0 
}
}
// This is not matched: (CC_A Wildcard Wildcard T_A)