package Program_17 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[T_A[Char, Char], Char], b: C, c: T_A[C, T_A[C, Byte]]) extends T_A[T_A[C, C], C]
case class CC_B[D](a: CC_A[D], b: Byte, c: T_A[D, D]) extends T_A[T_A[D, D], D]
case class CC_C[E](a: T_A[T_A[E, E], E]) extends T_A[T_A[E, E], E]

val v_a: T_A[T_A[Char, Char], Char] = null
val v_b: Int = v_a match{
  case CC_A(_, 'x', _) => 0 
  case CC_A(_, _, _) => 1 
  case CC_B(CC_A(_, _, _), _, _) => 2 
  case CC_C(_) => 3 
}
}