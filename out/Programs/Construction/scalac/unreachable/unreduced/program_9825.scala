package Program_30 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: Boolean, b: Boolean, c: T_A[T_A[C, C], C]) extends T_A[Byte, C]
case class CC_B[D](a: T_A[Byte, D]) extends T_A[Byte, D]
case class CC_C[E](a: T_A[Byte, E], b: Boolean) extends T_A[Byte, E]

val v_a: T_A[Byte, Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_C(_, _) => 1 
}
}
// This is not matched: CC_B(_)