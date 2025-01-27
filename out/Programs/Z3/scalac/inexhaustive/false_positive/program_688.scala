package Program_30 

object Test {
sealed trait T_A[A, B]
case class CC_B[D](a: Char) extends T_A[T_A[D, D], D]

val v_a: CC_B[Byte] = null
val v_b: Int = v_a match{
  case CC_B('x') => 0 
}
}
// This is not matched: (CC_B (CC_B Wildcard T_A) T_A)