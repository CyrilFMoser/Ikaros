package Program_14 

object Test {
sealed trait T_B[C, D]
case class CC_C[H, G](a: (Byte,Int)) extends T_B[G, H]

val v_a: CC_C[Boolean, Int] = null
val v_b: Int = v_a match{
  case CC_C((_,12)) => 0 
}
}
// This is not matched: (CC_A Byte Wildcard Wildcard (T_A Byte))