package Program_5 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_A, b: Byte, c: Boolean) extends T_A
case class CC_B() extends T_A
case class CC_C(a: T_A, b: CC_B, c: CC_B) extends T_A
case class CC_D[C]() extends T_B[C, T_B[Byte, CC_B]]
case class CC_E[D](a: T_B[CC_C, T_B[Byte, CC_B]], b: T_B[D, T_B[Byte, CC_B]], c: T_B[D, D]) extends T_B[D, T_B[Byte, CC_B]]

val v_a: T_B[CC_B, T_B[Byte, CC_B]] = null
val v_b: Int = v_a match{
  case CC_D() => 0 
  case CC_E(CC_D(), CC_D(), _) => 1 
  case CC_E(CC_E(CC_D(), _, _), CC_D(), _) => 2 
  case CC_E(CC_E(CC_E(_, _, _), _, _), CC_D(), _) => 3 
  case CC_E(CC_D(), CC_E(_, _, _), _) => 4 
  case CC_E(CC_E(CC_D(), _, _), CC_E(_, _, _), _) => 5 
  case CC_E(CC_E(CC_E(_, _, _), _, _), CC_E(_, _, _), _) => 6 
}
}