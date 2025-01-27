package Program_31 

object Test {
sealed trait T_B[A, B]
case class CC_D[E](a: E) extends T_B[Boolean, E]

val v_a: CC_D[Char] = null
val v_b: Int = v_a match{
  case CC_D('x') => 0 
}
}
// This is not matched: Pattern match is empty without constants