package Program_15 

object Test {
sealed trait T_A
case class CC_A(a: Int) extends T_A

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A(12) => 0 
}
}
// This is not matched: (CC_A (CC_B (CC_A Wildcard T_A) Wildcard T_A) T_A)