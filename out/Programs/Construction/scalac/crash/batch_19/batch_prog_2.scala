package Program_2 

object Test {
sealed trait T_A[A]
case class CC_A[B]() extends T_A[B]
case class CC_B[C, D](a: T_A[C], b: T_A[T_A[D]], c: T_A[C]) extends T_A[C]
case class CC_C[E]() extends T_A[E]

val v_a: T_A[Int] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(CC_A(), _, CC_A()) => 1 
  case CC_B(CC_A(), _, CC_B(CC_A(), _, _)) => 2 
  case CC_B(CC_A(), _, CC_B(CC_B(_, _, _), _, _)) => 3 
  case CC_B(CC_A(), _, CC_B(CC_C(), _, _)) => 4 
  case CC_B(CC_A(), _, CC_C()) => 5 
  case CC_B(CC_B(CC_A(), _, CC_A()), _, CC_A()) => 6 
  case CC_B(CC_B(CC_A(), _, CC_A()), _, CC_B(CC_A(), _, _)) => 7 
  case CC_B(CC_B(CC_A(), _, CC_A()), _, CC_B(CC_B(_, _, _), _, _)) => 8 
  case CC_B(CC_B(CC_A(), _, CC_A()), _, CC_B(CC_C(), _, _)) => 9 
  case CC_B(CC_B(CC_A(), _, CC_A()), _, CC_C()) => 10 
  case CC_B(CC_B(CC_A(), _, CC_B(_, _, _)), _, CC_A()) => 11 
  case CC_B(CC_B(CC_A(), _, CC_B(_, _, _)), _, CC_B(CC_A(), _, _)) => 12 
  case CC_B(CC_B(CC_A(), _, CC_B(_, _, _)), _, CC_B(CC_B(_, _, _), _, _)) => 13 
  case CC_B(CC_B(CC_A(), _, CC_B(_, _, _)), _, CC_B(CC_C(), _, _)) => 14 
  case CC_B(CC_B(CC_A(), _, CC_B(_, _, _)), _, CC_C()) => 15 
  case CC_B(CC_B(CC_A(), _, CC_C()), _, CC_A()) => 16 
  case CC_B(CC_B(CC_A(), _, CC_C()), _, CC_B(CC_A(), _, _)) => 17 
  case CC_B(CC_B(CC_A(), _, CC_C()), _, CC_B(CC_B(_, _, _), _, _)) => 18 
  case CC_B(CC_B(CC_A(), _, CC_C()), _, CC_B(CC_C(), _, _)) => 19 
  case CC_B(CC_B(CC_A(), _, CC_C()), _, CC_C()) => 20 
  case CC_B(CC_B(CC_B(_, _, _), _, CC_A()), _, CC_A()) => 21 
  case CC_B(CC_B(CC_B(_, _, _), _, CC_A()), _, CC_B(CC_A(), _, _)) => 22 
  case CC_B(CC_B(CC_B(_, _, _), _, CC_A()), _, CC_B(CC_B(_, _, _), _, _)) => 23 
  case CC_B(CC_B(CC_B(_, _, _), _, CC_A()), _, CC_B(CC_C(), _, _)) => 24 
  case CC_B(CC_B(CC_B(_, _, _), _, CC_A()), _, CC_C()) => 25 
  case CC_B(CC_B(CC_B(_, _, _), _, CC_B(_, _, _)), _, CC_A()) => 26 
  case CC_B(CC_B(CC_B(_, _, _), _, CC_B(_, _, _)), _, CC_B(CC_A(), _, _)) => 27 
  case CC_B(CC_B(CC_B(_, _, _), _, CC_B(_, _, _)), _, CC_B(CC_B(_, _, _), _, _)) => 28 
  case CC_B(CC_B(CC_B(_, _, _), _, CC_B(_, _, _)), _, CC_B(CC_C(), _, _)) => 29 
  case CC_B(CC_B(CC_B(_, _, _), _, CC_B(_, _, _)), _, CC_C()) => 30 
  case CC_B(CC_B(CC_B(_, _, _), _, CC_C()), _, CC_A()) => 31 
  case CC_B(CC_B(CC_B(_, _, _), _, CC_C()), _, CC_B(CC_A(), _, _)) => 32 
  case CC_B(CC_B(CC_B(_, _, _), _, CC_C()), _, CC_B(CC_B(_, _, _), _, _)) => 33 
  case CC_B(CC_B(CC_B(_, _, _), _, CC_C()), _, CC_B(CC_C(), _, _)) => 34 
  case CC_B(CC_B(CC_B(_, _, _), _, CC_C()), _, CC_C()) => 35 
  case CC_B(CC_B(CC_C(), _, CC_A()), _, CC_A()) => 36 
  case CC_B(CC_B(CC_C(), _, CC_A()), _, CC_B(CC_A(), _, _)) => 37 
  case CC_B(CC_B(CC_C(), _, CC_A()), _, CC_B(CC_B(_, _, _), _, _)) => 38 
  case CC_B(CC_B(CC_C(), _, CC_A()), _, CC_B(CC_C(), _, _)) => 39 
  case CC_B(CC_B(CC_C(), _, CC_A()), _, CC_C()) => 40 
  case CC_B(CC_B(CC_C(), _, CC_B(_, _, _)), _, CC_A()) => 41 
  case CC_B(CC_B(CC_C(), _, CC_B(_, _, _)), _, CC_B(CC_A(), _, _)) => 42 
  case CC_B(CC_B(CC_C(), _, CC_B(_, _, _)), _, CC_B(CC_B(_, _, _), _, _)) => 43 
  case CC_B(CC_B(CC_C(), _, CC_B(_, _, _)), _, CC_B(CC_C(), _, _)) => 44 
  case CC_B(CC_B(CC_C(), _, CC_B(_, _, _)), _, CC_C()) => 45 
  case CC_B(CC_B(CC_C(), _, CC_C()), _, CC_A()) => 46 
  case CC_B(CC_B(CC_C(), _, CC_C()), _, CC_B(CC_A(), _, _)) => 47 
  case CC_B(CC_B(CC_C(), _, CC_C()), _, CC_B(CC_B(_, _, _), _, _)) => 48 
  case CC_B(CC_B(CC_C(), _, CC_C()), _, CC_B(CC_C(), _, _)) => 49 
  case CC_B(CC_B(CC_C(), _, CC_C()), _, CC_C()) => 50 
  case CC_B(CC_C(), _, CC_A()) => 51 
  case CC_B(CC_C(), _, CC_B(CC_A(), _, _)) => 52 
  case CC_B(CC_C(), _, CC_B(CC_B(_, _, _), _, _)) => 53 
  case CC_B(CC_C(), _, CC_B(CC_C(), _, _)) => 54 
  case CC_B(CC_C(), _, CC_C()) => 55 
  case CC_C() => 56 
}
}