package Program_9 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[T_A[T_A[C, C], C], C]
case class CC_B[D](a: D, b: T_A[D, D]) extends T_A[T_A[T_A[D, D], D], D]
case class CC_C[E](a: E, b: T_A[E, CC_B[E]], c: T_A[E, CC_B[E]]) extends T_A[E, CC_B[E]]

val v_a: T_A[T_A[T_A[Int, Int], Int], Int] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(12, _) => 1 
  case CC_B(_, _) => 2 
}
}