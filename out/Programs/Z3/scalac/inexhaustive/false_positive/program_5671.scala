package Program_14 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_B[C](a: Byte) extends T_B[C, T_A]

val v_a: CC_B[Byte] = null
val v_b: Int = v_a match{
  case CC_B(0) => 0 
}
}
// This is not matched: (CC_C Wildcard (T_A Int Byte))