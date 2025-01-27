package Program_29 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_A[C, C], b: C, c: T_A[C, C]) extends T_A[C, T_A[T_A[(Char,Boolean), T_B], T_B]]
case class CC_B[D]() extends T_A[D, T_A[T_A[(Char,Boolean), T_B], T_B]]
case class CC_C(a: CC_B[(T_B,T_B)]) extends T_B

val v_a: T_A[Int, T_A[T_A[(Char,Boolean), T_B], T_B]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B() => 1 
}
}