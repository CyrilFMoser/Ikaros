package Program_15 

object Test {
sealed trait T_A
case class CC_A() extends T_A
case class CC_B(a: (T_A,CC_A), b: CC_A) extends T_A

val v_a: CC_B = null
val v_b: Int = v_a match{
  case CC_B((CC_A(),_), _) => 0 
}
}
// This is not matched: (CC_A Byte Int (T_A Int Byte))