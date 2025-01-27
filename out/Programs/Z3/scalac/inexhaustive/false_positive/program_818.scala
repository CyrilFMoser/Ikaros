package Program_31 

object Test {
sealed trait T_A[A, B]
case class CC_C[E](a: (Char,Char)) extends T_A[E, T_A[E, E]]

val v_a: CC_C[Char] = null
val v_b: Int = v_a match{
  case CC_C(('x',_)) => 0 
}
}
// This is not matched: (CC_B Wildcard Wildcard (T_A Char))