package Program_15 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[D, E](a: Byte) extends T_A[D, E]

val v_a: CC_A[Byte, T_B] = null
val v_b: Int = v_a match{
  case CC_A(0) => 0 
}
}
// This is not matched: (CC_A Byte T_A)