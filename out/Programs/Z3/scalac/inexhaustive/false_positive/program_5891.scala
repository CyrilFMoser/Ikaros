package Program_14 

object Test {
sealed trait T_B
case class CC_C(a: (T_B,T_B)) extends T_B
case class CC_D() extends T_B

val v_a: CC_C = null
val v_b: Int = v_a match{
  case CC_C((_,CC_D())) => 0 
}
}
// This is not matched: (CC_B Boolean (T_A Boolean))