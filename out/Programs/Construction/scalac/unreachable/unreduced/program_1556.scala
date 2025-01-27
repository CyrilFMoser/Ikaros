package Program_3 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: (T_B[(Int,Byte)],T_A), b: T_A, c: T_A) extends T_A
case class CC_B(a: T_A, b: Boolean) extends T_A
case class CC_C(a: Char) extends T_A
case class CC_D() extends T_B[(CC_C,T_B[CC_A])]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A((_,_), CC_A(_, _, _), CC_A(_, _, _)) => 0 
  case CC_A((_,_), CC_B(_, _), CC_A(_, _, _)) => 1 
  case CC_A((_,_), CC_C(_), CC_A(_, _, _)) => 2 
  case CC_A((_,_), CC_A(_, _, _), CC_B(_, _)) => 3 
  case CC_A((_,_), CC_B(_, _), CC_B(_, _)) => 4 
  case CC_A((_,_), CC_C(_), CC_B(_, _)) => 5 
  case CC_A((_,_), CC_A(_, _, _), CC_C(_)) => 6 
  case CC_A((_,_), CC_C(_), CC_C(_)) => 7 
  case CC_B(_, _) => 8 
  case CC_C(_) => 9 
}
}
// This is not matched: CC_A((_,_), CC_B(_, _), CC_C(_))