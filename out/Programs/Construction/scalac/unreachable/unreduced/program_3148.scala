package Program_23 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A(a: T_B, b: T_B) extends T_A[T_B, T_A[Byte, (T_B,T_B)]]
case class CC_B(a: T_B, b: Byte, c: T_A[T_A[T_B, T_B], T_A[CC_A, CC_A]]) extends T_A[T_B, T_A[Byte, (T_B,T_B)]]
case class CC_C(a: Byte) extends T_A[T_B, T_A[Byte, (T_B,T_B)]]
case class CC_D(a: CC_A, b: CC_C) extends T_B
case class CC_E[C]() extends T_B
case class CC_F(a: CC_C, b: CC_C, c: T_A[CC_B, (CC_B,CC_A)]) extends T_B

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A(_, CC_D(CC_A(_, _), CC_C(_))) => 0 
  case CC_A(_, CC_E()) => 1 
  case CC_A(_, CC_F(CC_C(_), _, _)) => 2 
}
}