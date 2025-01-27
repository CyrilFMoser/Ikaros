package Program_0 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: C) extends T_A[C, T_B]
case class CC_B(a: T_A[T_A[T_B, T_B], (T_B,T_B)], b: Byte, c: T_A[Int, T_B]) extends T_A[T_B, T_B]
case class CC_C(a: Boolean) extends T_A[(CC_B,T_A[T_B, T_B]), CC_A[(CC_B,T_B)]]
case class CC_D(a: CC_B) extends T_B
case class CC_E(a: T_B) extends T_B
case class CC_F() extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_D(_) => 0 
  case CC_E(CC_D(CC_B(_, _, _))) => 1 
  case CC_E(CC_E(CC_D(_))) => 2 
  case CC_E(CC_E(CC_F())) => 3 
  case CC_E(CC_F()) => 4 
  case CC_F() => 5 
}
}
// This is not matched: CC_E(CC_E(CC_E(_)))