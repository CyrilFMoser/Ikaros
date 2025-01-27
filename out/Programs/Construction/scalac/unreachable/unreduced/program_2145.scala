package Program_8 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D](a: T_A[C, T_A[Int, D]], b: C, c: T_A[C, D]) extends T_A[Int, C]
case class CC_B(a: Boolean, b: T_A[Int, T_A[Int, Boolean]]) extends T_A[Int, T_A[Int, T_A[Char, Char]]]
case class CC_C[E](a: T_A[Int, CC_B], b: Int, c: T_A[Int, E]) extends T_A[Int, E]

val v_a: T_A[Int, T_A[Int, T_A[Int, T_A[Char, Char]]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_C(_, 12, _) => 1 
  case CC_C(_, _, _) => 2 
}
}