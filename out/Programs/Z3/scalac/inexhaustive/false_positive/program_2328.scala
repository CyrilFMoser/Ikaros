package Program_30 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_B[D](a: Byte) extends T_A[D]
case class CC_D() extends T_B

val v_a: CC_B[CC_D] = null
val v_b: Int = v_a match{
  case CC_B(0) => 0 
}
}
// This is not matched: (CC_B Wildcard T_A)