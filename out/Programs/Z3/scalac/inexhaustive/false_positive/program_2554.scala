package Program_30 

object Test {
sealed trait T_A[A, B]
case class CC_B[E](a: (Char,Boolean), b: T_A[E, E]) extends T_A[E, T_A[E, E]]

val v_a: T_A[Char, T_A[Char, Char]] = null
val v_b: Int = v_a match{
  case CC_B(('x',_), _) => 0 
}
}
// This is not matched: (CC_C (T_A Char))