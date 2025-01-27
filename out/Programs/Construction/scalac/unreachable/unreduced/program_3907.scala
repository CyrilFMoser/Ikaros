package Program_29 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A() extends T_A[T_B, T_B]
case class CC_B(a: T_A[CC_A, CC_A]) extends T_A[T_B, T_B]
case class CC_C(a: CC_A, b: T_A[Boolean, (T_B,T_B)]) extends T_A[T_B, T_B]

val v_a: T_A[T_B, T_B] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_C(CC_A(), _) => 1 
}
}
// This is not matched: CC_B(_)