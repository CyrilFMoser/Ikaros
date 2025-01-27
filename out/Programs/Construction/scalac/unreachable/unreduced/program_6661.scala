package Program_21 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C, b: C, c: T_A[C, C]) extends T_A[T_A[C, T_A[C, C]], C]
case class CC_B[D]() extends T_A[T_A[D, T_A[D, D]], D]
case class CC_C(a: Char, b: Boolean, c: CC_B[T_A[Char, Boolean]]) extends T_A[T_A[Char, T_A[Char, Char]], Char]

val v_a: T_A[T_A[Char, T_A[Char, Char]], Char] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B() => 1 
  case CC_C(_, _, _) => 2 
}
}