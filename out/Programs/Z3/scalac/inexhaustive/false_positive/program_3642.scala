package Program_13 

object Test {
sealed trait T_A
case class CC_A(a: T_A) extends T_A
case class CC_C() extends T_A

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A(CC_C()) => 0 
}
}
// This is not matched: (CC_E Int Wildcard Wildcard Wildcard (T_B (T_A Boolean) Int))