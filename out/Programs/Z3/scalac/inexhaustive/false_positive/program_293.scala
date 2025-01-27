package Program_30 

object Test {
sealed trait T_A[A, B]
case class CC_C[E](a: Char) extends T_A[T_A[Int, Byte], E]

val v_a: CC_C[Byte] = null
val v_b: Int = v_a match{
  case CC_C('x') => 0 
}
}
// This is not matched: Pattern match is empty without constants