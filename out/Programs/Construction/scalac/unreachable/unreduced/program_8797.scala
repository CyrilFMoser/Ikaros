package Program_8 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[T_A[Char, C], C]) extends T_A[Char, C]
case class CC_B[D](a: Char) extends T_A[Char, D]
case class CC_C[E](a: E, b: T_A[Char, E], c: T_A[Char, E]) extends T_A[Char, E]

val v_a: T_A[Char, Char] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B('x') => 1 
  case CC_B(_) => 2 
}
}
// This is not matched: CC_C(_, _, _)