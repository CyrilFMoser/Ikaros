package Program_24 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A(a: (T_B,T_A[T_B, T_B])) extends T_A[T_B, T_B]
case class CC_B(a: T_A[CC_A, Int], b: CC_A) extends T_A[T_B, T_B]
case class CC_C(a: T_A[CC_A, T_B]) extends T_A[T_B, T_B]

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A((_,CC_A(_))) => 0 
  case CC_A((_,CC_C(_))) => 1 
}
}
// This is not matched: CC_A((_,CC_B(_, _)))