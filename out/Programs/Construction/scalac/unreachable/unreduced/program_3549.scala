package Program_2 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_B, b: C) extends T_A[T_B, C]
case class CC_B(a: CC_A[T_B]) extends T_B
case class CC_C(a: CC_B, b: T_A[T_A[T_B, T_B], Byte]) extends T_B
case class CC_D(a: Char) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B(CC_A(CC_B(_), CC_B(_))) => 0 
  case CC_B(CC_A(CC_C(_, _), CC_B(_))) => 1 
  case CC_B(CC_A(CC_D(_), CC_B(_))) => 2 
  case CC_B(CC_A(CC_B(_), CC_C(_, _))) => 3 
  case CC_B(CC_A(CC_C(_, _), CC_C(_, _))) => 4 
  case CC_B(CC_A(CC_D(_), CC_C(_, _))) => 5 
  case CC_B(CC_A(CC_B(_), CC_D(_))) => 6 
  case CC_B(CC_A(CC_C(_, _), CC_D(_))) => 7 
  case CC_B(CC_A(CC_D(_), CC_D(_))) => 8 
  case CC_C(_, _) => 9 
  case CC_D('x') => 10 
  case CC_D(_) => 11 
}
}