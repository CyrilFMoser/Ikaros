package Program_31 

object Test {
sealed trait T_A[A, B]
case class CC_A[E](a: E) extends T_A[T_A[E, E], E]

val v_a: CC_A[Char] = null
val v_b: Int = v_a match{
  case CC_A('x') => 0 
}
}
// This is not matched: (CC_E (T_A Boolean Boolean)
//      Wildcard
//      Wildcard
//      Wildcard
//      (T_B (CC_A Int Boolean Boolean)))