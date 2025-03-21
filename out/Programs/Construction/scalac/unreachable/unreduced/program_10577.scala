package Program_9 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_A, b: Byte, c: Int) extends T_A
case class CC_B(a: Byte) extends T_A
case class CC_C(a: T_A, b: T_B[CC_A, T_A]) extends T_A
case class CC_D[C]() extends T_B[T_B[CC_C, CC_B], C]
case class CC_E[D, E]() extends T_B[CC_D[Boolean], D]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_, _, _), _, _), _, _) => 0 
  case CC_A(CC_A(CC_B(_), _, _), _, _) => 1 
  case CC_A(CC_A(CC_C(_, _), _, _), _, _) => 2 
  case CC_A(CC_B(_), _, _) => 3 
  case CC_A(CC_C(CC_A(_, _, _), _), _, _) => 4 
  case CC_A(CC_C(CC_B(_), _), _, _) => 5 
  case CC_A(CC_C(CC_C(_, _), _), _, _) => 6 
  case CC_B(_) => 7 
  case CC_C(_, _) => 8 
}
}