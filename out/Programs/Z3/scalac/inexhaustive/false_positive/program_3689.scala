package Program_15 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D]() extends T_A[C, D]
case class CC_C[F, E](a: T_A[E, F]) extends T_A[F, E]

val v_a: CC_C[Int, Char] = null
val v_b: Int = v_a match{
  case CC_C(CC_C(_)) => 0 
}
}
// This is not matched: (CC_D Wildcard Wildcard Wildcard (T_B (Tuple T_A (Tuple Int Int)) Byte))