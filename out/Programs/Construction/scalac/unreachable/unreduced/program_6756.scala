package Program_27 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C, b: T_A[C, T_A[C, C]]) extends T_A[T_A[T_A[Char, Int], T_A[Char, Char]], C]
case class CC_B[D](a: CC_A[D], b: CC_A[T_A[D, D]]) extends T_A[T_A[T_A[Char, Int], T_A[Char, Char]], D]
case class CC_C[E](a: Byte, b: Char, c: T_A[T_A[E, E], E]) extends T_A[T_A[T_A[Char, Int], T_A[Char, Char]], E]

val v_a: T_A[T_A[T_A[Char, Int], T_A[Char, Char]], Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, _) => 1 
  case CC_C(_, _, _) => 2 
}
}