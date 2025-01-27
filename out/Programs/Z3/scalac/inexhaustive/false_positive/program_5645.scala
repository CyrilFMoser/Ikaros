package Program_15 

object Test {
sealed trait T_B[B, C]
case class CC_E[G](a: G) extends T_B[G, Byte]

val v_a: CC_E[Byte] = null
val v_b: Int = v_a match{
  case CC_E(0) => 0 
}
}
// This is not matched: (CC_B T_A)