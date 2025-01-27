package Program_20 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[T_A, T_A], b: T_B[Byte, T_A]) extends T_A
case class CC_B(a: CC_A, b: T_A, c: CC_A) extends T_A
case class CC_C(a: CC_A) extends T_A
case class CC_D() extends T_B[(Boolean,CC_A), T_A]
case class CC_E() extends T_B[(Boolean,CC_A), T_A]
case class CC_F(a: Int) extends T_B[(Boolean,CC_A), T_A]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, _, _) => 1 
  case CC_C(CC_A(_, _)) => 2 
}
}