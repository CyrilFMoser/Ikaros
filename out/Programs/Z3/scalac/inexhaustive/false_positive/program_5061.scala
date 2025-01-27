package Program_15 

object Test {
sealed trait T_A[A]
case class CC_A[C](a: C, b: T_A[C], c: T_A[C]) extends T_A[C]
case class CC_C[E]() extends T_A[E]

val v_a: CC_A[Char] = null
val v_b: Int = v_a match{
  case CC_A(_, _, CC_A(_, _, _)) => 0 
}
}
// This is not matched: (CC_B Wildcard Wildcard T_A)