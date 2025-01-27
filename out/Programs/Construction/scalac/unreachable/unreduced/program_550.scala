package Program_10 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C]() extends T_A[C, T_A[T_B, T_B]]
case class CC_B[D](a: T_A[D, T_A[T_B, T_B]]) extends T_A[D, T_A[T_B, T_B]]
case class CC_C[E](a: T_A[E, E]) extends T_A[E, T_A[T_B, T_B]]

val v_a: T_A[Char, T_A[T_B, T_B]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(CC_B(_)) => 1 
  case CC_B(CC_C(_)) => 2 
  case CC_C(_) => 3 
}
}
// This is not matched: CC_B(CC_A())