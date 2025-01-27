package Program_13 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A() extends T_A
case class CC_B(a: T_A, b: T_A, c: T_B[T_A]) extends T_A
case class CC_C() extends T_A
case class CC_D() extends T_B[T_B[CC_A]]
case class CC_E(a: CC_B, b: T_B[T_B[CC_A]], c: CC_B) extends T_B[T_B[CC_A]]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(CC_A(), _, _) => 1 
  case CC_B(CC_B(CC_A(), CC_A(), _), _, _) => 2 
  case CC_B(CC_B(CC_B(_, _, _), CC_A(), _), _, _) => 3 
  case CC_B(CC_B(CC_A(), CC_B(_, _, _), _), _, _) => 4 
  case CC_B(CC_B(CC_B(_, _, _), CC_B(_, _, _), _), _, _) => 5 
  case CC_B(CC_B(CC_C(), CC_B(_, _, _), _), _, _) => 6 
  case CC_B(CC_B(CC_A(), CC_C(), _), _, _) => 7 
  case CC_B(CC_B(CC_B(_, _, _), CC_C(), _), _, _) => 8 
  case CC_B(CC_B(CC_C(), CC_C(), _), _, _) => 9 
  case CC_B(CC_C(), _, _) => 10 
  case CC_C() => 11 
}
}
// This is not matched: CC_B(CC_B(CC_C(), CC_A(), _), _, _)