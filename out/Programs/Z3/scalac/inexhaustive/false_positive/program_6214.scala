package Program_15 

object Test {
sealed trait T_A
case class CC_A() extends T_A
case class CC_C(a: T_A, b: T_A) extends T_A

val v_a: CC_C = null
val v_b: Int = v_a match{
  case CC_C(_, CC_A()) => 0 
}
}
// This is not matched: (CC_B Wildcard (T_A Byte (T_A Byte Boolean)))