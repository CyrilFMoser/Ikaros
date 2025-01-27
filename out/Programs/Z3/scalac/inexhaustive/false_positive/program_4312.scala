package Program_12 

object Test {
sealed trait T_A
sealed trait T_B
case class CC_A() extends T_A
case class CC_C() extends T_B
case class CC_E(a: CC_A, b: T_B) extends T_B

val v_a: CC_E = null
val v_b: Int = v_a match{
  case CC_E(_, CC_E(_, _)) => 0 
}
}
// This is not matched: (CC_C Boolean Wildcard Wildcard (T_B Boolean))