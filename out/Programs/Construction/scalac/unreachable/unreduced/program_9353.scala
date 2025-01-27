package Program_24 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C) extends T_A[C, T_A[T_A[C, C], C]]
case class CC_B[D](a: Char, b: T_A[D, D], c: CC_A[D]) extends T_A[D, T_A[T_A[D, D], D]]
case class CC_C[E](a: E) extends T_A[E, T_A[T_A[E, E], E]]

val v_a: T_A[Int, T_A[T_A[Int, Int], Int]] = null
val v_b: Int = v_a match{
  case CC_A(12) => 0 
  case CC_A(_) => 1 
  case CC_B(_, _, _) => 2 
  case CC_C(_) => 3 
}
}