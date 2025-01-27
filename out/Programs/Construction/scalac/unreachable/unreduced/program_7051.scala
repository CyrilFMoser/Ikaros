package Program_28 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_A, b: T_B[T_B[T_A, T_A], Byte], c: T_A) extends T_A
case class CC_B() extends T_A
case class CC_C[C]() extends T_B[C, T_B[C, CC_A]]

val v_a: T_A = null
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