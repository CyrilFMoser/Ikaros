package Program_13 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A() extends T_A
case class CC_B(a: T_A, b: T_A, c: T_B[CC_A, Int]) extends T_A
case class CC_C() extends T_A
case class CC_D[C](a: CC_A) extends T_B[T_B[Byte, CC_A], C]
case class CC_E[D](a: T_B[T_B[Byte, CC_A], D]) extends T_B[T_B[Byte, CC_A], D]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(CC_A(), _, _) => 1 
  case CC_B(CC_B(CC_A(), CC_A(), _), _, _) => 2 
  case CC_B(CC_B(CC_B(_, _, _), CC_A(), _), _, _) => 3 
  case CC_B(CC_B(CC_C(), CC_A(), _), _, _) => 4 
  case CC_B(CC_B(CC_A(), CC_B(_, _, _), _), _, _) => 5 
  case CC_B(CC_B(CC_B(_, _, _), CC_B(_, _, _), _), _, _) => 6 
  case CC_B(CC_B(CC_C(), CC_B(_, _, _), _), _, _) => 7 
  case CC_B(CC_B(CC_A(), CC_C(), _), _, _) => 8 
  case CC_B(CC_B(CC_B(_, _, _), CC_C(), _), _, _) => 9 
  case CC_B(CC_C(), _, _) => 10 
  case CC_C() => 11 
}
}
// This is not matched: CC_B(CC_B(CC_C(), CC_C(), _), _, _)