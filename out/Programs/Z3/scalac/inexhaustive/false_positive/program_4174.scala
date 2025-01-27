package Program_11 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_B() extends T_A
case class CC_C[C](a: Byte) extends T_B[CC_B, C]

val v_a: CC_C[CC_B] = null
val v_b: Int = v_a match{
  case CC_C(0) => 0 
}
}
// This is not matched: (CC_C (CC_B Wildcard T_A) T_A)