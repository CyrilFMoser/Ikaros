package Program_14 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C, b: T_A[C, T_A[C, C]], c: T_A[C, C]) extends T_A[T_A[C, T_A[C, C]], C]
case class CC_B[D]() extends T_A[T_A[D, T_A[D, D]], D]
case class CC_C[E]() extends T_A[T_A[E, T_A[E, E]], E]

val v_a: T_A[T_A[Char, T_A[Char, Char]], Char] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B() => 1 
  case CC_C() => 2 
}
}