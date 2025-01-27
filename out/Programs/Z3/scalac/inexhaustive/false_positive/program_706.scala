package Program_30 

object Test {
sealed trait T_A[A, B]
case class CC_A[D](a: Char) extends T_A[D, Byte]

val v_a: CC_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A('x') => 0 
}
}
// This is not matched: (CC_B Wildcard T_A)