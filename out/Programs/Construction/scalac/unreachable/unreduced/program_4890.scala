package Program_11 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: E, b: T_A[E, E], c: T_A[E, T_B[E, E]]) extends T_A[T_B[T_B[Int, Boolean], T_B[Boolean, (Boolean,Char)]], E]
case class CC_B[F]() extends T_A[T_B[T_B[Int, Boolean], T_B[Boolean, (Boolean,Char)]], F]

val v_a: T_A[T_B[T_B[Int, Boolean], T_B[Boolean, (Boolean,Char)]], Char] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B() => 1 
}
}