package Program_30 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[C, T_A[C, C]]
case class CC_B[D](a: D, b: T_A[T_A[D, D], T_A[T_A[D, D], T_A[D, D]]], c: CC_A[D]) extends T_A[D, T_A[D, D]]
case class CC_C[E](a: E, b: T_A[E, T_A[E, E]]) extends T_A[T_A[(Int,Boolean), CC_A[Boolean]], E]

val v_a: T_A[Int, T_A[Int, Int]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, CC_A(), CC_A()) => 1 
  case CC_B(_, CC_B(_, _, _), CC_A()) => 2 
}
}