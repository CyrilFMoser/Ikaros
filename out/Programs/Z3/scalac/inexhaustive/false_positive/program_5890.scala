package Program_15 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[D, C]() extends T_A[C, D]
case class CC_B[E]() extends T_A[E, T_B]
case class CC_C(a: (T_B,T_B), b: T_A[T_B, T_B]) extends T_B

val v_a: CC_C = null
val v_b: Int = v_a match{
  case CC_C(_, CC_A()) => 0 
}
}
// This is not matched: (CC_B Boolean (T_A Boolean))