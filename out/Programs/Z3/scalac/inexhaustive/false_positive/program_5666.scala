package Program_14 

object Test {
sealed trait T_A[A, B]
case class CC_B[F, E](a: F) extends T_A[F, E]

val v_a: CC_B[Char, Byte] = null
val v_b: Int = v_a match{
  case CC_B('x') => 0 
}
}
// This is not matched: Pattern match is empty without constants