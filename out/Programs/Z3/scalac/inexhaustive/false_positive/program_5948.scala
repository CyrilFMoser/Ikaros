package Program_11 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D, E]() extends T_A[E, D]
case class CC_C(a: Char) extends T_B[CC_A[Boolean, Int]]

val v_a: CC_C = null
val v_b: Int = v_a match{
  case CC_C('x') => 0 
}
}
// This is not matched: (CC_A Wildcard T_A)