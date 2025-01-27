package Program_30 

object Test {
sealed trait T_A[A, B]
case class CC_A[E](a: E) extends T_A[E, T_A[E, E]]

val v_a: CC_A[Char] = null
val v_b: Int = v_a match{
  case CC_A('x') => 0 
}
}
// This is not matched: (CC_C T_A)