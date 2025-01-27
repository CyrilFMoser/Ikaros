package Program_11 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: Byte) extends T_A
case class CC_B(a: T_B[T_B[T_A]]) extends T_A
case class CC_C() extends T_A
case class CC_D(a: T_B[T_B[CC_B]], b: Char, c: CC_B) extends T_B[T_B[CC_B]]
case class CC_E(a: T_A, b: T_A) extends T_B[T_B[CC_B]]
case class CC_F(a: T_B[T_B[CC_B]]) extends T_B[T_B[CC_B]]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_) => 1 
}
}
// This is not matched: CC_C()