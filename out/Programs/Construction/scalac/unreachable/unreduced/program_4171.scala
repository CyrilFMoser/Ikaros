package Program_1 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_A[T_A[(Int,(Char,Byte)), (Int,(Char,Byte))], T_B]) extends T_A[C, T_B]
case class CC_B[E]() extends T_A[E, T_B]
case class CC_C[F](a: (T_A[T_B, T_B],T_A[T_B, T_B]), b: T_A[F, F], c: T_A[F, T_B]) extends T_A[F, T_B]

val v_a: T_A[Byte, T_B] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_)) => 0 
  case CC_A(CC_B()) => 1 
  case CC_A(CC_C((_,_), _, CC_A(_))) => 2 
  case CC_A(CC_C((_,_), _, CC_B())) => 3 
  case CC_A(CC_C((_,_), _, CC_C(_, _, _))) => 4 
  case CC_B() => 5 
  case CC_C((CC_A(_),CC_A(_)), _, CC_A(CC_A(_))) => 6 
  case CC_C((CC_A(_),CC_B()), _, CC_A(CC_A(_))) => 7 
  case CC_C((CC_A(_),CC_C(_, _, _)), _, CC_A(CC_A(_))) => 8 
  case CC_C((CC_B(),CC_A(_)), _, CC_A(CC_A(_))) => 9 
  case CC_C((CC_B(),CC_B()), _, CC_A(CC_A(_))) => 10 
  case CC_C((CC_B(),CC_C(_, _, _)), _, CC_A(CC_A(_))) => 11 
  case CC_C((CC_C(_, _, _),CC_A(_)), _, CC_A(CC_A(_))) => 12 
  case CC_C((CC_C(_, _, _),CC_B()), _, CC_A(CC_A(_))) => 13 
  case CC_C((CC_C(_, _, _),CC_C(_, _, _)), _, CC_A(CC_A(_))) => 14 
  case CC_C((CC_A(_),CC_A(_)), _, CC_A(CC_B())) => 15 
  case CC_C((CC_A(_),CC_B()), _, CC_A(CC_B())) => 16 
  case CC_C((CC_A(_),CC_C(_, _, _)), _, CC_A(CC_B())) => 17 
  case CC_C((CC_B(),CC_A(_)), _, CC_A(CC_B())) => 18 
  case CC_C((CC_B(),CC_B()), _, CC_A(CC_B())) => 19 
  case CC_C((CC_B(),CC_C(_, _, _)), _, CC_A(CC_B())) => 20 
  case CC_C((CC_C(_, _, _),CC_A(_)), _, CC_A(CC_B())) => 21 
  case CC_C((CC_C(_, _, _),CC_B()), _, CC_A(CC_B())) => 22 
  case CC_C((CC_C(_, _, _),CC_C(_, _, _)), _, CC_A(CC_B())) => 23 
  case CC_C((CC_A(_),CC_A(_)), _, CC_A(CC_C(_, _, _))) => 24 
  case CC_C((CC_A(_),CC_B()), _, CC_A(CC_C(_, _, _))) => 25 
  case CC_C((CC_A(_),CC_C(_, _, _)), _, CC_A(CC_C(_, _, _))) => 26 
  case CC_C((CC_B(),CC_A(_)), _, CC_A(CC_C(_, _, _))) => 27 
  case CC_C((CC_B(),CC_B()), _, CC_A(CC_C(_, _, _))) => 28 
  case CC_C((CC_B(),CC_C(_, _, _)), _, CC_A(CC_C(_, _, _))) => 29 
  case CC_C((CC_C(_, _, _),CC_A(_)), _, CC_A(CC_C(_, _, _))) => 30 
  case CC_C((CC_C(_, _, _),CC_B()), _, CC_A(CC_C(_, _, _))) => 31 
  case CC_C((CC_C(_, _, _),CC_C(_, _, _)), _, CC_A(CC_C(_, _, _))) => 32 
  case CC_C((CC_A(_),CC_A(_)), _, CC_B()) => 33 
  case CC_C((CC_A(_),CC_B()), _, CC_B()) => 34 
  case CC_C((CC_A(_),CC_C(_, _, _)), _, CC_B()) => 35 
  case CC_C((CC_B(),CC_A(_)), _, CC_B()) => 36 
  case CC_C((CC_B(),CC_B()), _, CC_B()) => 37 
  case CC_C((CC_B(),CC_C(_, _, _)), _, CC_B()) => 38 
  case CC_C((CC_C(_, _, _),CC_A(_)), _, CC_B()) => 39 
  case CC_C((CC_C(_, _, _),CC_B()), _, CC_B()) => 40 
  case CC_C((CC_C(_, _, _),CC_C(_, _, _)), _, CC_B()) => 41 
  case CC_C((CC_A(_),CC_A(_)), _, CC_C(_, _, _)) => 42 
  case CC_C((CC_A(_),CC_B()), _, CC_C(_, _, _)) => 43 
  case CC_C((CC_A(_),CC_C(_, _, _)), _, CC_C(_, _, _)) => 44 
  case CC_C((CC_B(),CC_A(_)), _, CC_C(_, _, _)) => 45 
  case CC_C((CC_B(),CC_B()), _, CC_C(_, _, _)) => 46 
  case CC_C((CC_B(),CC_C(_, _, _)), _, CC_C(_, _, _)) => 47 
  case CC_C((CC_C(_, _, _),CC_A(_)), _, CC_C(_, _, _)) => 48 
  case CC_C((CC_C(_, _, _),CC_B()), _, CC_C(_, _, _)) => 49 
  case CC_C((CC_C(_, _, _),CC_C(_, _, _)), _, CC_C(_, _, _)) => 50 
}
}