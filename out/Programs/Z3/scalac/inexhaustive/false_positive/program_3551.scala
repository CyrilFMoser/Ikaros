package Program_15 

object Test {
sealed trait T_B[C]
case class CC_E[H](a: (Char,Byte)) extends T_B[H]

val v_a: CC_E[Char] = null
val v_b: Int = v_a match{
  case CC_E(('x',_)) => 0 
}
}
// This is not matched: (CC_A (T_A (T_A Byte)))