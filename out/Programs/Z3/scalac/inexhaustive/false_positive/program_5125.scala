package Program_14 

object Test {
sealed trait T_A
case class CC_B() extends T_A
case class CC_C(a: (T_A,CC_B)) extends T_A

val v_a: CC_C = null
val v_b: Int = v_a match{
  case CC_C((CC_C(_),_)) => 0 
}
}
// This is not matched: (CC_A (T_A T_B))