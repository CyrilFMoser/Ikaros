package Program_8 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[T_A[C, C], C]) extends T_A[T_A[Boolean, T_A[Byte, Int]], C]
case class CC_B[D](a: T_A[D, D], b: T_A[D, D]) extends T_A[T_A[Boolean, T_A[Byte, Int]], D]
case class CC_C[E](a: CC_A[E]) extends T_A[T_A[Boolean, T_A[Byte, Int]], E]

val v_a: T_A[T_A[Boolean, T_A[Byte, Int]], Int] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_C(_) => 1 
}
}
// This is not matched: CC_B(_, _)