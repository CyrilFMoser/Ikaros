package Program_15 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C, D]() extends T_A[D, C]
case class CC_B[F, E]() extends T_A[E, F]
case class CC_C(a: T_A[T_B, T_B]) extends T_B

val v_a: CC_C = null
val v_b: Int = v_a match{
  case CC_C(CC_B()) => 0 
}
}
// This is not matched: (CC_A Wildcard Wildcard Wildcard (T_A T_B))