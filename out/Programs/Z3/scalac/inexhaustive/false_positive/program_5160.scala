package Program_14 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_D(a: Int) extends T_B

val v_a: CC_D = null
val v_b: Int = v_a match{
  case CC_D(12) => 0 
}
}
// This is not matched: (CC_B T_A Wildcard Wildcard T_A)