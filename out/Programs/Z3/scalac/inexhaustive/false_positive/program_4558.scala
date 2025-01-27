package Program_15 

object Test {
sealed trait T_B
case class CC_B() extends T_B
case class CC_C(a: Char, b: (T_B,Int)) extends T_B

val v_a: CC_C = null
val v_b: Int = v_a match{
  case CC_C(_, (CC_B(),_)) => 0 
}
}
// This is not matched: (CC_B (T_A Byte) (T_A (T_A Byte)))