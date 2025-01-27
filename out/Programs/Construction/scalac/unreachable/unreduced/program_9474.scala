package Program_2 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[T_A[C, Int], C]) extends T_A[C, T_A[T_A[Boolean, Char], T_A[Char, Boolean]]]
case class CC_B[D]() extends T_A[D, T_A[T_A[Boolean, Char], T_A[Char, Boolean]]]
case class CC_C[E](a: Int, b: E, c: T_A[E, T_A[E, E]]) extends T_A[E, T_A[T_A[Boolean, Char], T_A[Char, Boolean]]]

val v_a: T_A[Int, T_A[T_A[Boolean, Char], T_A[Char, Boolean]]] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C(_, _, _) => 1 
}
}
// This is not matched: CC_A(_)