package Program_15 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: T_A[B]) extends T_A[B]
case class CC_B[D]() extends T_A[D]

val v_a: CC_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A(CC_B()) => 0 
}
}
// This is not matched: (CC_B Int Wildcard Wildcard Wildcard (T_A Int))