package Program_20 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: Byte, b: T_A[T_A[Byte, Byte], C]) extends T_A[T_A[Byte, Byte], C]
case class CC_B[D]() extends T_A[T_A[Byte, Byte], D]
case class CC_C[E](a: E, b: T_A[T_A[Byte, Byte], E], c: T_A[T_A[Byte, Byte], E]) extends T_A[T_A[Byte, Byte], E]

val v_a: CC_C[Byte] = null
val v_b: Int = v_a match{
  case CC_C(_, _, _) => 0 
}
}