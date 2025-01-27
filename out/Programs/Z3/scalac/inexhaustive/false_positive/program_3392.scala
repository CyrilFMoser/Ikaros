package Program_15 

object Test {
sealed trait T_A[A]
case class CC_A[B]() extends T_A[B]
case class CC_B() extends T_A[T_A[Boolean]]
case class CC_C(a: T_A[CC_B]) extends T_A[CC_B]

val v_a: CC_C = null
val v_b: Int = v_a match{
  case CC_C(CC_C(_)) => 0 
}
}
// This is not matched: (CC_A Wildcard T_A)