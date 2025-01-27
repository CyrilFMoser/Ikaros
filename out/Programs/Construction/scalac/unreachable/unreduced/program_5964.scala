package Program_12 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: C, b: T_A[C, T_A[C, C]], c: T_A[C, C]) extends T_A[C, T_A[C, C]]
case class CC_B[D, E]() extends T_A[D, T_A[D, D]]
case class CC_C(a: T_A[T_A[T_B, T_B], T_A[T_A[T_B, T_B], T_A[T_B, T_B]]]) extends T_B

val v_a: T_A[Boolean, T_A[Boolean, Boolean]] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, _, _), _) => 0 
  case CC_A(_, CC_B(), _) => 1 
  case CC_B() => 2 
}
}