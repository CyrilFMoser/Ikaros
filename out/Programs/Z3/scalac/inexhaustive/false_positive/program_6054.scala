package Program_15 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D](a: D) extends T_A[C, D]

val v_a: CC_A[Boolean, Char] = null
val v_b: Int = v_a match{
  case CC_A('x') => 0 
}
}
// This is not matched: (CC_A (CC_B (CC_A Wildcard Wildcard Wildcard T_A) T_A) Wildcard Wildcard T_A)