package Program_12 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A[C](a: T_A, b: Byte) extends T_A
case class CC_B(a: T_A) extends T_A
case class CC_C(a: (Boolean,T_B[CC_B, CC_B]), b: T_A, c: CC_A[CC_B]) extends T_A
case class CC_D[D](a: ((Byte,Char),T_B[(Boolean,Int), (Char,Char)]), b: CC_B, c: T_B[CC_B, T_A]) extends T_B[D, T_A]
case class CC_E(a: T_A, b: T_A) extends T_B[Byte, T_A]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_, _), 0), _) => 0 
  case CC_A(CC_A(CC_A(_, _), _), _) => 1 
  case CC_A(CC_A(CC_B(_), 0), _) => 2 
  case CC_A(CC_A(CC_B(_), _), _) => 3 
  case CC_A(CC_A(CC_C(_, _, _), 0), _) => 4 
  case CC_A(CC_A(CC_C(_, _, _), _), _) => 5 
  case CC_A(CC_B(CC_A(_, _)), _) => 6 
  case CC_A(CC_B(CC_B(_)), _) => 7 
  case CC_A(CC_B(CC_C(_, _, _)), _) => 8 
  case CC_A(CC_C(_, CC_A(_, _), _), _) => 9 
  case CC_A(CC_C(_, CC_B(_), _), _) => 10 
  case CC_A(CC_C(_, CC_C(_, _, _), _), _) => 11 
  case CC_B(CC_A(_, _)) => 12 
  case CC_B(CC_B(CC_A(_, _))) => 13 
  case CC_B(CC_B(CC_B(_))) => 14 
  case CC_B(CC_B(CC_C(_, _, _))) => 15 
  case CC_B(CC_C((_,_), _, _)) => 16 
  case CC_C((_,_), CC_A(_, _), CC_A(_, _)) => 17 
  case CC_C((_,_), CC_B(CC_A(_, _)), CC_A(_, _)) => 18 
  case CC_C((_,_), CC_B(CC_B(_)), CC_A(_, _)) => 19 
  case CC_C((_,_), CC_B(CC_C(_, _, _)), CC_A(_, _)) => 20 
  case CC_C((_,_), CC_C(_, CC_A(_, _), CC_A(_, _)), CC_A(_, _)) => 21 
  case CC_C((_,_), CC_C(_, CC_B(_), CC_A(_, _)), CC_A(_, _)) => 22 
  case CC_C((_,_), CC_C(_, CC_C(_, _, _), CC_A(_, _)), CC_A(_, _)) => 23 
}
}