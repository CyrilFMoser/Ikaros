package Program_15 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_D(a: T_B) extends T_B
case class CC_E() extends T_B

val v_a: CC_D = null
val v_b: Int = v_a match{
  case CC_D(CC_D(_)) => 0 
}
}
// This is not matched: (CC_B T_A)