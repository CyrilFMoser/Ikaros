package Program_31 

object Test {
sealed trait T_A[A]
case class CC_B() extends T_A[T_A[Boolean]]
case class CC_C(a: Int, b: T_A[CC_B]) extends T_A[T_A[Boolean]]

val v_a: T_A[T_A[Boolean]] = null
val v_b: Int = v_a match{
  case CC_C(12, _) => 0 
  case CC_B() => 1 
}
}
// This is not matched: (CC_B Wildcard (T_A (T_A Boolean)))