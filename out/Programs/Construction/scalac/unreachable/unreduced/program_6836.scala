package Program_5 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_B[Boolean], b: T_B[T_B[T_A]]) extends T_A
case class CC_B() extends T_A
case class CC_C() extends T_A
case class CC_D(a: CC_C, b: (CC_C,CC_B)) extends T_B[CC_A]
case class CC_E(a: T_B[CC_C], b: CC_D) extends T_B[CC_A]
case class CC_F(a: CC_E, b: Byte) extends T_B[CC_A]

val v_a: T_B[CC_A] = null
val v_b: Int = v_a match{
  case CC_E(_, CC_D(CC_C(), _)) => 0 
  case CC_F(_, _) => 1 
}
}
// This is not matched: CC_D(CC_C(), (CC_C(),CC_B()))