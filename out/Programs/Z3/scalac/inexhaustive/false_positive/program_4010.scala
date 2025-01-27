package Program_14 

object Test {
sealed trait T_A
sealed trait T_B
case class CC_B() extends T_A
case class CC_C() extends T_A
case class CC_F(a: ((Char,Boolean),CC_B), b: CC_C, c: T_A) extends T_B

val v_a: CC_F = null
val v_b: Int = v_a match{
  case CC_F(_, _, CC_B()) => 0 
}
}
// This is not matched: (CC_C (T_A (Tuple Char Boolean) Byte)
//      Boolean
//      Wildcard
//      Wildcard
//      (T_A (T_A (Tuple Char Boolean) Byte) Boolean))