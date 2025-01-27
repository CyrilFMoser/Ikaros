package Program_14 

object Test {
sealed trait T_A[A]
case class CC_A(a: Int, b: T_A[Boolean]) extends T_A[T_A[Boolean]]

val v_a: T_A[T_A[Boolean]] = null
val v_b: Int = v_a match{
  case CC_A(12, _) => 0 
}
}
// This is not matched: (CC_A Wildcard Int (CC_C Boolean (T_A Boolean)) (T_A (T_B Boolean Byte)))