package Program_9 

object Test {
sealed trait T_A[A]
case class CC_A[D](a: T_A[D], b: Char, c: T_A[D]) extends T_A[D]
case class CC_C[E]() extends T_A[E]

val v_a: CC_A[T_A[(Char,Byte)]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, CC_C()) => 0 
}
}
// This is not matched: (CC_A T_A Wildcard Wildcard T_A)