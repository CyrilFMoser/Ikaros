package Program_25 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[T_A[C, C], C], b: T_A[C, C], c: T_A[T_A[((Byte,Byte),Int), ((Byte,Byte),Int)], ((Byte,Byte),Int)]) extends T_A[T_A[C, C], C]
case class CC_B[D]() extends T_A[T_A[D, D], D]
case class CC_C[E](a: Int) extends T_A[T_A[E, E], E]

val v_a: T_A[T_A[Boolean, Boolean], Boolean] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _, CC_A(_, _, _)), _, CC_A(CC_A(_, _, _), _, CC_A(_, _, _))) => 0 
  case CC_A(CC_A(_, _, CC_A(_, _, _)), _, CC_A(CC_B(), _, CC_A(_, _, _))) => 1 
  case CC_A(CC_A(_, _, CC_A(_, _, _)), _, CC_A(CC_C(_), _, CC_A(_, _, _))) => 2 
  case CC_A(CC_A(_, _, CC_A(_, _, _)), _, CC_A(CC_A(_, _, _), _, CC_B())) => 3 
  case CC_A(CC_A(_, _, CC_A(_, _, _)), _, CC_A(CC_B(), _, CC_B())) => 4 
  case CC_A(CC_A(_, _, CC_A(_, _, _)), _, CC_A(CC_C(_), _, CC_B())) => 5 
  case CC_A(CC_A(_, _, CC_A(_, _, _)), _, CC_A(CC_A(_, _, _), _, CC_C(_))) => 6 
  case CC_A(CC_A(_, _, CC_A(_, _, _)), _, CC_A(CC_B(), _, CC_C(_))) => 7 
  case CC_A(CC_A(_, _, CC_A(_, _, _)), _, CC_A(CC_C(_), _, CC_C(_))) => 8 
  case CC_A(CC_A(_, _, CC_A(_, _, _)), _, CC_B()) => 9 
  case CC_A(CC_A(_, _, CC_A(_, _, _)), _, CC_C(_)) => 10 
  case CC_A(CC_A(_, _, CC_B()), _, CC_A(CC_A(_, _, _), _, CC_A(_, _, _))) => 11 
  case CC_A(CC_A(_, _, CC_B()), _, CC_A(CC_B(), _, CC_A(_, _, _))) => 12 
  case CC_A(CC_A(_, _, CC_B()), _, CC_A(CC_C(_), _, CC_A(_, _, _))) => 13 
  case CC_A(CC_A(_, _, CC_B()), _, CC_A(CC_A(_, _, _), _, CC_B())) => 14 
  case CC_A(CC_A(_, _, CC_B()), _, CC_A(CC_B(), _, CC_B())) => 15 
  case CC_A(CC_A(_, _, CC_B()), _, CC_A(CC_C(_), _, CC_B())) => 16 
  case CC_A(CC_A(_, _, CC_B()), _, CC_A(CC_A(_, _, _), _, CC_C(_))) => 17 
  case CC_A(CC_A(_, _, CC_B()), _, CC_A(CC_B(), _, CC_C(_))) => 18 
  case CC_A(CC_A(_, _, CC_B()), _, CC_A(CC_C(_), _, CC_C(_))) => 19 
  case CC_A(CC_A(_, _, CC_B()), _, CC_B()) => 20 
  case CC_A(CC_A(_, _, CC_B()), _, CC_C(_)) => 21 
  case CC_A(CC_A(_, _, CC_C(_)), _, CC_A(CC_A(_, _, _), _, CC_A(_, _, _))) => 22 
  case CC_A(CC_A(_, _, CC_C(_)), _, CC_A(CC_B(), _, CC_A(_, _, _))) => 23 
  case CC_A(CC_A(_, _, CC_C(_)), _, CC_A(CC_C(_), _, CC_A(_, _, _))) => 24 
  case CC_A(CC_A(_, _, CC_C(_)), _, CC_A(CC_A(_, _, _), _, CC_B())) => 25 
  case CC_A(CC_A(_, _, CC_C(_)), _, CC_A(CC_B(), _, CC_B())) => 26 
  case CC_A(CC_A(_, _, CC_C(_)), _, CC_A(CC_C(_), _, CC_B())) => 27 
  case CC_A(CC_A(_, _, CC_C(_)), _, CC_A(CC_A(_, _, _), _, CC_C(_))) => 28 
  case CC_A(CC_A(_, _, CC_C(_)), _, CC_A(CC_B(), _, CC_C(_))) => 29 
  case CC_A(CC_A(_, _, CC_C(_)), _, CC_A(CC_C(_), _, CC_C(_))) => 30 
  case CC_A(CC_A(_, _, CC_C(_)), _, CC_B()) => 31 
  case CC_A(CC_A(_, _, CC_C(_)), _, CC_C(_)) => 32 
  case CC_A(CC_B(), _, CC_A(CC_A(_, _, _), _, CC_A(_, _, _))) => 33 
  case CC_A(CC_B(), _, CC_A(CC_B(), _, CC_A(_, _, _))) => 34 
  case CC_A(CC_B(), _, CC_A(CC_C(_), _, CC_A(_, _, _))) => 35 
  case CC_A(CC_B(), _, CC_A(CC_A(_, _, _), _, CC_B())) => 36 
  case CC_A(CC_B(), _, CC_A(CC_B(), _, CC_B())) => 37 
  case CC_A(CC_B(), _, CC_A(CC_C(_), _, CC_B())) => 38 
  case CC_A(CC_B(), _, CC_A(CC_A(_, _, _), _, CC_C(_))) => 39 
  case CC_A(CC_B(), _, CC_A(CC_B(), _, CC_C(_))) => 40 
  case CC_A(CC_B(), _, CC_A(CC_C(_), _, CC_C(_))) => 41 
  case CC_A(CC_B(), _, CC_B()) => 42 
  case CC_A(CC_B(), _, CC_C(_)) => 43 
  case CC_A(CC_C(_), _, CC_A(CC_A(_, _, _), _, CC_A(_, _, _))) => 44 
  case CC_A(CC_C(_), _, CC_A(CC_B(), _, CC_A(_, _, _))) => 45 
  case CC_A(CC_C(_), _, CC_A(CC_C(_), _, CC_A(_, _, _))) => 46 
  case CC_A(CC_C(_), _, CC_A(CC_A(_, _, _), _, CC_B())) => 47 
  case CC_A(CC_C(_), _, CC_A(CC_B(), _, CC_B())) => 48 
  case CC_A(CC_C(_), _, CC_A(CC_C(_), _, CC_B())) => 49 
  case CC_A(CC_C(_), _, CC_A(CC_A(_, _, _), _, CC_C(_))) => 50 
  case CC_A(CC_C(_), _, CC_A(CC_B(), _, CC_C(_))) => 51 
  case CC_A(CC_C(_), _, CC_A(CC_C(_), _, CC_C(_))) => 52 
  case CC_A(CC_C(_), _, CC_B()) => 53 
  case CC_A(CC_C(_), _, CC_C(_)) => 54 
  case CC_B() => 55 
  case CC_C(_) => 56 
}
}