package Program_13 

object Test {
sealed trait T_A[A, B]
case class CC_B[D, E](a: (Int,Char)) extends T_A[D, E]

val v_a: CC_B[Char, Byte] = null
val v_b: Int = v_a match{
  case CC_B((_,'x')) => 0 
}
}
// This is not matched: (CC_D Wildcard (CC_C Wildcard Wildcard T_B) Wildcard T_B)