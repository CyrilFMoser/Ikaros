package Program_14 

object Test {
sealed trait T_B
case class CC_C() extends T_B
case class CC_D(a: T_B, b: CC_C) extends T_B

val v_a: CC_D = null
val v_b: Int = v_a match{
  case CC_D(CC_D(_, _), _) => 0 
}
}
// This is not matched: (CC_B Wildcard (T_A (Tuple (Tuple Char Byte) Boolean)))