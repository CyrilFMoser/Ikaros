package Program_15 

object Test {
sealed trait T_B[C, D]
case class CC_C[H](a: H) extends T_B[H, T_B[H, H]]

val v_a: CC_C[Byte] = null
val v_b: Int = v_a match{
  case CC_C(0) => 0 
}
}
// This is not matched: (CC_B Wildcard T_A)