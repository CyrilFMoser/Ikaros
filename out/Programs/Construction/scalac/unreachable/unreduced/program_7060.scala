package Program_20 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C, b: C, c: T_A[C, C]) extends T_A[C, Char]
case class CC_B[D](a: T_A[D, Char], b: T_A[D, Char]) extends T_A[D, Char]
case class CC_C[E]() extends T_A[T_A[E, Char], E]

val v_a: T_A[Int, Char] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_, _) => 1 
}
}