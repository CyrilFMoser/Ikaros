package Program_25 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[T_A[C, C], C], b: T_A[C, C], c: T_A[T_A[C, C], C]) extends T_A[T_A[C, C], C]
case class CC_B[D]() extends T_A[T_A[D, D], D]

val v_a: T_A[T_A[Byte, Byte], Byte] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _, CC_A(_, _, _)), _, CC_A(CC_A(_, _, _), _, CC_A(_, _, _))) => 0 
  case CC_A(CC_A(_, _, CC_B()), _, CC_A(CC_A(_, _, _), _, CC_A(_, _, _))) => 1 
  case CC_A(CC_B(), _, CC_A(CC_A(_, _, _), _, CC_A(_, _, _))) => 2 
  case CC_A(CC_A(_, _, CC_A(_, _, _)), _, CC_A(CC_B(), _, CC_A(_, _, _))) => 3 
  case CC_A(CC_A(_, _, CC_B()), _, CC_A(CC_B(), _, CC_A(_, _, _))) => 4 
  case CC_A(CC_B(), _, CC_A(CC_B(), _, CC_A(_, _, _))) => 5 
  case CC_A(CC_A(_, _, CC_A(_, _, _)), _, CC_A(CC_A(_, _, _), _, CC_B())) => 6 
  case CC_A(CC_A(_, _, CC_B()), _, CC_A(CC_A(_, _, _), _, CC_B())) => 7 
  case CC_A(CC_B(), _, CC_A(CC_A(_, _, _), _, CC_B())) => 8 
  case CC_A(CC_A(_, _, CC_A(_, _, _)), _, CC_A(CC_B(), _, CC_B())) => 9 
  case CC_A(CC_A(_, _, CC_B()), _, CC_A(CC_B(), _, CC_B())) => 10 
  case CC_A(CC_B(), _, CC_A(CC_B(), _, CC_B())) => 11 
  case CC_A(CC_A(_, _, CC_A(_, _, _)), _, CC_B()) => 12 
  case CC_A(CC_A(_, _, CC_B()), _, CC_B()) => 13 
  case CC_A(CC_B(), _, CC_B()) => 14 
  case CC_B() => 15 
}
}