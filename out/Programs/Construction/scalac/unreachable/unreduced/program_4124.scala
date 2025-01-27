package Program_6 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: (T_A[Int, Boolean],Int), b: (T_A[Int, Byte],T_A[Boolean, Int]), c: ((Char,Boolean),T_A[Int, Boolean])) extends T_A[C, T_A[C, C]]
case class CC_B[D](a: T_A[((Byte,Char),(Byte,Int)), T_A[((Byte,Char),(Byte,Int)), ((Byte,Char),(Byte,Int))]], b: D) extends T_A[D, T_A[D, D]]
case class CC_C[E](a: T_A[E, T_A[E, E]], b: T_A[E, T_A[E, E]]) extends T_A[E, T_A[E, E]]

val v_a: T_A[Int, T_A[Int, Int]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, ((_,_),_)) => 0 
  case CC_B(CC_A((_,_), (_,_), (_,_)), _) => 1 
  case CC_B(CC_B(_, (_,_)), _) => 2 
  case CC_B(CC_C(CC_A(_, _, _), CC_A(_, _, _)), _) => 3 
  case CC_B(CC_C(CC_B(_, _), CC_A(_, _, _)), _) => 4 
  case CC_B(CC_C(CC_C(_, _), CC_A(_, _, _)), _) => 5 
  case CC_B(CC_C(CC_A(_, _, _), CC_B(_, _)), _) => 6 
  case CC_B(CC_C(CC_B(_, _), CC_B(_, _)), _) => 7 
  case CC_B(CC_C(CC_C(_, _), CC_B(_, _)), _) => 8 
  case CC_B(CC_C(CC_A(_, _, _), CC_C(_, _)), _) => 9 
  case CC_B(CC_C(CC_B(_, _), CC_C(_, _)), _) => 10 
  case CC_B(CC_C(CC_C(_, _), CC_C(_, _)), _) => 11 
  case CC_C(CC_A(_, _, _), _) => 12 
  case CC_C(CC_B(_, _), _) => 13 
  case CC_C(CC_C(_, CC_A(_, _, _)), _) => 14 
  case CC_C(CC_C(_, CC_B(_, _)), _) => 15 
  case CC_C(CC_C(_, CC_C(_, _)), _) => 16 
}
}