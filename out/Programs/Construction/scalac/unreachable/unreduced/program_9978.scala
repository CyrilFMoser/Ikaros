package Program_29 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[T_A[C, C], C], b: T_A[T_A[C, C], C], c: T_A[C, T_A[C, C]]) extends T_A[T_A[C, C], C]
case class CC_B() extends T_A[T_A[CC_A[(Int,Int)], CC_A[(Int,Int)]], CC_A[(Int,Int)]]

val v_a: T_A[T_A[CC_A[(Int,Int)], CC_A[(Int,Int)]], CC_A[(Int,Int)]] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_, _, _), _, _), CC_A(CC_A(_, _, _), _, _), _) => 0 
  case CC_A(CC_A(CC_A(_, _, _), _, _), CC_A(CC_B(), _, _), _) => 1 
  case CC_A(CC_A(CC_A(_, _, _), _, _), CC_B(), _) => 2 
  case CC_A(CC_A(CC_B(), _, _), CC_A(CC_A(_, _, _), _, _), _) => 3 
  case CC_A(CC_A(CC_B(), _, _), CC_A(CC_B(), _, _), _) => 4 
  case CC_A(CC_A(CC_B(), _, _), CC_B(), _) => 5 
  case CC_A(CC_B(), CC_A(CC_A(_, _, _), _, _), _) => 6 
  case CC_A(CC_B(), CC_A(CC_B(), _, _), _) => 7 
  case CC_A(CC_B(), CC_B(), _) => 8 
  case CC_B() => 9 
}
}