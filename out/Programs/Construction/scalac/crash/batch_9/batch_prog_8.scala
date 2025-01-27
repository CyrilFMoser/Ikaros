package Program_8 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A() extends T_A
case class CC_B(a: T_A, b: T_A, c: CC_A) extends T_A
case class CC_C() extends T_A
case class CC_D[B]() extends T_B[B]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_B(CC_A(), _, _) => 0 
  case CC_B(CC_B(CC_A(), CC_A(), CC_A()), _, _) => 1 
  case CC_B(CC_B(CC_B(_, _, _), CC_A(), CC_A()), _, _) => 2 
  case CC_B(CC_B(CC_C(), CC_A(), CC_A()), _, _) => 3 
  case CC_B(CC_B(CC_A(), CC_B(_, _, _), CC_A()), _, _) => 4 
  case CC_B(CC_B(CC_B(_, _, _), CC_B(_, _, _), CC_A()), _, _) => 5 
  case CC_B(CC_B(CC_C(), CC_B(_, _, _), CC_A()), _, _) => 6 
  case CC_B(CC_B(CC_A(), CC_C(), CC_A()), _, _) => 7 
  case CC_B(CC_B(CC_B(_, _, _), CC_C(), CC_A()), _, _) => 8 
  case CC_B(CC_B(CC_C(), CC_C(), CC_A()), _, _) => 9 
  case CC_B(CC_C(), _, _) => 10 
  case CC_C() => 11 
}
}
// This is not matched: CC_A()