package Program_30 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_A, b: T_B[Byte, T_B[Boolean, (Byte,Int)]], c: T_B[(T_A,T_A), T_B[T_A, T_A]]) extends T_A
case class CC_B() extends T_A
case class CC_C(a: CC_A, b: CC_A, c: Boolean) extends T_A
case class CC_D(a: CC_C, b: T_B[T_A, CC_B]) extends T_B[CC_C, T_B[Int, Boolean]]
case class CC_E(a: (T_B[CC_B, T_A],(CC_B,CC_B))) extends T_B[CC_C, T_B[Int, Boolean]]
case class CC_F[C](a: CC_E) extends T_B[CC_C, T_B[Int, Boolean]]

val v_a: T_B[CC_C, T_B[Int, Boolean]] = null
val v_b: Int = v_a match{
  case CC_D(_, _) => 0 
  case CC_E(_) => 1 
}
}
// This is not matched: CC_F(CC_E((_,_)))