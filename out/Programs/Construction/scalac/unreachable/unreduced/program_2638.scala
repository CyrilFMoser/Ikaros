package Program_22 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_A[C, C], b: Byte) extends T_A[T_B, C]
case class CC_B[D](a: CC_A[CC_A[D]]) extends T_A[T_B, D]
case class CC_C(a: CC_A[Char], b: T_A[T_B, T_A[T_B, Byte]]) extends T_A[T_B, T_A[T_B, T_B]]
case class CC_D(a: T_A[T_B, T_A[T_B, T_B]]) extends T_B
case class CC_E(a: T_B) extends T_B
case class CC_F() extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_D(CC_A(_, _)) => 0 
  case CC_D(CC_B(CC_A(_, _))) => 1 
  case CC_D(CC_C(CC_A(_, _), CC_A(_, _))) => 2 
  case CC_D(CC_C(CC_A(_, _), CC_B(_))) => 3 
  case CC_E(CC_D(CC_A(_, _))) => 4 
  case CC_E(CC_D(CC_B(_))) => 5 
  case CC_E(CC_D(CC_C(_, _))) => 6 
  case CC_E(CC_E(CC_D(_))) => 7 
  case CC_E(CC_E(CC_E(_))) => 8 
  case CC_E(CC_E(CC_F())) => 9 
  case CC_E(CC_F()) => 10 
  case CC_F() => 11 
}
}