package Program_23 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C, b: T_A[C, C], c: Boolean) extends T_A[C, T_A[T_A[Int, Char], Char]]
case class CC_B[D](a: CC_A[D], b: Boolean, c: Int) extends T_A[D, T_A[T_A[Int, Char], Char]]
case class CC_C[E](a: CC_A[E], b: E, c: CC_B[E]) extends T_A[CC_A[Boolean], E]

val v_a: T_A[Int, T_A[T_A[Int, Char], Char]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_, true, _) => 1 
  case CC_B(_, false, _) => 2 
}
}