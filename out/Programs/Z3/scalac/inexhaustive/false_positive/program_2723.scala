package Program_31 

object Test {
sealed trait T_B
case class CC_B(a: Char) extends T_B

val v_a: CC_B = null
val v_b: Int = v_a match{
  case CC_B('x') => 0 
}
}
// This is not matched: (CC_B Byte
//      (CC_B Byte
//            (CC_C Byte Wildcard (Tuple Char Wildcard) Wildcard (T_A Byte))
//            (T_A Byte))
//      (T_A Byte))