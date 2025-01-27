package Program_29 

object Test {
sealed trait T_A[A, B]
case class CC_B[E, D](a: E) extends T_A[D, E]

val v_a: CC_B[Char, Boolean] = null
val v_b: Int = v_a match{
  case CC_B('x') => 0 
}
}
// This is not matched: (CC_B T_B)