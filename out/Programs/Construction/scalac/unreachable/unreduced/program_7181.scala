package Program_22 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: C) extends T_A[C, (Byte,T_B)]
case class CC_B(a: T_A[(T_B,T_B), T_B], b: CC_A[T_A[T_B, T_B]]) extends T_B
case class CC_C(a: T_A[T_B, (Byte,T_B)], b: Boolean) extends T_B
case class CC_D() extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B(_, CC_A(_)) => 0 
  case CC_C(CC_A(_), _) => 1 
  case CC_D() => 2 
}
}