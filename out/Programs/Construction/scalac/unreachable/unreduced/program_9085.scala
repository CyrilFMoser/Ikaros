package Program_22 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[Char, C], b: T_A[Char, C], c: T_A[T_A[Char, C], C]) extends T_A[Char, C]
case class CC_B[D](a: T_A[Char, T_A[Char, D]], b: CC_A[D]) extends T_A[Char, D]
case class CC_C[E](a: CC_B[E], b: E, c: T_A[Char, E]) extends T_A[Char, E]

val v_a: T_A[Char, Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(CC_B(CC_A(_, _, _), CC_A(_, _, _)), _) => 1 
  case CC_B(CC_B(CC_B(_, _), CC_A(_, _, _)), _) => 2 
  case CC_B(CC_B(CC_C(_, _, _), CC_A(_, _, _)), _) => 3 
  case CC_B(CC_C(CC_B(_, _), _, _), _) => 4 
  case CC_C(_, _, _) => 5 
}
}
// This is not matched: CC_B(CC_A(_, _, _), _)