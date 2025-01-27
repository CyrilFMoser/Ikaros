package Program_6 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_A, b: T_B[Boolean, (T_A,T_A)]) extends T_A
case class CC_B(a: Int, b: (Int,T_B[T_A, Byte]), c: T_A) extends T_A
case class CC_C() extends T_A
case class CC_D(a: CC_A) extends T_B[T_B[T_A, (CC_A,Boolean)], T_B[Int, (CC_B,(Byte,Int))]]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_, _), _), _) => 0 
  case CC_A(CC_A(CC_B(_, _, _), _), _) => 1 
  case CC_A(CC_A(CC_C(), _), _) => 2 
  case CC_A(CC_B(_, (_,_), CC_A(_, _)), _) => 3 
  case CC_A(CC_B(_, (_,_), CC_B(_, _, _)), _) => 4 
  case CC_A(CC_B(_, (_,_), CC_C()), _) => 5 
  case CC_A(CC_C(), _) => 6 
  case CC_B(_, (12,_), CC_A(CC_A(_, _), _)) => 7 
  case CC_B(_, (_,_), CC_A(CC_A(_, _), _)) => 8 
  case CC_B(_, (12,_), CC_A(CC_B(_, _, _), _)) => 9 
  case CC_B(_, (_,_), CC_A(CC_B(_, _, _), _)) => 10 
  case CC_B(_, (12,_), CC_A(CC_C(), _)) => 11 
  case CC_B(_, (_,_), CC_A(CC_C(), _)) => 12 
  case CC_B(_, (12,_), CC_B(_, _, _)) => 13 
  case CC_B(_, (_,_), CC_B(_, _, _)) => 14 
  case CC_B(_, (12,_), CC_C()) => 15 
  case CC_B(_, (_,_), CC_C()) => 16 
  case CC_C() => 17 
}
}