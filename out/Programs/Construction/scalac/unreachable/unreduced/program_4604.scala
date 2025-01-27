package Program_28 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: T_A[C, C], c: C) extends T_A[Boolean, C]
case class CC_B[D](a: T_A[T_A[Boolean, D], D], b: T_A[Boolean, D], c: ((Byte,(Int,Char)),T_A[Boolean, Boolean])) extends T_A[Boolean, D]

val v_a: T_A[Boolean, Boolean] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_, _, _), CC_A(_, _, _), true), CC_A(_, _, _), _) => 0 
  case CC_A(CC_A(CC_A(_, _, _), CC_A(_, _, _), false), CC_A(_, _, _), _) => 1 
  case CC_A(CC_A(CC_B(_, _, _), CC_A(_, _, _), true), CC_A(_, _, _), _) => 2 
  case CC_A(CC_A(CC_B(_, _, _), CC_A(_, _, _), false), CC_A(_, _, _), _) => 3 
  case CC_A(CC_A(CC_A(_, _, _), CC_B(_, _, _), true), CC_A(_, _, _), _) => 4 
  case CC_A(CC_A(CC_A(_, _, _), CC_B(_, _, _), false), CC_A(_, _, _), _) => 5 
  case CC_A(CC_A(CC_B(_, _, _), CC_B(_, _, _), true), CC_A(_, _, _), _) => 6 
  case CC_A(CC_A(CC_B(_, _, _), CC_B(_, _, _), false), CC_A(_, _, _), _) => 7 
  case CC_A(CC_B(_, CC_A(_, _, _), (_,_)), CC_A(_, _, _), _) => 8 
  case CC_A(CC_B(_, CC_B(_, _, _), (_,_)), CC_A(_, _, _), _) => 9 
  case CC_A(CC_A(CC_A(_, _, _), CC_A(_, _, _), true), CC_B(_, _, (_,_)), _) => 10 
  case CC_A(CC_A(CC_A(_, _, _), CC_A(_, _, _), false), CC_B(_, _, (_,_)), _) => 11 
  case CC_A(CC_A(CC_B(_, _, _), CC_A(_, _, _), true), CC_B(_, _, (_,_)), _) => 12 
  case CC_A(CC_A(CC_B(_, _, _), CC_A(_, _, _), false), CC_B(_, _, (_,_)), _) => 13 
  case CC_A(CC_A(CC_A(_, _, _), CC_B(_, _, _), true), CC_B(_, _, (_,_)), _) => 14 
  case CC_A(CC_A(CC_A(_, _, _), CC_B(_, _, _), false), CC_B(_, _, (_,_)), _) => 15 
  case CC_A(CC_A(CC_B(_, _, _), CC_B(_, _, _), true), CC_B(_, _, (_,_)), _) => 16 
  case CC_A(CC_A(CC_B(_, _, _), CC_B(_, _, _), false), CC_B(_, _, (_,_)), _) => 17 
  case CC_A(CC_B(_, CC_A(_, _, _), (_,_)), CC_B(_, _, (_,_)), _) => 18 
  case CC_A(CC_B(_, CC_B(_, _, _), (_,_)), CC_B(_, _, (_,_)), _) => 19 
  case CC_B(_, _, _) => 20 
}
}