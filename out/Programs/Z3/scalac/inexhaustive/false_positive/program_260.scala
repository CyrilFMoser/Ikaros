package Program_30 

object Test {
sealed trait T_A[A, B]
case class CC_B[E, F](a: Char) extends T_A[F, E]

val v_a: CC_B[Int, Char] = null
val v_b: Int = v_a match{
  case CC_B('x') => 0 
}
}
// This is not matched: (CC_C Byte Wildcard Wildcard T_B)