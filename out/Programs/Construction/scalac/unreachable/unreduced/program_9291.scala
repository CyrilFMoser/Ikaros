package Program_13 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C]() extends T_A[T_B, C]
case class CC_B[D](a: Boolean, b: D, c: T_A[T_B, D]) extends T_A[T_B, D]
case class CC_C[E](a: CC_A[E], b: T_A[E, E]) extends T_A[T_B, E]

val v_a: T_A[T_B, Byte] = null
val v_b: Int = v_a match{
  case CC_B(_, _, _) => 0 
  case CC_C(CC_A(), _) => 1 
}
}
// This is not matched: CC_A()