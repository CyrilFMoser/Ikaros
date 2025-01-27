package Program_18 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_A[(T_B,T_B)], b: Boolean) extends T_A[(T_B,T_B)]
case class CC_B(a: T_A[T_B], b: T_B, c: (T_A[Int],T_A[T_B])) extends T_A[T_A[(T_B,T_B)]]
case class CC_C(a: T_A[(T_B,T_B)]) extends T_A[(T_B,T_B)]
case class CC_D(a: Byte, b: T_A[CC_A]) extends T_B
case class CC_E[B](a: T_B) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_D(_, _) => 0 
  case CC_E(CC_E(_)) => 1 
}
}
// This is not matched: CC_E(CC_D(_, _))