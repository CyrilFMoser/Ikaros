package Program_14 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_B[E](a: E) extends T_A[T_B, E]

val v_a: CC_B[Char] = null
val v_b: Int = v_a match{
  case CC_B('x') => 0 
}
}
// This is not matched: (CC_B (T_A (T_A Char)))