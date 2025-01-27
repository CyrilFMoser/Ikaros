package Program_22 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A() extends T_A[T_A[T_B, T_B], T_B]
case class CC_B(a: CC_A, b: CC_A) extends T_A[T_A[T_B, T_B], T_B]
case class CC_C(a: T_B, b: T_B) extends T_A[T_A[T_B, T_B], T_B]
case class CC_D(a: T_A[CC_B, CC_A]) extends T_B
case class CC_E(a: CC_D, b: CC_C) extends T_B
case class CC_F(a: T_A[T_A[T_B, T_B], T_B]) extends T_B

val v_a: CC_C = null
val v_b: Int = v_a match{
  case CC_C(_, CC_D(_)) => 0 
  case CC_C(_, CC_E(_, _)) => 1 
  case CC_C(_, CC_F(CC_A())) => 2 
  case CC_C(_, CC_F(CC_B(_, _))) => 3 
  case CC_C(_, CC_F(CC_C(_, _))) => 4 
}
}