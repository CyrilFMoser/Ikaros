package Program_9 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, T_A[C, C]], b: T_A[C, C], c: T_A[C, T_A[C, C]]) extends T_A[C, T_A[C, C]]
case class CC_B[D]() extends T_A[D, T_A[D, D]]

val v_a: T_A[Int, T_A[Int, Int]] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_, _, _), _, CC_A(_, _, _)), _, CC_A(_, _, _)) => 0 
  case CC_A(CC_A(CC_A(_, _, _), _, CC_A(_, _, _)), _, CC_B()) => 1 
  case CC_A(CC_A(CC_B(), _, CC_A(_, _, _)), _, CC_A(_, _, _)) => 2 
  case CC_A(CC_A(CC_B(), _, CC_A(_, _, _)), _, CC_B()) => 3 
  case CC_A(CC_A(CC_A(_, _, _), _, CC_B()), _, CC_A(_, _, _)) => 4 
  case CC_A(CC_A(CC_A(_, _, _), _, CC_B()), _, CC_B()) => 5 
  case CC_A(CC_A(CC_B(), _, CC_B()), _, CC_A(_, _, _)) => 6 
  case CC_A(CC_A(CC_B(), _, CC_B()), _, CC_B()) => 7 
  case CC_A(CC_B(), _, CC_A(_, _, _)) => 8 
  case CC_A(CC_B(), _, CC_B()) => 9 
  case CC_B() => 10 
}
}