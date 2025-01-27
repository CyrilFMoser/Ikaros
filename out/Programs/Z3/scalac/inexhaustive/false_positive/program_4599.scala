package Program_12 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A() extends T_A[T_B]
case class CC_B() extends T_A[T_B]
case class CC_C(a: T_A[T_B], b: T_A[CC_B]) extends T_A[T_A[CC_A]]

val v_a: T_A[T_A[CC_A]] = null
val v_b: Int = v_a match{
  case CC_C(CC_B(), _) => 0 
}
}
// This is not matched: (CC_C (CC_B Wildcard Wildcard (T_A T_B))
//      Wildcard
//      (T_A (T_A (CC_A (T_A (T_A T_B)) (T_A T_B)))))