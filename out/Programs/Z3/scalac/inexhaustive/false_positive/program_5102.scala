package Program_12 

object Test {
sealed trait T_A[A]
case class CC_B[B](a: Char) extends T_A[B]

val v_a: CC_B[Boolean] = null
val v_b: Int = v_a match{
  case CC_B('x') => 0 
}
}
// This is not matched: (CC_B Wildcard T_A)