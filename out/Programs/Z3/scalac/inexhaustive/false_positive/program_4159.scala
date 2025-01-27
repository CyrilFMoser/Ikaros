package Program_13 

object Test {
sealed trait T_A
sealed trait T_B
case class CC_A(a: T_B) extends T_A
case class CC_B() extends T_B
case class CC_C() extends T_B

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A(CC_B()) => 0 
}
}
// This is not matched: (CC_A (CC_C (T_A (T_A Boolean)) (T_A Boolean))
//      Wildcard
//      (T_A (CC_C (T_A (T_A Boolean)) (T_A Boolean))))