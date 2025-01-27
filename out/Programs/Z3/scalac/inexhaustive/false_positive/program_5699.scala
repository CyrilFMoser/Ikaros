package Program_13 

object Test {
sealed trait T_A[A, B]
case class CC_B[G, F](a: G) extends T_A[F, G]

val v_a: CC_B[Char, Int] = null
val v_b: Int = v_a match{
  case CC_B('x') => 0 
}
}
// This is not matched: (CC_C Wildcard Wildcard T_A)