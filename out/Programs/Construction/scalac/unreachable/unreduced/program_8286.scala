package Program_28 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C, b: T_A[C, C], c: T_A[C, C]) extends T_A[T_A[C, C], C]
case class CC_B[D](a: Boolean, b: Boolean, c: (T_A[Byte, Int],CC_A[Byte])) extends T_A[T_A[D, D], D]
case class CC_C[E](a: T_A[E, E]) extends T_A[T_A[E, E], E]

val v_a: T_A[T_A[Byte, Byte], Byte] = null
val v_b: Int = v_a match{
  case CC_B(_, true, _) => 0 
  case CC_B(_, false, _) => 1 
  case CC_C(_) => 2 
}
}
// This is not matched: CC_A(_, _, _)