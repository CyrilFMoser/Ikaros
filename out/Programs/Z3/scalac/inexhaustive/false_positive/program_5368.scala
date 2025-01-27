package Program_13 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_C(a: Int) extends T_B

val v_a: CC_C = null
val v_b: Int = v_a match{
  case CC_C(12) => 0 
}
}
// This is not matched: (CC_C Wildcard T_A)