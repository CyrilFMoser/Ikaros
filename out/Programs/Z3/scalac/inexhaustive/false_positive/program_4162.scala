package Program_10 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_D(a: T_B) extends T_B
case class CC_E() extends T_B

val v_a: CC_D = null
val v_b: Int = v_a match{
  case CC_D(CC_E()) => 0 
}
}
// This is not matched: (CC_A (CC_C (T_A (T_A Boolean)) (T_A Boolean))
//      Wildcard
//      (T_A (CC_C (T_A (T_A Boolean)) (T_A Boolean))))