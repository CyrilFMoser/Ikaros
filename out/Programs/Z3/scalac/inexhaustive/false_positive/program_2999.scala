package Program_14 

object Test {
sealed trait T_A
case class CC_A() extends T_A
case class CC_B(a: T_A, b: T_A) extends T_A

val v_a: CC_B = null
val v_b: Int = v_a match{
  case CC_B(_, CC_A()) => 0 
}
}
// This is not matched: (CC_C Byte Int Wildcard Wildcard (T_A Int Byte))