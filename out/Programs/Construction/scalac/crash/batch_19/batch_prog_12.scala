package Program_12 

object Test {
sealed trait T_A
case class CC_A(a: Byte, b: Int, c: T_A) extends T_A
case class CC_B(a: Int, b: T_A) extends T_A
case class CC_C(a: CC_A) extends T_A

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(0, _, _) => 0 
  case CC_A(_, _, _) => 1 
  case CC_B(12, CC_A(_, 12, _)) => 2 
  case CC_B(12, CC_A(_, _, _)) => 3 
  case CC_B(12, CC_B(_, CC_A(_, _, _))) => 4 
  case CC_B(12, CC_B(_, CC_B(_, _))) => 5 
  case CC_B(12, CC_B(_, CC_C(_))) => 6 
  case CC_B(12, CC_C(CC_A(_, _, _))) => 7 
  case CC_B(_, CC_A(_, 12, _)) => 8 
  case CC_B(_, CC_A(_, _, _)) => 9 
  case CC_B(_, CC_B(_, CC_A(_, _, _))) => 10 
  case CC_B(_, CC_B(_, CC_B(_, _))) => 11 
  case CC_B(_, CC_B(_, CC_C(_))) => 12 
  case CC_B(_, CC_C(CC_A(_, _, _))) => 13 
  case CC_C(CC_A(_, _, _)) => 14 
}
}