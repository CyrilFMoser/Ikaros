package Program_12 

object Test {
sealed trait T_A
case class CC_A(a: (T_A,Char)) extends T_A

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A((_,'x')) => 0 
}
}
// This is not matched: (CC_D Byte Wildcard Byte Wildcard (T_B (Tuple T_A (Tuple Int Boolean)) Byte))