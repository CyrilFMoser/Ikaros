package Program_5 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C, D](a: T_A[C, T_A[D, C]]) extends T_A[T_A[C, C], C]
case class CC_B(a: Byte) extends T_B
case class CC_C(a: (CC_B,T_A[CC_B, Boolean]), b: CC_A[CC_B, Int], c: Int) extends T_B
case class CC_D() extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B(_) => 0 
  case CC_C((CC_B(_),_), CC_A(_), _) => 1 
}
}
// This is not matched: CC_D()