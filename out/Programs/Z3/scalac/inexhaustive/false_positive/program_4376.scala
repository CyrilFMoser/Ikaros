package Program_14 

object Test {
sealed trait T_A[A]
case class CC_A(a: Byte) extends T_A[(Byte,Char)]

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A(0) => 0 
}
}
// This is not matched: (CC_E (CC_B T_A) Wildcard Wildcard T_B)