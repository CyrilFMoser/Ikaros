package Program_27 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_A[Byte], b: (T_B,T_A[T_B]), c: Int) extends T_A[T_B]
case class CC_B(a: Boolean) extends T_A[T_B]
case class CC_C(a: (T_A[T_B],(T_B,Byte)), b: T_B, c: T_A[CC_A]) extends T_A[T_B]
case class CC_D() extends T_B
case class CC_E() extends T_B
case class CC_F(a: T_A[(CC_E,CC_D)], b: T_A[T_B]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_D() => 0 
  case CC_E() => 1 
  case CC_F(_, _) => 2 
}
}