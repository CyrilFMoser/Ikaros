package Program_1 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: Byte, b: T_A) extends T_A
case class CC_B(a: T_B[CC_A, CC_A], b: CC_A) extends T_A
case class CC_C(a: T_B[CC_A, CC_B]) extends T_A
case class CC_D[C]() extends T_B[C, T_B[Boolean, Byte]]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(0, CC_A(_, _)) => 0 
  case CC_A(0, CC_B(_, CC_A(_, _))) => 1 
  case CC_A(0, CC_C(_)) => 2 
  case CC_A(_, CC_A(_, _)) => 3 
  case CC_A(_, CC_B(_, CC_A(_, _))) => 4 
  case CC_A(_, CC_C(_)) => 5 
  case CC_B(_, CC_A(_, _)) => 6 
  case CC_C(_) => 7 
}
}