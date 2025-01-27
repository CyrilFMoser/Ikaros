package Program_13 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C, b: C, c: T_A[T_A[T_A[T_A[Int, Char], T_A[Int, Char]], T_A[T_A[Int, Char], T_A[Int, Char]]], T_A[T_A[Int, Char], T_A[Int, Char]]]) extends T_A[T_A[C, C], C]
case class CC_B[E](a: E, b: E) extends T_A[T_A[E, E], E]

val v_a: T_A[T_A[Int, Int], Int] = null
val v_b: Int = v_a match{
  case CC_A(_, _, CC_A(_, _, _)) => 0 
  case CC_A(_, _, CC_B(_, _)) => 1 
  case CC_B(_, _) => 2 
}
}