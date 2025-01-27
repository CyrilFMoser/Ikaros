package Program_15 

object Test {
sealed trait T_A[A]
case class CC_B[C](a: Byte) extends T_A[C]

val v_a: CC_B[Byte] = null
val v_b: Int = v_a match{
  case CC_B(0) => 0 
}
}
// This is not matched: (CC_A Wildcard T_A)