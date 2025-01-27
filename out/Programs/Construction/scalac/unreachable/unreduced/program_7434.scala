package Program_13 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[T_A, T_B[Int, T_A]], b: Int) extends T_A
case class CC_B(a: Char, b: Int, c: Boolean) extends T_A
case class CC_C(a: Boolean, b: CC_A) extends T_A
case class CC_D(a: T_B[CC_A, CC_C], b: T_A, c: CC_A) extends T_B[CC_A, CC_A]
case class CC_E(a: T_B[(Boolean,CC_D), T_A], b: Char) extends T_B[CC_A, CC_A]
case class CC_F(a: CC_D, b: Boolean) extends T_B[CC_A, CC_A]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, _, _) => 1 
}
}
// This is not matched: CC_C(_, CC_A(_, _))