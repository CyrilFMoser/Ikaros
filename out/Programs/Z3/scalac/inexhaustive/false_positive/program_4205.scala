package Program_14 

object Test {
sealed trait T_A[A, B]
case class CC_B[D](a: D) extends T_A[T_A[Boolean, Int], D]

val v_a: CC_B[Char] = null
val v_b: Int = v_a match{
  case CC_B('x') => 0 
}
}
// This is not matched: (CC_C Wildcard Wildcard Wildcard T_B)