package Program_14 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_C(a: T_B) extends T_B
case class CC_D() extends T_B

val v_a: CC_C = null
val v_b: Int = v_a match{
  case CC_C(CC_C(_)) => 0 
}
}
// This is not matched: (CC_C (CC_E T_B Wildcard T_B) Wildcard T_B)