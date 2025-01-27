package Program_12 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[D, C]() extends T_A[C, D]
case class CC_B[E](a: Char) extends T_A[E, CC_A[E, T_B]]

val v_a: CC_B[Char] = null
val v_b: Int = v_a match{
  case CC_B('x') => 0 
}
}
// This is not matched: (CC_A (CC_A Wildcard Wildcard Wildcard T_A) Wildcard Wildcard T_A)