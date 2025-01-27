package Program_15 

object Test {
sealed trait T_A[A, B]
case class CC_A() extends T_A[T_A[T_A[Boolean, Int], Int], Boolean]
case class CC_B(a: T_A[T_A[CC_A, CC_A], (CC_A,CC_A)]) extends T_A[T_A[T_A[Boolean, Int], Int], Boolean]
case class CC_C() extends T_A[T_A[T_A[Boolean, Int], Int], Boolean]

val v_a: T_A[T_A[T_A[Boolean, Int], Int], Boolean] = null
val v_b: Int = v_a match{
  case CC_B(_) => 0 
  case CC_C() => 1 
}
}
// This is not matched: CC_A()