package Program_15 

object Test {
sealed trait T_A[A, B]
case class CC_A[D, C](a: T_A[D, D]) extends T_A[C, D]
case class CC_B[E, F]() extends T_A[E, F]

val v_a: CC_A[Char, Boolean] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_)) => 0 
}
}
// This is not matched: (CC_A (T_A Int) Wildcard (T_A (T_A Int)))