package Program_15 

object Test {
sealed trait T_A[A, B]
case class CC_B[F, E](a: Byte) extends T_A[F, E]

val v_a: CC_B[Char, Char] = null
val v_b: Int = v_a match{
  case CC_B(0) => 0 
}
}
// This is not matched: (CC_C Wildcard T_B)