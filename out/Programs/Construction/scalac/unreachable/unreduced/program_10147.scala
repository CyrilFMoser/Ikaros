package Program_17 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: C) extends T_A[T_A[Boolean, C], C]
case class CC_B[D](a: Int, b: T_A[T_A[Boolean, D], D]) extends T_A[T_A[Boolean, D], D]
case class CC_C[E](a: T_A[T_A[Boolean, E], E]) extends T_A[T_A[Boolean, E], E]

val v_a: T_A[T_A[Boolean, Int], Int] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_C(_) => 1 
}
}
// This is not matched: CC_B(_, _)