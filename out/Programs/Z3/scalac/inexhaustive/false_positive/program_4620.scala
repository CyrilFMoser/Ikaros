package Program_15 

object Test {
sealed trait T_A[A, B]
case class CC_A[F, E](a: Char) extends T_A[F, E]

val v_a: CC_A[Boolean, Char] = null
val v_b: Int = v_a match{
  case CC_A('x') => 0 
}
}
// This is not matched: Pattern match is empty without constants