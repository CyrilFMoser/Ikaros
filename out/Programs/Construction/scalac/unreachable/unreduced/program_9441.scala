package Program_26 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_A) extends T_A
case class CC_B() extends T_A
case class CC_C(a: T_A, b: T_B[T_A, CC_A]) extends T_A
case class CC_D(a: T_B[CC_A, CC_C], b: CC_B) extends T_B[CC_A, CC_C]
case class CC_E[C]() extends T_B[CC_A, CC_C]
case class CC_F(a: T_B[CC_E[(Boolean,Char)], Boolean], b: CC_D, c: CC_C) extends T_B[CC_A, CC_C]

val v_a: T_B[CC_A, CC_C] = null
val v_b: Int = v_a match{
  case CC_D(_, CC_B()) => 0 
  case CC_E() => 1 
  case CC_F(_, _, _) => 2 
}
}