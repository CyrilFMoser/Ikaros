package Program_21 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[T_A[Char, Boolean], T_A[T_A[Char, Boolean], T_A[Char, Boolean]]]) extends T_A[C, T_A[C, C]]
case class CC_B[E](a: Byte, b: E, c: T_A[E, T_A[E, E]]) extends T_A[E, T_A[E, E]]

val v_a: T_A[Int, T_A[Int, Int]] = null
val v_b: Int = v_a match{
  case CC_B(_, _, CC_A(CC_A(_))) => 0 
  case CC_B(_, _, CC_A(CC_B(_, _, _))) => 1 
  case CC_B(_, _, CC_B(_, _, CC_A(_))) => 2 
  case CC_B(_, _, CC_B(_, _, CC_B(_, _, _))) => 3 
}
}
// This is not matched: CC_A(_)