package Program_12 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: Char) extends T_A[C, T_A[C, C]]

val v_a: CC_A[Char] = null
val v_b: Int = v_a match{
  case CC_A('x') => 0 
}
}
// This is not matched: (CC_C Byte Int Wildcard Wildcard (T_A Int Byte))