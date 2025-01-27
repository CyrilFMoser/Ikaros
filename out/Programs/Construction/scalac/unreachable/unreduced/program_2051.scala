package Program_25 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_B, b: T_A[T_B]) extends T_A[T_B]
case class CC_B[B]() extends T_A[T_B]
case class CC_C(a: (CC_A,T_B), b: T_A[CC_B[Char]], c: T_A[T_B]) extends T_B
case class CC_D(a: (T_A[CC_A],Int), b: CC_B[CC_A]) extends T_B
case class CC_E(a: Int, b: T_A[T_B]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C((CC_A(_, _),CC_C(_, _, _)), _, CC_A(CC_C(_, _, _), CC_A(_, _))) => 0 
  case CC_C((CC_A(_, _),CC_C(_, _, _)), _, CC_A(CC_C(_, _, _), CC_B())) => 1 
  case CC_C((CC_A(_, _),CC_C(_, _, _)), _, CC_A(CC_D(_, _), CC_A(_, _))) => 2 
  case CC_C((CC_A(_, _),CC_C(_, _, _)), _, CC_A(CC_D(_, _), CC_B())) => 3 
  case CC_C((CC_A(_, _),CC_C(_, _, _)), _, CC_A(CC_E(_, _), CC_A(_, _))) => 4 
  case CC_C((CC_A(_, _),CC_C(_, _, _)), _, CC_A(CC_E(_, _), CC_B())) => 5 
  case CC_C((CC_A(_, _),CC_C(_, _, _)), _, CC_B()) => 6 
  case CC_C((CC_A(_, _),CC_D(_, _)), _, CC_A(CC_C(_, _, _), CC_A(_, _))) => 7 
  case CC_C((CC_A(_, _),CC_D(_, _)), _, CC_A(CC_C(_, _, _), CC_B())) => 8 
  case CC_C((CC_A(_, _),CC_D(_, _)), _, CC_A(CC_D(_, _), CC_A(_, _))) => 9 
  case CC_C((CC_A(_, _),CC_D(_, _)), _, CC_A(CC_D(_, _), CC_B())) => 10 
  case CC_C((CC_A(_, _),CC_D(_, _)), _, CC_A(CC_E(_, _), CC_A(_, _))) => 11 
  case CC_C((CC_A(_, _),CC_D(_, _)), _, CC_A(CC_E(_, _), CC_B())) => 12 
  case CC_C((CC_A(_, _),CC_D(_, _)), _, CC_B()) => 13 
  case CC_C((CC_A(_, _),CC_E(_, _)), _, CC_A(CC_C(_, _, _), CC_A(_, _))) => 14 
  case CC_C((CC_A(_, _),CC_E(_, _)), _, CC_A(CC_C(_, _, _), CC_B())) => 15 
  case CC_C((CC_A(_, _),CC_E(_, _)), _, CC_A(CC_D(_, _), CC_A(_, _))) => 16 
  case CC_C((CC_A(_, _),CC_E(_, _)), _, CC_A(CC_D(_, _), CC_B())) => 17 
  case CC_C((CC_A(_, _),CC_E(_, _)), _, CC_A(CC_E(_, _), CC_A(_, _))) => 18 
  case CC_C((CC_A(_, _),CC_E(_, _)), _, CC_A(CC_E(_, _), CC_B())) => 19 
  case CC_C((CC_A(_, _),CC_E(_, _)), _, CC_B()) => 20 
  case CC_D((_,_), CC_B()) => 21 
  case CC_E(_, CC_A(CC_C(_, _, _), CC_A(_, _))) => 22 
  case CC_E(_, CC_A(CC_D(_, _), CC_A(_, _))) => 23 
  case CC_E(_, CC_A(CC_E(_, _), CC_A(_, _))) => 24 
  case CC_E(_, CC_A(CC_C(_, _, _), CC_B())) => 25 
  case CC_E(_, CC_A(CC_D(_, _), CC_B())) => 26 
  case CC_E(_, CC_A(CC_E(_, _), CC_B())) => 27 
  case CC_E(_, CC_B()) => 28 
}
}