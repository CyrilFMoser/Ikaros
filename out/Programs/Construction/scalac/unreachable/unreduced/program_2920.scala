package Program_17 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: C, b: T_B) extends T_A[C, (T_A[T_B, T_B],(T_B,T_B))]
case class CC_B(a: T_B, b: T_B, c: T_A[Byte, CC_A[T_B]]) extends T_B
case class CC_C() extends T_B
case class CC_D(a: CC_C, b: Char) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B(CC_B(_, _, _), CC_B(CC_B(_, _, _), _, _), _) => 0 
  case CC_B(CC_C(), CC_B(CC_B(_, _, _), _, _), _) => 1 
  case CC_B(CC_D(_, _), CC_B(CC_B(_, _, _), _, _), _) => 2 
  case CC_B(CC_B(_, _, _), CC_B(CC_C(), _, _), _) => 3 
  case CC_B(CC_C(), CC_B(CC_C(), _, _), _) => 4 
  case CC_B(CC_D(_, _), CC_B(CC_C(), _, _), _) => 5 
  case CC_B(CC_B(_, _, _), CC_B(CC_D(_, _), _, _), _) => 6 
  case CC_B(CC_C(), CC_B(CC_D(_, _), _, _), _) => 7 
  case CC_B(CC_D(_, _), CC_B(CC_D(_, _), _, _), _) => 8 
  case CC_B(CC_B(_, _, _), CC_C(), _) => 9 
  case CC_B(CC_C(), CC_C(), _) => 10 
  case CC_B(CC_D(_, _), CC_C(), _) => 11 
  case CC_B(CC_B(_, _, _), CC_D(CC_C(), _), _) => 12 
  case CC_B(CC_C(), CC_D(CC_C(), _), _) => 13 
  case CC_B(CC_D(_, _), CC_D(CC_C(), _), _) => 14 
  case CC_C() => 15 
  case CC_D(CC_C(), _) => 16 
}
}