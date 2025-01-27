package Program_4 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: T_A[C, T_A[C, C]], c: T_A[C, C]) extends T_A[T_A[T_A[Char, Boolean], (Char,Int)], C]
case class CC_B[D](a: CC_A[D]) extends T_A[T_A[T_A[Char, Boolean], (Char,Int)], D]
case class CC_C[E](a: E, b: CC_B[E]) extends T_A[T_A[T_A[Char, Boolean], (Char,Int)], E]

val v_a: T_A[T_A[T_A[Char, Boolean], (Char,Int)], Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(CC_A(_, _, _)) => 1 
  case CC_C(_, _) => 2 
}
}