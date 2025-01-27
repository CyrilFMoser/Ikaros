package Program_14 

object Test {
sealed trait T_A[A]
case class CC_A[D](a: Char) extends T_A[D]

val v_a: CC_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A('x') => 0 
}
}
// This is not matched: (CC_C (CC_B T_B Wildcard T_B) T_B)