package Program_15 

object Test {
sealed trait T_A[A, B]
case class CC_C[E](a: (Char,Char)) extends T_A[T_A[Boolean, Char], E]

val v_a: CC_C[Byte] = null
val v_b: Int = v_a match{
  case CC_C(('x',_)) => 0 
}
}
// This is not matched: (CC_A T_A Wildcard T_A)