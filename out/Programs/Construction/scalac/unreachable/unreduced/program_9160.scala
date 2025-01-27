package Program_7 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_A, b: T_B[T_B[T_A]]) extends T_A
case class CC_B(a: Boolean, b: Boolean) extends T_A
case class CC_C(a: T_A, b: Byte) extends T_A
case class CC_D(a: CC_C) extends T_B[CC_A]
case class CC_E(a: CC_A, b: CC_D) extends T_B[CC_A]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_C(_, _) => 1 
}
}
// This is not matched: CC_B(_, _)