package Program_2 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[T_A[C, C], C], b: T_A[T_A[C, C], C], c: T_A[C, C]) extends T_A[T_A[C, C], C]
case class CC_B[D](a: (T_A[Byte, Int],CC_A[Byte])) extends T_A[T_A[D, D], D]

val v_a: T_A[T_A[Int, Int], Int] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_, _, _), CC_A(_, _, _), _), CC_A(_, _, _), _) => 0 
  case CC_A(CC_A(CC_A(_, _, _), CC_B(_), _), CC_A(_, _, _), _) => 1 
  case CC_A(CC_A(CC_B(_), CC_A(_, _, _), _), CC_A(_, _, _), _) => 2 
  case CC_A(CC_A(CC_B(_), CC_B(_), _), CC_A(_, _, _), _) => 3 
  case CC_A(CC_B((_,_)), CC_A(_, _, _), _) => 4 
  case CC_A(CC_A(CC_A(_, _, _), CC_A(_, _, _), _), CC_B((_,_)), _) => 5 
  case CC_A(CC_A(CC_A(_, _, _), CC_B(_), _), CC_B((_,_)), _) => 6 
  case CC_A(CC_A(CC_B(_), CC_A(_, _, _), _), CC_B((_,_)), _) => 7 
  case CC_A(CC_A(CC_B(_), CC_B(_), _), CC_B((_,_)), _) => 8 
  case CC_A(CC_B((_,_)), CC_B((_,_)), _) => 9 
  case CC_B(_) => 10 
}
}