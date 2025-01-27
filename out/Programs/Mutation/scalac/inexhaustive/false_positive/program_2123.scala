package Program_21 

object Test {
sealed trait T_A
case class CC_A(a: Char) extends T_A

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A('x') => 0 
}
}
// This is not matched: (CC_A Byte
//      (CC_A Byte
//            (CC_A Byte (CC_A Byte Wildcard (T_A Byte)) (T_A Byte))
//            (T_A Byte))
//      (T_A Byte))