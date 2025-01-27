package Program_31 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C) extends T_A[C, Boolean]

val v_a: CC_A[Char] = null
val v_b: Int = v_a match{
  case CC_A('x') => 0 
}
}
// This is not matched: (CC_A (CC_A Wildcard Wildcard Byte T_A) Wildcard Wildcard T_A)