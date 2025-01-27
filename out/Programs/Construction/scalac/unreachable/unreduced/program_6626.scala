package Program_29 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C]() extends T_A[Char, C]
case class CC_B[D]() extends T_A[Char, D]
case class CC_C[E](a: (T_A[Char, Byte],T_A[Char, T_B]), b: T_A[E, E], c: E) extends T_A[Char, E]
case class CC_D[F](a: T_B, b: (CC_A[T_B],Boolean)) extends T_B
case class CC_E() extends T_B
case class CC_F(a: CC_E, b: Char, c: T_A[Char, (T_B,CC_E)]) extends T_B

val v_a: T_A[Char, Int] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_C((CC_A(),CC_A()), _, 12) => 1 
  case CC_C((CC_A(),CC_A()), _, _) => 2 
  case CC_C((CC_A(),CC_B()), _, 12) => 3 
  case CC_C((CC_A(),CC_B()), _, _) => 4 
  case CC_C((CC_A(),CC_C(_, _, _)), _, 12) => 5 
  case CC_C((CC_A(),CC_C(_, _, _)), _, _) => 6 
  case CC_C((CC_B(),CC_A()), _, 12) => 7 
  case CC_C((CC_B(),CC_A()), _, _) => 8 
  case CC_C((CC_B(),CC_B()), _, 12) => 9 
  case CC_C((CC_B(),CC_B()), _, _) => 10 
  case CC_C((CC_B(),CC_C(_, _, _)), _, 12) => 11 
  case CC_C((CC_B(),CC_C(_, _, _)), _, _) => 12 
  case CC_C((CC_C(_, _, _),CC_A()), _, 12) => 13 
  case CC_C((CC_C(_, _, _),CC_A()), _, _) => 14 
  case CC_C((CC_C(_, _, _),CC_B()), _, 12) => 15 
  case CC_C((CC_C(_, _, _),CC_B()), _, _) => 16 
  case CC_C((CC_C(_, _, _),CC_C(_, _, _)), _, 12) => 17 
  case CC_C((CC_C(_, _, _),CC_C(_, _, _)), _, _) => 18 
}
}
// This is not matched: CC_B()