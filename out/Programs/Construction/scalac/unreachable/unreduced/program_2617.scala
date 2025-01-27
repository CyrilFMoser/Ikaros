package Program_31 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_A[C, C], b: T_A[C, C]) extends T_A[C, T_A[(T_B,T_B), T_A[T_B, (Int,Char)]]]
case class CC_B[D]() extends T_A[D, T_A[(T_B,T_B), T_A[T_B, (Int,Char)]]]
case class CC_C[E](a: CC_B[Int], b: E, c: T_A[E, E]) extends T_A[E, T_A[(T_B,T_B), T_A[T_B, (Int,Char)]]]

val v_a: T_A[Int, T_A[(T_B,T_B), T_A[T_B, (Int,Char)]]] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C(CC_B(), _, _) => 1 
}
}
// This is not matched: CC_A(_, _)