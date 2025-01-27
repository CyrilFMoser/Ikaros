package Program_15 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: T_A[B], b: T_A[Boolean]) extends T_A[B]
case class CC_B[C]() extends T_A[C]

val v_a: CC_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_B()) => 0 
}
}
// This is not matched: (CC_F Int Wildcard (CC_E Int (T_B Int)) (T_B Int))