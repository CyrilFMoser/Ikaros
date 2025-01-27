package Program_24 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_A[D, D], b: Char, c: T_A[D, D]) extends T_A[T_B[Char], D]
case class CC_B[E](a: CC_A[E], b: T_A[T_B[Char], E], c: T_A[T_B[Char], E]) extends T_A[T_B[Char], E]

val v_a: CC_B[Byte] = null
val v_b: Int = v_a match{
  case CC_B(_, CC_A(_, 'x', _), _) => 0 
  case CC_B(_, CC_B(_, _, CC_A(_, _, _)), _) => 1 
  case CC_B(_, CC_B(_, _, CC_B(_, _, _)), _) => 2 
}
}
// This is not matched: CC_B(_, CC_A(_, _, _), _)