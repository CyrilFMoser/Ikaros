package Program_15 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, T_A[C, C]], b: (Int,T_A[Boolean, Char]), c: C) extends T_A[C, T_A[C, C]]
case class CC_B[D](a: Int, b: T_A[D, T_A[D, D]], c: T_A[D, T_A[D, D]]) extends T_A[D, T_A[D, D]]
case class CC_C(a: T_A[CC_A[Int], Boolean], b: T_A[CC_A[Byte], T_A[CC_A[Byte], CC_A[Byte]]], c: Char) extends T_A[CC_A[CC_B[Boolean]], T_A[CC_A[CC_B[Boolean]], CC_A[CC_B[Boolean]]]]

val v_a: T_A[T_A[CC_A[CC_B[Boolean]], T_A[CC_A[CC_B[Boolean]], CC_A[CC_B[Boolean]]]], T_A[T_A[CC_A[CC_B[Boolean]], T_A[CC_A[CC_B[Boolean]], CC_A[CC_B[Boolean]]]], T_A[CC_A[CC_B[Boolean]], T_A[CC_A[CC_B[Boolean]], CC_A[CC_B[Boolean]]]]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, CC_A(_, _, _)) => 0 
  case CC_A(_, _, CC_B(_, _, CC_A(_, _, _))) => 1 
  case CC_A(_, _, CC_B(_, _, CC_B(_, _, _))) => 2 
  case CC_A(_, _, CC_B(_, _, CC_C(_, _, _))) => 3 
  case CC_A(_, _, CC_C(_, _, 'x')) => 4 
  case CC_A(_, _, CC_C(_, _, _)) => 5 
  case CC_B(12, _, CC_A(CC_A(_, _, _), _, _)) => 6 
  case CC_B(_, _, CC_A(CC_A(_, _, _), _, _)) => 7 
  case CC_B(12, _, CC_A(CC_B(_, _, _), _, _)) => 8 
  case CC_B(_, _, CC_A(CC_B(_, _, _), _, _)) => 9 
  case CC_B(12, _, CC_B(_, CC_A(_, _, _), _)) => 10 
  case CC_B(_, _, CC_B(_, CC_A(_, _, _), _)) => 11 
  case CC_B(12, _, CC_B(_, CC_B(_, _, _), _)) => 12 
  case CC_B(_, _, CC_B(_, CC_B(_, _, _), _)) => 13 
}
}