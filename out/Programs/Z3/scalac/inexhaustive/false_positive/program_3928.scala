package Program_13 

object Test {
sealed trait T_A
case class CC_A() extends T_A
case class CC_B(a: CC_A, b: (Char,CC_A), c: T_A) extends T_A
case class CC_C() extends T_A

val v_a: CC_B = null
val v_b: Int = v_a match{
  case CC_B(_, _, CC_C()) => 0 
}
}
// This is not matched: (CC_A Byte (T_A (T_B Byte Byte) Byte))