package Program_14 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_C[E](a: Byte) extends T_A[T_B, E]

val v_a: CC_C[Byte] = null
val v_b: Int = v_a match{
  case CC_C(0) => 0 
}
}
// This is not matched: (CC_B Wildcard T_A)