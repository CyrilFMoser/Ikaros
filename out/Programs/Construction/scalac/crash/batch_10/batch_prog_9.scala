package Program_9 

object Test {
sealed trait T_A
sealed trait T_B
case class CC_A() extends T_A
case class CC_B(a: T_B, b: Char, c: T_A) extends T_A
case class CC_C() extends T_A
case class CC_D(a: CC_B, b: CC_B) extends T_B
case class CC_E(a: Int, b: CC_B) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_D(CC_B(_, _, CC_A()), _) => 0 
  case CC_D(CC_B(_, _, CC_B(_, _, _)), _) => 1 
  case CC_D(CC_B(_, _, CC_C()), _) => 2 
  case CC_E(_, CC_B(CC_D(_, _), _, CC_A())) => 3 
  case CC_E(_, CC_B(CC_D(_, _), _, CC_B(_, _, _))) => 4 
  case CC_E(_, CC_B(CC_D(_, _), _, CC_C())) => 5 
  case CC_E(_, CC_B(CC_E(_, _), _, CC_A())) => 6 
  case CC_E(_, CC_B(CC_E(_, _), _, CC_B(_, _, _))) => 7 
  case CC_E(_, CC_B(CC_E(_, _), _, CC_C())) => 8 
}
}