package Program_9 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: (T_A,T_A), b: Byte, c: Byte) extends T_A
case class CC_B() extends T_A
case class CC_C() extends T_A
case class CC_D[C, D](a: C, b: T_A) extends T_B[D, C]
case class CC_E[E, F]() extends T_B[E, F]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A((CC_A(_, _, _),CC_A(_, _, _)), _, 0) => 0 
  case CC_A((CC_A(_, _, _),CC_B()), _, 0) => 1 
  case CC_A((CC_A(_, _, _),CC_C()), _, 0) => 2 
  case CC_A((CC_B(),CC_A(_, _, _)), _, 0) => 3 
  case CC_A((CC_B(),CC_B()), _, 0) => 4 
  case CC_A((CC_B(),CC_C()), _, 0) => 5 
  case CC_A((CC_C(),CC_A(_, _, _)), _, 0) => 6 
  case CC_A((CC_C(),CC_B()), _, 0) => 7 
  case CC_A((CC_C(),CC_C()), _, 0) => 8 
  case CC_A((CC_A(_, _, _),CC_A(_, _, _)), _, _) => 9 
  case CC_A((CC_A(_, _, _),CC_B()), _, _) => 10 
  case CC_A((CC_A(_, _, _),CC_C()), _, _) => 11 
  case CC_A((CC_B(),CC_A(_, _, _)), _, _) => 12 
  case CC_A((CC_B(),CC_B()), _, _) => 13 
  case CC_A((CC_B(),CC_C()), _, _) => 14 
  case CC_A((CC_C(),CC_A(_, _, _)), _, _) => 15 
  case CC_A((CC_C(),CC_B()), _, _) => 16 
  case CC_B() => 17 
  case CC_C() => 18 
}
}
// This is not matched: CC_A((CC_C(),CC_C()), _, _)