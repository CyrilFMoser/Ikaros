package Program_15 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_A[(T_B,T_B)], b: Int) extends T_A[T_A[T_A[T_B]]]
case class CC_B() extends T_A[T_A[T_A[T_B]]]
case class CC_C(a: (T_A[CC_A],CC_A), b: CC_A) extends T_A[T_A[T_A[T_B]]]
case class CC_D(a: CC_A) extends T_B
case class CC_E(a: (CC_B,CC_B), b: CC_B, c: CC_A) extends T_B
case class CC_F(a: CC_B, b: T_B) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_D(CC_A(_, _)) => 0 
  case CC_E(_, _, _) => 1 
  case CC_F(CC_B(), CC_D(_)) => 2 
  case CC_F(CC_B(), CC_E(_, _, _)) => 3 
  case CC_F(CC_B(), CC_F(CC_B(), CC_D(_))) => 4 
  case CC_F(CC_B(), CC_F(CC_B(), CC_E(_, _, _))) => 5 
  case CC_F(CC_B(), CC_F(CC_B(), CC_F(_, _))) => 6 
}
}