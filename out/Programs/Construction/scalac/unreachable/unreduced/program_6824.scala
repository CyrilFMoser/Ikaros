package Program_0 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C, b: T_A[C, C], c: T_A[T_A[C, C], C]) extends T_A[T_A[C, C], C]
case class CC_B[D]() extends T_A[T_A[D, D], D]
case class CC_C[E](a: E, b: E) extends T_A[T_A[E, E], E]

val v_a: T_A[T_A[Int, Int], Int] = null
val v_b: Int = v_a match{
  case CC_A(12, _, CC_A(_, _, _)) => 0 
  case CC_A(_, _, CC_A(_, _, _)) => 1 
  case CC_A(12, _, CC_B()) => 2 
  case CC_A(_, _, CC_B()) => 3 
  case CC_A(12, _, CC_C(_, _)) => 4 
  case CC_A(_, _, CC_C(_, _)) => 5 
  case CC_B() => 6 
  case CC_C(_, _) => 7 
}
}