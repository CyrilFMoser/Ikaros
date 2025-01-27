package Program_12 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C]) extends T_A[T_A[T_A[Byte, Char], T_A[Int, Int]], C]
case class CC_B[D]() extends T_A[T_A[T_A[Byte, Char], T_A[Int, Int]], D]
case class CC_C[E](a: CC_A[E], b: Int, c: CC_A[E]) extends T_A[T_A[T_A[Byte, Char], T_A[Int, Int]], E]

val v_a: T_A[T_A[T_A[Byte, Char], T_A[Int, Int]], Char] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B() => 1 
}
}
// This is not matched: CC_C(_, _, _)