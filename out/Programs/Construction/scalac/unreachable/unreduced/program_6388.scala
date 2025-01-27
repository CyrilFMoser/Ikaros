package Program_1 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[T_A[Boolean, Boolean], Boolean], b: ((Int,Char),T_A[Char, Int]), c: T_A[T_A[C, C], C]) extends T_A[T_A[C, C], C]
case class CC_B[D](a: T_A[T_A[D, D], D], b: D) extends T_A[T_A[D, D], D]
case class CC_C(a: T_A[((Byte,Byte),Byte), T_A[(Char,Boolean), Byte]]) extends T_A[((Byte,Boolean),Int), CC_B[Boolean]]

val v_a: T_A[T_A[Int, Int], Int] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, (_,_), _), ((_,_),_), CC_A(CC_A(_, _, _), _, _)) => 0 
  case CC_A(CC_A(_, (_,_), _), ((_,_),_), CC_A(CC_B(_, _), _, _)) => 1 
  case CC_A(CC_A(_, (_,_), _), ((_,_),_), CC_B(CC_A(_, _, _), _)) => 2 
  case CC_A(CC_A(_, (_,_), _), ((_,_),_), CC_B(CC_B(_, _), _)) => 3 
  case CC_A(CC_B(_, true), ((_,_),_), CC_A(CC_A(_, _, _), _, _)) => 4 
  case CC_A(CC_B(_, true), ((_,_),_), CC_A(CC_B(_, _), _, _)) => 5 
  case CC_A(CC_B(_, true), ((_,_),_), CC_B(CC_A(_, _, _), _)) => 6 
  case CC_A(CC_B(_, true), ((_,_),_), CC_B(CC_B(_, _), _)) => 7 
  case CC_A(CC_B(_, false), ((_,_),_), CC_A(CC_A(_, _, _), _, _)) => 8 
  case CC_A(CC_B(_, false), ((_,_),_), CC_A(CC_B(_, _), _, _)) => 9 
  case CC_A(CC_B(_, false), ((_,_),_), CC_B(CC_A(_, _, _), _)) => 10 
  case CC_A(CC_B(_, false), ((_,_),_), CC_B(CC_B(_, _), _)) => 11 
  case CC_B(_, _) => 12 
}
}