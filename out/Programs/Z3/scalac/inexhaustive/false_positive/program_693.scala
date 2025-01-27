package Program_30 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D](a: D) extends T_A[D, C]

val v_a: CC_A[Byte, Byte] = null
val v_b: Int = v_a match{
  case CC_A(0) => 0 
}
}
// This is not matched: (CC_B T_A Wildcard Wildcard Wildcard T_A)