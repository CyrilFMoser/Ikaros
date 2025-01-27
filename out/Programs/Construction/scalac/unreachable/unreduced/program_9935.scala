package Program_12 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_B[T_A]) extends T_A
case class CC_B(a: T_A, b: T_A) extends T_A
case class CC_C() extends T_A
case class CC_D(a: CC_B, b: Int, c: CC_A) extends T_B[CC_B]
case class CC_E(a: CC_B, b: CC_A) extends T_B[CC_B]
case class CC_F(a: Byte) extends T_B[CC_B]

val v_a: T_B[CC_B] = null
val v_b: Int = v_a match{
  case CC_D(CC_B(_, CC_A(_)), _, _) => 0 
  case CC_D(CC_B(_, CC_B(_, _)), _, _) => 1 
  case CC_D(CC_B(_, CC_C()), _, _) => 2 
  case CC_E(_, _) => 3 
  case CC_F(_) => 4 
}
}