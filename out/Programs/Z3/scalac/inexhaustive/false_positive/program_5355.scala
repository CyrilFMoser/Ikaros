package Program_14 

object Test {
sealed trait T_A[A, B]
case class CC_B[E](a: Int) extends T_A[Byte, E]

val v_a: CC_B[Char] = null
val v_b: Int = v_a match{
  case CC_B(12) => 0 
}
}
// This is not matched: (CC_D Wildcard Wildcard T_B)