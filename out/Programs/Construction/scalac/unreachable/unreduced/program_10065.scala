package Program_4 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: Boolean) extends T_A[Char, C]
case class CC_B[D]() extends T_A[Char, D]
case class CC_C[E](a: (T_A[Char, Char],T_A[Char, Byte]), b: T_A[Char, E], c: T_A[E, E]) extends T_A[Char, E]

val v_a: T_A[Char, Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B() => 1 
  case CC_C((CC_A(_, _),CC_A(_, _)), CC_A(_, _), _) => 2 
  case CC_C((CC_A(_, _),CC_B()), CC_A(_, _), _) => 3 
  case CC_C((CC_A(_, _),CC_C(_, _, _)), CC_A(_, _), _) => 4 
  case CC_C((CC_B(),CC_A(_, _)), CC_A(_, _), _) => 5 
  case CC_C((CC_B(),CC_B()), CC_A(_, _), _) => 6 
  case CC_C((CC_B(),CC_C(_, _, _)), CC_A(_, _), _) => 7 
  case CC_C((CC_C(_, _, _),CC_A(_, _)), CC_A(_, _), _) => 8 
  case CC_C((CC_C(_, _, _),CC_B()), CC_A(_, _), _) => 9 
  case CC_C((CC_C(_, _, _),CC_C(_, _, _)), CC_A(_, _), _) => 10 
  case CC_C((CC_A(_, _),CC_A(_, _)), CC_B(), _) => 11 
  case CC_C((CC_A(_, _),CC_B()), CC_B(), _) => 12 
  case CC_C((CC_A(_, _),CC_C(_, _, _)), CC_B(), _) => 13 
  case CC_C((CC_B(),CC_A(_, _)), CC_B(), _) => 14 
  case CC_C((CC_B(),CC_B()), CC_B(), _) => 15 
  case CC_C((CC_B(),CC_C(_, _, _)), CC_B(), _) => 16 
  case CC_C((CC_C(_, _, _),CC_B()), CC_B(), _) => 17 
  case CC_C((CC_C(_, _, _),CC_C(_, _, _)), CC_B(), _) => 18 
  case CC_C((CC_A(_, _),CC_A(_, _)), CC_C(_, _, _), _) => 19 
  case CC_C((CC_A(_, _),CC_B()), CC_C(_, _, _), _) => 20 
  case CC_C((CC_A(_, _),CC_C(_, _, _)), CC_C(_, _, _), _) => 21 
  case CC_C((CC_B(),CC_A(_, _)), CC_C(_, _, _), _) => 22 
  case CC_C((CC_B(),CC_B()), CC_C(_, _, _), _) => 23 
  case CC_C((CC_B(),CC_C(_, _, _)), CC_C(_, _, _), _) => 24 
  case CC_C((CC_C(_, _, _),CC_A(_, _)), CC_C(_, _, _), _) => 25 
  case CC_C((CC_C(_, _, _),CC_B()), CC_C(_, _, _), _) => 26 
  case CC_C((CC_C(_, _, _),CC_C(_, _, _)), CC_C(_, _, _), _) => 27 
}
}
// This is not matched: CC_C((CC_C(_, _, _),CC_A(_, _)), CC_B(), _)