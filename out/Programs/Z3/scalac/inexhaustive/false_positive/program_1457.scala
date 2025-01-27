package Program_29 

object Test {
sealed trait T_A
sealed trait T_B
case class CC_A(a: Byte) extends T_A

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A(0) => 0 
}
}
// This is not matched: (CC_A Boolean (T_A (T_A Boolean Boolean) Boolean))