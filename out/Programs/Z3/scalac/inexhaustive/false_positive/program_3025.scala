package Program_14 

object Test {
sealed trait T_A
case class CC_A() extends T_A
case class CC_B(a: T_A) extends T_A

val v_a: CC_B = null
val v_b: Int = v_a match{
  case CC_B(CC_A()) => 0 
}
}
// This is not matched: (CC_B Byte (Tuple Wildcard Wildcard) (T_A Byte))