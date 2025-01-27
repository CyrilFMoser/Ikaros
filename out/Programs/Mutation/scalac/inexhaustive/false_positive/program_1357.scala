package Program_21 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: (T_B,T_B), b: C) extends T_A[C, (T_B,T_B)]
case class CC_B(a: CC_A[T_B], b: T_A[T_B, T_B]) extends T_B
case class CC_C(a: T_A[Char, Boolean]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_, _), _) => 0 
}
}
// This is not matched: (CC_A Wildcard Wildcard Wildcard T_A)