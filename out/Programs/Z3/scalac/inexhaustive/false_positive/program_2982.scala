package Program_15 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D]() extends T_A[C, D]
case class CC_B[E](a: (Char,Int)) extends T_A[CC_A[E, E], E]

val v_a: CC_B[Boolean] = null
val v_b: Int = v_a match{
  case CC_B((_,12)) => 0 
}
}
// This is not matched: (CC_E Wildcard T_B)