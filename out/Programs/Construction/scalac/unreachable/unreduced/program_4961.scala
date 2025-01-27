package Program_14 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[T_A[C, C], C]
case class CC_B[D](a: CC_A[D], b: D, c: Boolean) extends T_A[T_A[D, D], D]
case class CC_C[E](a: T_A[E, E], b: T_A[T_A[E, E], E]) extends T_A[T_A[E, E], E]

val v_a: T_A[T_A[Int, Int], Int] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_C(_, _) => 1 
}
}
// This is not matched: CC_B(_, _, _)