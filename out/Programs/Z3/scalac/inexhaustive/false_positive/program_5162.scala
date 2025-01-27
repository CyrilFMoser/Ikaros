package Program_12 

object Test {
sealed trait T_B[B]
case class CC_B[C](a: C) extends T_B[C]

val v_a: CC_B[Byte] = null
val v_b: Int = v_a match{
  case CC_B(0) => 0 
}
}
// This is not matched: (CC_B T_A Wildcard Wildcard T_A)