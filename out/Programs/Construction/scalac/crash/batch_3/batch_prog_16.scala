package Program_16 

object Test {
sealed trait T_A
case class CC_A() extends T_A
case class CC_B(a: CC_A, b: T_A, c: T_A) extends T_A
case class CC_C(a: Int, b: (Byte,Byte), c: Byte) extends T_A

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(CC_A(), CC_A(), CC_A()) => 1 
  case CC_B(CC_A(), CC_A(), CC_B(CC_A(), CC_A(), _)) => 2 
  case CC_B(CC_A(), CC_A(), CC_B(CC_A(), CC_B(_, _, _), _)) => 3 
  case CC_B(CC_A(), CC_A(), CC_B(CC_A(), CC_C(_, _, _), _)) => 4 
  case CC_B(CC_A(), CC_A(), CC_C(_, (_,_), _)) => 5 
  case CC_B(CC_A(), CC_B(_, _, _), CC_A()) => 6 
  case CC_B(CC_A(), CC_B(_, _, _), CC_B(CC_A(), CC_A(), _)) => 7 
  case CC_B(CC_A(), CC_B(_, _, _), CC_B(CC_A(), CC_B(_, _, _), _)) => 8 
  case CC_B(CC_A(), CC_B(_, _, _), CC_B(CC_A(), CC_C(_, _, _), _)) => 9 
  case CC_B(CC_A(), CC_B(_, _, _), CC_C(_, (_,_), _)) => 10 
  case CC_B(CC_A(), CC_C(_, _, _), CC_A()) => 11 
  case CC_B(CC_A(), CC_C(_, _, _), CC_B(CC_A(), CC_A(), _)) => 12 
  case CC_B(CC_A(), CC_C(_, _, _), CC_B(CC_A(), CC_B(_, _, _), _)) => 13 
  case CC_B(CC_A(), CC_C(_, _, _), CC_B(CC_A(), CC_C(_, _, _), _)) => 14 
  case CC_C(_, (_,_), _) => 15 
}
}
// This is not matched: CC_B(CC_A(), CC_C(_, _, _), CC_C(_, (_,_), _))