package Program_15 

object Test {
sealed trait T_A[A, B]
case class CC_A[D, E](a: Char) extends T_A[D, E]

val v_a: CC_A[Boolean, Int] = null
val v_b: Int = v_a match{
  case CC_A('x') => 0 
}
}
// This is not matched: Pattern match is empty without constants