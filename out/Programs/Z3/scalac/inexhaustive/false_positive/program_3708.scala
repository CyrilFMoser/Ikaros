package Program_12 

object Test {
sealed trait T_A[A]
case class CC_C[E](a: Char) extends T_A[E]

val v_a: CC_C[Int] = null
val v_b: Int = v_a match{
  case CC_C('x') => 0 
}
}
// This is not matched: (CC_C Boolean Wildcard (T_A (T_A Int)))