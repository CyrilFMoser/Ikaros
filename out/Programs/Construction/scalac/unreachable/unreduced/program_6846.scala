package Program_3 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C]() extends T_A[T_A[T_B, (T_B,T_B)], C]
case class CC_B[D]() extends T_A[T_A[T_B, (T_B,T_B)], D]
case class CC_C[E](a: E, b: T_A[CC_A[E], E], c: CC_B[E]) extends T_A[T_A[T_B, (T_B,T_B)], E]

val v_a: T_A[T_A[T_B, (T_B,T_B)], Byte] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C(0, _, CC_B()) => 1 
  case CC_C(_, _, CC_B()) => 2 
}
}
// This is not matched: CC_A()