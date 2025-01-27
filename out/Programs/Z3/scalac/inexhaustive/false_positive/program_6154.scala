package Program_15 

object Test {
sealed trait T_B[C]
case class CC_E[J](a: (Char,(Char,Boolean))) extends T_B[J]

val v_a: CC_E[Boolean] = null
val v_b: Int = v_a match{
  case CC_E(('x',_)) => 0 
}
}
// This is not matched: (CC_A Byte Wildcard Byte Wildcard (T_A Byte (T_A Byte Byte)))