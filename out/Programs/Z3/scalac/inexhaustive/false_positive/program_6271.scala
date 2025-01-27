package Program_13 

object Test {
sealed trait T_A[A, B]
case class CC_A[F, E](a: (Char,(Boolean,Int))) extends T_A[F, E]

val v_a: CC_A[Boolean, Char] = null
val v_b: Int = v_a match{
  case CC_A(('x',_)) => 0 
}
}
// This is not matched: (CC_C Wildcard T_A)