package Program_15 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[D, C](a: T_A[C, C], b: T_A[D, D]) extends T_A[D, C]
case class CC_B[E](a: T_A[E, E]) extends T_A[T_A[T_A[T_B, Byte], T_A[T_B, T_B]], E]
case class CC_C() extends T_B
case class CC_D() extends T_B
case class CC_E() extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C() => 0 
  case CC_D() => 1 
}
}
// This is not matched: CC_E()