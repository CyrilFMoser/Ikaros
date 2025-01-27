package Program_14 

object Test {
sealed trait T_A[A, B]
case class CC_B[E, F](a: F) extends T_A[F, E]

val v_a: CC_B[Boolean, Char] = null
val v_b: Int = v_a match{
  case CC_B('x') => 0 
}
}
// This is not matched: (CC_A (CC_A (CC_B Wildcard Wildcard Wildcard T_A) Wildcard T_A) Wildcard T_A)