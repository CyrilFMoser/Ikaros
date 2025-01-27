package Program_12 

object Test {
sealed trait T_A[A]
case class CC_C[E](a: Byte) extends T_A[E]

val v_a: CC_C[Char] = null
val v_b: Int = v_a match{
  case CC_C(0) => 0 
}
}
// This is not matched: (CC_B Wildcard
//      (CC_C (T_B (CC_A Wildcard Wildcard Wildcard)))
//      Wildcard
//      (T_B (CC_A T_A T_A T_A)))