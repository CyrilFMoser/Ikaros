package Program_9 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_B, b: T_A[C, C], c: (T_B,T_A[T_B, T_B])) extends T_A[C, T_A[T_B, T_A[Byte, Boolean]]]
case class CC_B(a: CC_A[CC_A[T_B]]) extends T_B
case class CC_C(a: CC_B, b: CC_A[CC_B]) extends T_B
case class CC_D() extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C(CC_B(CC_A(_, _, _)), _) => 0 
  case CC_D() => 1 
}
}
// This is not matched: CC_B(_)