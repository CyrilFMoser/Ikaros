package Program_13 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_B[C](a: Byte) extends T_A[C]
case class CC_E() extends T_B

val v_a: CC_B[CC_E] = null
val v_b: Int = v_a match{
  case CC_B(0) => 0 
}
}
// This is not matched: (CC_D Int Wildcard (T_B Int))