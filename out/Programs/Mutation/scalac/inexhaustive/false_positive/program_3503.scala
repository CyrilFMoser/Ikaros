package Program_29 

object Test {
sealed trait T_A
case class CC_A() extends T_A
case class CC_C(a: T_A) extends T_A

val v_a: CC_C = null
val v_b: Int = v_a match{
  case CC_C(CC_A()) => 0 
}
}
// This is not matched: (CC_C (CC_B T_A) T_A)