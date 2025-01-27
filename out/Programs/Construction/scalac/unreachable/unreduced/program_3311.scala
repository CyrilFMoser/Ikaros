package Program_8 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, T_A[C, C]], b: T_A[Byte, C], c: T_A[C, C]) extends T_A[T_A[T_A[Byte, Int], Char], C]
case class CC_B[D](a: T_A[D, D], b: T_A[D, D]) extends T_A[T_A[T_A[Byte, Int], Char], D]
case class CC_C[E]() extends T_A[T_A[T_A[Byte, Int], Char], E]

val v_a: T_A[T_A[T_A[Byte, Int], Char], Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_C() => 1 
}
}
// This is not matched: CC_B(_, _)