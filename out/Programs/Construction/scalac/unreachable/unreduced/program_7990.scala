package Program_22 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_A[E, E], b: T_B[E, E], c: T_B[E, E]) extends T_A[T_A[T_B[Boolean, Boolean], T_B[Int, Char]], E]
case class CC_B(a: T_B[T_B[Int, Byte], T_B[Int, Char]]) extends T_A[T_A[T_B[Boolean, Boolean], T_B[Int, Char]], CC_A[Boolean]]

val v_a: T_A[T_A[T_B[Boolean, Boolean], T_B[Int, Char]], CC_A[Boolean]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_) => 1 
}
}