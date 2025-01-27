package Program_31 

object Test {
sealed trait T_A[A, B]
case class CC_B[E](a: Char) extends T_A[E, T_A[E, E]]

val v_a: CC_B[Char] = null
val v_b: Int = v_a match{
  case CC_B('x') => 0 
}
}
// This is not matched: (CC_C Wildcard Wildcard (T_A (CC_A Byte Boolean Boolean Boolean)))