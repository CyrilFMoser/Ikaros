package Program_31 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_E[I](a: I) extends T_B[I, (Byte,Boolean)]

val v_a: CC_E[Byte] = null
val v_b: Int = v_a match{
  case CC_E(0) => 0 
}
}
// This is not matched: (CC_C Byte Wildcard Wildcard (T_B (CC_A Byte Boolean) Byte))