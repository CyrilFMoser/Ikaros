package Program_15 

object Test {
sealed trait T_B[B]
case class CC_C(a: Char) extends T_B[Byte]

val v_a: CC_C = null
val v_b: Int = v_a match{
  case CC_C('x') => 0 
}
}
// This is not matched: (CC_A Byte Wildcard Wildcard (T_A Byte))