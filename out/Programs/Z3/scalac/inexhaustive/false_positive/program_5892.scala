package Program_13 

object Test {
sealed trait T_A
case class CC_A(a: (Int,T_A)) extends T_A
case class CC_B() extends T_A

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A((_,CC_B())) => 0 
}
}
// This is not matched: (CC_B Boolean (T_A Boolean))