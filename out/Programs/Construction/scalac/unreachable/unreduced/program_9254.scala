package Program_4 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_A, b: T_B[Boolean, T_B[T_A, T_A]]) extends T_A
case class CC_B(a: T_B[Byte, CC_A], b: Int, c: T_B[(CC_A,T_A), CC_A]) extends T_A
case class CC_C(a: Char, b: Char) extends T_A
case class CC_D(a: CC_A, b: CC_C, c: CC_B) extends T_B[T_A, CC_A]
case class CC_E(a: T_B[T_A, CC_A]) extends T_B[T_A, CC_A]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_C(_, _) => 1 
}
}
// This is not matched: CC_B(_, _, _)