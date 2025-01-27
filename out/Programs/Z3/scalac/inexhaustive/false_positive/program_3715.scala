package Program_14 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_B() extends T_A
case class CC_D[C](a: Byte) extends T_B[C, CC_B]

val v_a: CC_D[Byte] = null
val v_b: Int = v_a match{
  case CC_D(0) => 0 
}
}
// This is not matched: (CC_C Wildcard Wildcard Wildcard T_A)