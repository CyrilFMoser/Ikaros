package Program_15 

object Test {
sealed trait T_A[A, B]
case class CC_B[D, E](a: E) extends T_A[D, E]

val v_a: CC_B[Int, Char] = null
val v_b: Int = v_a match{
  case CC_B('x') => 0 
}
}
// This is not matched: Pattern match is empty without constants