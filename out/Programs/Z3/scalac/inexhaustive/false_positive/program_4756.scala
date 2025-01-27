package Program_12 

object Test {
sealed trait T_A[A]
case class CC_C[D](a: Byte) extends T_A[D]

val v_a: CC_C[Char] = null
val v_b: Int = v_a match{
  case CC_C(0) => 0 
}
}
// This is not matched: (CC_B Boolean (CC_B Wildcard Wildcard Wildcard T_B) Wildcard T_B)