package Program_22 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[T_A[(Char,Char), (Char,Char)], T_A[T_A[(Char,Char), (Char,Char)], T_A[(Char,Char), (Char,Char)]]], b: T_A[C, T_A[C, C]]) extends T_A[C, T_A[C, C]]
case class CC_B[E]() extends T_A[E, T_A[E, E]]
case class CC_C[F, G](a: T_A[F, T_A[F, F]], b: F) extends T_A[F, T_A[F, F]]

val v_a: T_A[Char, T_A[Char, Char]] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _), CC_A(_, _)) => 0 
  case CC_A(CC_A(_, _), CC_B()) => 1 
  case CC_A(CC_A(_, _), CC_C(_, _)) => 2 
  case CC_A(CC_B(), CC_A(_, _)) => 3 
  case CC_A(CC_B(), CC_B()) => 4 
  case CC_A(CC_B(), CC_C(_, _)) => 5 
  case CC_A(CC_C(CC_A(_, _), _), CC_A(_, _)) => 6 
  case CC_A(CC_C(CC_A(_, _), _), CC_B()) => 7 
  case CC_A(CC_C(CC_A(_, _), _), CC_C(_, _)) => 8 
  case CC_A(CC_C(CC_B(), _), CC_A(_, _)) => 9 
  case CC_A(CC_C(CC_B(), _), CC_B()) => 10 
  case CC_A(CC_C(CC_B(), _), CC_C(_, _)) => 11 
  case CC_A(CC_C(CC_C(_, _), _), CC_A(_, _)) => 12 
  case CC_A(CC_C(CC_C(_, _), _), CC_B()) => 13 
  case CC_A(CC_C(CC_C(_, _), _), CC_C(_, _)) => 14 
  case CC_B() => 15 
  case CC_C(CC_A(CC_A(_, _), CC_A(_, _)), _) => 16 
  case CC_C(CC_A(CC_B(), CC_A(_, _)), _) => 17 
  case CC_C(CC_A(CC_C(_, _), CC_A(_, _)), _) => 18 
  case CC_C(CC_A(CC_A(_, _), CC_B()), _) => 19 
  case CC_C(CC_A(CC_B(), CC_B()), _) => 20 
  case CC_C(CC_A(CC_C(_, _), CC_B()), _) => 21 
  case CC_C(CC_A(CC_A(_, _), CC_C(_, _)), _) => 22 
  case CC_C(CC_A(CC_B(), CC_C(_, _)), _) => 23 
  case CC_C(CC_A(CC_C(_, _), CC_C(_, _)), _) => 24 
  case CC_C(CC_B(), _) => 25 
  case CC_C(CC_C(_, _), _) => 26 
}
}