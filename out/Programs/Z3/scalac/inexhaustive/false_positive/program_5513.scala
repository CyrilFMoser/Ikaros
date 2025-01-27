package Program_12 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_D() extends T_B
case class CC_E(a: T_B) extends T_B

val v_a: CC_E = null
val v_b: Int = v_a match{
  case CC_E(CC_D()) => 0 
}
}
// This is not matched: (CC_E (T_B (T_A Char)))