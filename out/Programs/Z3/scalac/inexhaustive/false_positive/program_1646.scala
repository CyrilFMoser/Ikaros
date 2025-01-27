package Program_31 

object Test {
sealed trait T_B[C]
case class CC_C[E](a: Byte) extends T_B[E]

val v_a: CC_C[Byte] = null
val v_b: Int = v_a match{
  case CC_C(0) => 0 
}
}
// This is not matched: (CC_B Byte Wildcard Wildcard (T_B Byte))