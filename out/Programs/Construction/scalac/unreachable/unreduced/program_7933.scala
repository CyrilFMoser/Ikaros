package Program_15 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C, b: T_A[C, C]) extends T_A[T_A[T_A[Int, Int], T_A[Int, Char]], C]
case class CC_B[D](a: Int) extends T_A[T_A[T_A[Int, Int], T_A[Int, Char]], D]
case class CC_C[E](a: E, b: CC_B[E]) extends T_A[T_A[T_A[Int, Int], T_A[Int, Char]], E]

val v_a: T_A[T_A[T_A[Int, Int], T_A[Int, Char]], Int] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_) => 1 
}
}
// This is not matched: CC_C(_, _)