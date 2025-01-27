package Program_2 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A() extends T_A
case class CC_B(a: T_A, b: (CC_A,T_B[T_A, T_A]), c: CC_A) extends T_A
case class CC_C[C, D](a: T_B[C, T_A], b: T_B[D, T_A]) extends T_B[C, T_A]
case class CC_D[E](a: T_A, b: T_B[E, E], c: E) extends T_B[E, T_A]
case class CC_E() extends T_B[T_B[CC_C[Int, Boolean], T_A], T_A]

val v_a: T_B[T_B[T_B[CC_C[Int, Boolean], T_A], T_A], T_A] = null
val v_b: Int = v_a match{
  case CC_C(CC_C(CC_C(_, _), _), _) => 0 
  case CC_C(CC_C(CC_D(_, _, _), _), _) => 1 
  case CC_C(CC_D(_, _, _), _) => 2 
  case CC_D(CC_A(), _, CC_C(CC_C(_, _), _)) => 3 
  case CC_D(CC_A(), _, CC_C(CC_D(_, _, _), _)) => 4 
  case CC_D(CC_A(), _, CC_C(CC_E(), _)) => 5 
  case CC_D(CC_A(), _, CC_D(CC_A(), _, CC_C(_, _))) => 6 
  case CC_D(CC_A(), _, CC_D(CC_B(_, _, _), _, CC_C(_, _))) => 7 
  case CC_D(CC_A(), _, CC_D(CC_A(), _, CC_D(_, _, _))) => 8 
  case CC_D(CC_A(), _, CC_D(CC_B(_, _, _), _, CC_D(_, _, _))) => 9 
  case CC_D(CC_A(), _, CC_E()) => 10 
  case CC_D(CC_B(CC_A(), _, CC_A()), _, CC_C(CC_C(_, _), _)) => 11 
  case CC_D(CC_B(CC_A(), _, CC_A()), _, CC_C(CC_D(_, _, _), _)) => 12 
  case CC_D(CC_B(CC_A(), _, CC_A()), _, CC_C(CC_E(), _)) => 13 
  case CC_D(CC_B(CC_A(), _, CC_A()), _, CC_D(CC_B(_, _, _), _, CC_C(_, _))) => 14 
  case CC_D(CC_B(CC_A(), _, CC_A()), _, CC_D(CC_A(), _, CC_D(_, _, _))) => 15 
  case CC_D(CC_B(CC_A(), _, CC_A()), _, CC_D(CC_B(_, _, _), _, CC_D(_, _, _))) => 16 
  case CC_D(CC_B(CC_A(), _, CC_A()), _, CC_E()) => 17 
  case CC_D(CC_B(CC_B(_, _, _), _, CC_A()), _, CC_C(CC_C(_, _), _)) => 18 
  case CC_D(CC_B(CC_B(_, _, _), _, CC_A()), _, CC_C(CC_D(_, _, _), _)) => 19 
  case CC_D(CC_B(CC_B(_, _, _), _, CC_A()), _, CC_C(CC_E(), _)) => 20 
  case CC_D(CC_B(CC_B(_, _, _), _, CC_A()), _, CC_D(CC_A(), _, CC_C(_, _))) => 21 
  case CC_D(CC_B(CC_B(_, _, _), _, CC_A()), _, CC_D(CC_B(_, _, _), _, CC_C(_, _))) => 22 
  case CC_D(CC_B(CC_B(_, _, _), _, CC_A()), _, CC_D(CC_A(), _, CC_D(_, _, _))) => 23 
  case CC_D(CC_B(CC_B(_, _, _), _, CC_A()), _, CC_D(CC_B(_, _, _), _, CC_D(_, _, _))) => 24 
  case CC_D(CC_B(CC_B(_, _, _), _, CC_A()), _, CC_E()) => 25 
}
}
// This is not matched: CC_D(CC_B(CC_A(), _, CC_A()), _, CC_D(CC_A(), _, CC_C(_, _)))