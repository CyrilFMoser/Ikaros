package Program_14 

object Test {
sealed trait T_A
case class CC_A() extends T_A
case class CC_C(a: (T_A,T_A)) extends T_A

val v_a: CC_C = null
val v_b: Int = v_a match{
  case CC_C((CC_A(),_)) => 0 
}
}
// This is not matched: (CC_A (CC_C (T_A (T_A Boolean)) (T_A Boolean))
//      Wildcard
//      (T_A (CC_C (T_A (T_A Boolean)) (T_A Boolean))))