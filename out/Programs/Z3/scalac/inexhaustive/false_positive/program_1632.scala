package Program_30 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: Int) extends T_A[(T_B,T_B)]

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A(12) => 0 
}
}
// This is not matched: (CC_B Wildcard T_A)