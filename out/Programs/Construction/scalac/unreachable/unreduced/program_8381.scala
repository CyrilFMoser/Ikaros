package Program_29 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_A[C, T_B], b: Int) extends T_A[C, T_A[T_A[T_B, T_B], Char]]
case class CC_B[D](a: D, b: T_A[D, CC_A[D]]) extends T_A[D, T_A[T_A[T_B, T_B], Char]]
case class CC_C[E, F](a: E) extends T_A[E, T_A[T_A[T_B, T_B], Char]]

val v_a: T_A[Int, T_A[T_A[T_B, T_B], Char]] = null
val v_b: Int = v_a match{
  case CC_A(_, 12) => 0 
  case CC_A(_, _) => 1 
  case CC_B(_, _) => 2 
  case CC_C(_) => 3 
}
}