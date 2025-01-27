package Program_15 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: Char) extends T_A[B]

val v_a: CC_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A('x') => 0 
}
}
// This is not matched: (CC_C (CC_C Wildcard Byte T_A) Wildcard T_A)