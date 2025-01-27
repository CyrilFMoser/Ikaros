package Program_13 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[T_A[C, Byte], C]) extends T_A[C, T_A[C, C]]
case class CC_B[D]() extends T_A[D, T_A[D, D]]
case class CC_C[E](a: T_A[E, T_A[E, E]], b: T_A[E, T_A[E, E]]) extends T_A[E, T_A[E, E]]

val v_a: CC_C[Boolean] = null
val v_b: Int = v_a match{
  case CC_C(CC_A(_), _) => 0 
  case CC_C(CC_B(), _) => 1 
  case CC_C(CC_C(_, _), _) => 2 
}
}