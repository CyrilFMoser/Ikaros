package Program_15 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D]() extends T_A[C, D]
case class CC_B[E, F](a: T_A[Int, Int]) extends T_A[E, F]

val v_a: CC_B[Int, Boolean] = null
val v_b: Int = v_a match{
  case CC_B(CC_A()) => 0 
}
}
// This is not matched: (CC_A Wildcard T_A)