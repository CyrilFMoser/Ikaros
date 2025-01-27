package Program_2 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_B, b: T_A[C, C]) extends T_A[C, T_B]
case class CC_B[D]() extends T_A[D, T_B]
case class CC_C[E]() extends T_A[E, T_B]

val v_a: T_A[Boolean, T_B] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_C() => 1 
}
}
// This is not matched: CC_B()