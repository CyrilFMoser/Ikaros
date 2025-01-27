package Program_30 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: Byte, b: T_B[Byte, T_A], c: T_B[T_A, T_B[T_A, T_A]]) extends T_A
case class CC_B(a: Boolean) extends T_A
case class CC_C(a: T_B[Boolean, T_A], b: Char, c: CC_A) extends T_A
case class CC_D() extends T_B[Int, CC_A]
case class CC_E(a: (CC_D,T_A)) extends T_B[Int, CC_A]
case class CC_F(a: Char, b: CC_D) extends T_B[Int, CC_A]

val v_a: T_B[Int, CC_A] = null
val v_b: Int = v_a match{
  case CC_D() => 0 
  case CC_E((CC_D(),CC_B(_))) => 1 
  case CC_E((CC_D(),CC_C(_, _, _))) => 2 
  case CC_F(_, _) => 3 
}
}
// This is not matched: CC_E((CC_D(),CC_A(_, _, _)))