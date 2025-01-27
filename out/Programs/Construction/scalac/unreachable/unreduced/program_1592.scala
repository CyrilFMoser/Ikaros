package Program_2 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C) extends T_A[T_A[T_A[Boolean, Boolean], T_A[Int, Char]], C]
case class CC_B[D](a: T_A[D, D], b: CC_A[D]) extends T_A[T_A[T_A[Boolean, Boolean], T_A[Int, Char]], D]
case class CC_C[E](a: CC_A[E], b: E, c: E) extends T_A[T_A[T_A[Boolean, Boolean], T_A[Int, Char]], E]

val v_a: T_A[T_A[T_A[Boolean, Boolean], T_A[Int, Char]], Int] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, CC_A(_)) => 1 
  case CC_C(_, _, _) => 2 
}
}