package Program_21 

object Test {
sealed trait T_A
case class CC_A() extends T_A
case class CC_B(a: T_A, b: T_A) extends T_A
case class CC_C() extends T_A

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, CC_A()) => 1 
  case CC_B(_, CC_B(CC_A(), CC_A())) => 2 
  case CC_B(_, CC_B(CC_A(), CC_B(_, _))) => 3 
  case CC_B(_, CC_B(CC_A(), CC_C())) => 4 
  case CC_B(_, CC_B(CC_B(_, _), CC_A())) => 5 
  case CC_B(_, CC_B(CC_B(_, _), CC_B(_, _))) => 6 
  case CC_B(_, CC_B(CC_B(_, _), CC_C())) => 7 
  case CC_B(_, CC_B(CC_C(), CC_A())) => 8 
  case CC_B(_, CC_B(CC_C(), CC_B(_, _))) => 9 
  case CC_B(_, CC_B(CC_C(), CC_C())) => 10 
  case CC_B(_, CC_C()) => 11 
  case CC_C() => 12 
}
}