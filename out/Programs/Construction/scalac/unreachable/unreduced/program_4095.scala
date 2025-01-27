package Program_28 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: C, b: T_A[C, T_B]) extends T_A[C, T_B]
case class CC_B(a: Byte) extends T_B
case class CC_C(a: (CC_B,T_B), b: T_A[CC_B, Boolean], c: CC_B) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B(0) => 0 
  case CC_C(_, _, _) => 1 
}
}
// This is not matched: CC_B(_)