package Program_15 

object Test {
sealed trait T_A[A]
case class CC_A[D](a: T_A[D], b: T_A[D]) extends T_A[D]
case class CC_B[E]() extends T_A[E]

val v_a: CC_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_B()) => 0 
}
}
// This is not matched: (CC_F (CC_B T_A)
//      Wildcard
//      (CC_D Int Wildcard (T_B Int))
//      (T_B (CC_D (CC_B T_A) T_A T_A)))