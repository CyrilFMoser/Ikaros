package Program_14 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: Char) extends T_A[B]

val v_a: CC_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A('x') => 0 
}
}
// This is not matched: (CC_B Wildcard T_A)