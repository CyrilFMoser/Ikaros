package Program_0 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[T_A[C, C], C]) extends T_A[T_A[C, C], C]
case class CC_B[D](a: T_A[T_A[D, D], D], b: Boolean, c: Char) extends T_A[T_A[T_A[D, D], D], D]
case class CC_C[E](a: CC_B[E], b: T_A[E, T_A[E, E]]) extends T_A[T_A[E, E], E]

val v_a: T_A[T_A[Int, Int], Int] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_)) => 0 
  case CC_A(CC_C(CC_B(_, _, _), _)) => 1 
  case CC_C(_, _) => 2 
}
}