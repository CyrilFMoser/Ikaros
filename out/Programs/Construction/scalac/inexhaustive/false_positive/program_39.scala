package Program_63 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, T_A[C, C]], b: T_A[C, C]) extends T_A[C, T_A[C, C]]
case class CC_C[E]() extends T_A[E, T_A[E, E]]

val v_a: CC_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A(CC_C(), _) => 0 
}
}
// This is not matched: CC_A(CC_B(CC_B(_)), _, _)