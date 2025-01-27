package Program_25 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D]() extends T_A[T_A[C, C], C]
case class CC_B[E](a: T_A[E, E], b: T_A[E, E], c: T_A[E, E]) extends T_A[T_A[E, E], E]

val v_a: T_A[T_A[Int, Int], Int] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _, _) => 1 
}
}