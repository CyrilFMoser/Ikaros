package Program_30 

object Test {
sealed trait T_B[B, C]
case class CC_B[E](a: E) extends T_B[E, T_B[E, Byte]]

val v_a: CC_B[Byte] = null
val v_b: Int = v_a match{
  case CC_B(0) => 0 
}
}
// This is not matched: (CC_B Wildcard Wildcard Wildcard T_A)