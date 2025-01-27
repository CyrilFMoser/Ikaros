package Program_8 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_A[T_A[Boolean]]) extends T_A[T_B]
case class CC_B(a: T_A[T_B]) extends T_A[T_B]
case class CC_C(a: T_A[T_B]) extends T_A[T_B]
case class CC_D() extends T_B
case class CC_E() extends T_B
case class CC_F(a: CC_A, b: T_A[CC_B], c: T_A[Byte]) extends T_B

val v_a: T_A[T_B] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(CC_A(_)) => 1 
  case CC_B(CC_B(CC_A(_))) => 2 
  case CC_B(CC_B(CC_B(_))) => 3 
  case CC_B(CC_B(CC_C(_))) => 4 
  case CC_B(CC_C(CC_A(_))) => 5 
  case CC_B(CC_C(CC_B(_))) => 6 
  case CC_B(CC_C(CC_C(_))) => 7 
  case CC_C(CC_A(_)) => 8 
  case CC_C(CC_B(CC_A(_))) => 9 
  case CC_C(CC_B(CC_B(_))) => 10 
  case CC_C(CC_C(CC_A(_))) => 11 
  case CC_C(CC_C(CC_B(_))) => 12 
  case CC_C(CC_C(CC_C(_))) => 13 
}
}
// This is not matched: CC_C(CC_B(CC_C(_)))