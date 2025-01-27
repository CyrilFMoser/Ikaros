package Program_6 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_B[T_B[Char]], b: T_B[T_B[T_A]]) extends T_A
case class CC_B(a: Char, b: T_B[T_B[T_A]]) extends T_A
case class CC_C(a: T_A) extends T_A
case class CC_D(a: T_B[Char]) extends T_B[CC_A]
case class CC_E(a: Byte, b: T_B[CC_D], c: Boolean) extends T_B[CC_A]
case class CC_F(a: CC_B) extends T_B[CC_A]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_B(_, _) => 0 
  case CC_C(_) => 1 
}
}
// This is not matched: CC_A(_, _)