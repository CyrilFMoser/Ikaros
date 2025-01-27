package Program_14 

object Test {
sealed trait T_A[A, B]
case class CC_B[F, G](a: G) extends T_A[F, G]

val v_a: CC_B[Boolean, Char] = null
val v_b: Int = v_a match{
  case CC_B('x') => 0 
}
}
// This is not matched: (CC_A Wildcard T_A)