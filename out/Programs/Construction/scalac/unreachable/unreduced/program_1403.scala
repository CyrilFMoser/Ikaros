package Program_22 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C]) extends T_A[T_A[C, C], C]
case class CC_B[D](a: D, b: D, c: D) extends T_A[T_A[D, D], D]
case class CC_C[E](a: CC_B[E], b: T_A[T_A[Boolean, Boolean], Boolean]) extends T_A[T_A[E, E], E]

val v_a: T_A[T_A[Int, Int], Int] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_C(CC_B(_, _, _), CC_A(_)) => 1 
  case CC_C(CC_B(_, _, _), CC_B(_, _, _)) => 2 
  case CC_C(CC_B(_, _, _), CC_C(_, _)) => 3 
}
}
// This is not matched: CC_B(_, _, _)