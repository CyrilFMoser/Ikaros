package Program_3 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: (T_B,T_B), b: T_A[Char, C]) extends T_A[Char, C]
case class CC_B[D](a: T_A[D, D], b: T_A[D, T_A[Char, D]]) extends T_A[Char, D]
case class CC_C[E](a: E, b: Byte, c: T_A[Char, E]) extends T_A[E, T_A[Char, E]]
case class CC_D(a: CC_A[T_A[T_B, T_B]], b: CC_C[T_B]) extends T_B

val v_a: T_A[Char, Boolean] = null
val v_b: Int = v_a match{
  case CC_A((CC_D(_, _),CC_D(_, _)), _) => 0 
  case CC_B(_, CC_C(_, _, CC_B(_, _))) => 1 
}
}
// This is not matched: CC_B(_, CC_C(_, _, CC_A(_, _)))