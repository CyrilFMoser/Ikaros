package Program_15 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[T_A[C, C], C], b: T_A[C, C]) extends T_A[T_A[Int, T_A[Int, Char]], C]
case class CC_B[D](a: D, b: T_A[D, T_A[Char, D]], c: (T_A[Int, Byte],CC_A[Char])) extends T_A[T_A[Int, T_A[Int, Char]], D]
case class CC_C[E](a: Int, b: CC_A[E]) extends T_A[T_A[Int, T_A[Int, Char]], E]

val v_a: T_A[T_A[Int, T_A[Int, Char]], Char] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, _, _) => 1 
  case CC_C(_, _) => 2 
}
}