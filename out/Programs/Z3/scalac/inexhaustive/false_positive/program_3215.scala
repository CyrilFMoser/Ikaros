package Program_14 

object Test {
sealed trait T_A
sealed trait T_B
case class CC_B() extends T_B
case class CC_C(a: T_A, b: T_B) extends T_B

val v_a: CC_C = null
val v_b: Int = v_a match{
  case CC_C(_, CC_C(_, _)) => 0 
}
}
// This is not matched: (CC_B Wildcard Wildcard Wildcard (T_A (T_A Boolean)))