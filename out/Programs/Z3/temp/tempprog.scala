object Test {
sealed trait T_A
case class CC_A(a: T_A, b: T_A) extends T_A
case class CC_B() extends T_A

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, CC_B())) => 0 
  case CC_A(CC_A(CC_B(), CC_B()), CC_A(CC_A(_, _), CC_B())) => 1 
  case CC_A(CC_A(CC_B(), CC_B()), CC_B()) => 2 
  case CC_A(CC_A(CC_A(_, _), _), CC_A(CC_A(_, _), CC_B())) => 3 
  case CC_A(CC_A(CC_A(_, _), CC_B()), CC_B()) => 4 
  case CC_A(CC_A(_, CC_B()), CC_A(_, _)) => 5 
  case CC_A(CC_A(CC_B(), _), CC_A(CC_B(), CC_A(_, _))) => 6 
  case CC_A(CC_A(_, CC_B()), CC_A(CC_B(), CC_B())) => 7 
  case CC_A(CC_A(CC_B(), CC_A(_, _)), CC_A(CC_A(_, _), CC_B())) => 8 
  case CC_A(CC_B(), CC_A(CC_A(_, _), CC_A(_, _))) => 9 
  case CC_A(CC_A(CC_B(), _), CC_A(_, CC_B())) => 10 
  case CC_A(CC_A(CC_A(_, _), _), CC_A(CC_B(), CC_A(_, _))) => 11 
  case CC_A(CC_A(_, _), CC_A(_, CC_A(_, _))) => 12 
  case CC_A(CC_B(), CC_A(CC_B(), CC_A(_, _))) => 13 
  case CC_A(CC_A(CC_B(), _), CC_B()) => 14 
  case CC_A(CC_A(_, CC_A(_, _)), CC_A(CC_B(), CC_B())) => 15 
}
}