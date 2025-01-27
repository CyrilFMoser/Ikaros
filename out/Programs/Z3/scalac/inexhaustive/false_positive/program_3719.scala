package Program_15 

object Test {
sealed trait T_A[A]
case class CC_C[E](a: Char) extends T_A[E]

val v_a: CC_C[Boolean] = null
val v_b: Int = v_a match{
  case CC_C('x') => 0 
}
}
// This is not matched: (CC_A Wildcard (T_A (T_A Int)))