package Program_17 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[T_B[T_A, Boolean], Boolean], b: Int, c: T_A) extends T_A
case class CC_B(a: CC_A) extends T_A
case class CC_C(a: (((Byte,Int),T_A),T_A), b: T_A, c: CC_B) extends T_A
case class CC_D[C, D](a: T_B[D, T_B[CC_C, D]]) extends T_B[CC_C, C]
case class CC_E[E]() extends T_B[E, (CC_C,Byte)]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _, CC_A(_, _, _)) => 0 
  case CC_A(_, _, CC_B(_)) => 1 
  case CC_A(_, _, CC_C(_, _, _)) => 2 
  case CC_B(CC_A(_, _, CC_A(_, _, _))) => 3 
  case CC_B(CC_A(_, _, CC_B(_))) => 4 
  case CC_B(CC_A(_, _, CC_C(_, _, _))) => 5 
  case CC_C(((_,_),CC_A(_, _, _)), CC_A(_, _, _), _) => 6 
  case CC_C(((_,_),CC_B(_)), CC_A(_, _, _), _) => 7 
  case CC_C(((_,_),CC_C(_, _, _)), CC_A(_, _, _), _) => 8 
  case CC_C(((_,_),CC_B(_)), CC_B(CC_A(_, _, _)), _) => 9 
  case CC_C(((_,_),CC_C(_, _, _)), CC_B(CC_A(_, _, _)), _) => 10 
  case CC_C(((_,_),CC_A(_, _, _)), CC_C(_, CC_A(_, _, _), _), _) => 11 
  case CC_C(((_,_),CC_B(_)), CC_C(_, CC_A(_, _, _), _), _) => 12 
  case CC_C(((_,_),CC_C(_, _, _)), CC_C(_, CC_A(_, _, _), _), _) => 13 
  case CC_C(((_,_),CC_A(_, _, _)), CC_C(_, CC_B(_), _), _) => 14 
  case CC_C(((_,_),CC_B(_)), CC_C(_, CC_B(_), _), _) => 15 
  case CC_C(((_,_),CC_C(_, _, _)), CC_C(_, CC_B(_), _), _) => 16 
  case CC_C(((_,_),CC_A(_, _, _)), CC_C(_, CC_C(_, _, _), _), _) => 17 
  case CC_C(((_,_),CC_B(_)), CC_C(_, CC_C(_, _, _), _), _) => 18 
  case CC_C(((_,_),CC_C(_, _, _)), CC_C(_, CC_C(_, _, _), _), _) => 19 
}
}
// This is not matched: CC_C(((_,_),CC_A(_, _, _)), CC_B(CC_A(_, _, _)), _)