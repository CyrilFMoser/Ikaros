package Program_11 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: C, b: T_A[C, C], c: T_A[T_A[T_A[T_B, T_B], T_A[T_B, T_B]], T_A[T_A[T_A[T_B, T_B], T_A[T_B, T_B]], T_A[T_A[T_B, T_B], T_A[T_B, T_B]]]]) extends T_A[C, T_A[C, C]]
case class CC_B[E]() extends T_A[E, T_A[E, E]]
case class CC_C(a: Int) extends T_B

val v_a: T_A[Char, T_A[Char, Char]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, CC_A(_, _, CC_A(_, _, _))) => 0 
  case CC_A(_, _, CC_A(_, _, CC_B())) => 1 
  case CC_A(_, _, CC_B()) => 2 
  case CC_B() => 3 
}
}