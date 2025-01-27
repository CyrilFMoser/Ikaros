package Program_9 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: (T_A,T_A), b: T_A, c: (T_A,T_A)) extends T_A
case class CC_B(a: T_B[Byte, CC_A], b: CC_A) extends T_A
case class CC_C() extends T_A
case class CC_D[C]() extends T_B[CC_B, C]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A((CC_A(_, _, _),CC_B(_, _)), _, (CC_B(_, _),CC_B(_, _))) => 0 
  case CC_A((CC_B(_, _),CC_A(_, _, _)), CC_B(_, _), (CC_A(_, _, _),CC_C())) => 1 
  case CC_A((CC_B(_, _),CC_A(_, _, _)), CC_C(), (CC_B(_, _),CC_C())) => 2 
  case CC_A((CC_B(_, _),CC_B(_, _)), CC_C(), (CC_A(_, _, _),CC_B(_, _))) => 3 
  case CC_A((CC_B(_, _),CC_B(_, _)), _, (CC_C(),CC_C())) => 4 
  case CC_A((CC_B(_, _),CC_A(_, _, _)), CC_B(_, _), (CC_B(_, _),CC_C())) => 5 
  case CC_A((CC_C(),CC_C()), CC_C(), (CC_A(_, _, _),CC_B(_, _))) => 6 
  case CC_A((CC_A(_, _, _),CC_B(_, _)), CC_C(), (CC_C(),CC_A(_, _, _))) => 7 
  case CC_A((CC_A(_, _, _),CC_C()), _, (CC_A(_, _, _),CC_A(_, _, _))) => 8 
  case CC_A((CC_B(_, _),CC_A(_, _, _)), CC_A(_, _, _), (CC_A(_, _, _),CC_B(_, _))) => 9 
  case CC_A((CC_B(_, _),CC_A(_, _, _)), CC_C(), _) => 10 
  case CC_A((CC_B(_, _),CC_B(_, _)), _, (CC_A(_, _, _),CC_A(_, _, _))) => 11 
  case CC_A((CC_A(_, _, _),CC_A(_, _, _)), CC_A(_, _, _), (CC_C(),CC_C())) => 12 
  case CC_A((CC_C(),CC_C()), CC_C(), _) => 13 
  case CC_A((CC_C(),CC_A(_, _, _)), CC_C(), (CC_C(),CC_A(_, _, _))) => 14 
  case CC_A((CC_B(_, _),CC_A(_, _, _)), _, (CC_A(_, _, _),CC_B(_, _))) => 15 
  case CC_A((CC_C(),CC_C()), _, (CC_A(_, _, _),CC_B(_, _))) => 16 
  case CC_A(_, _, (CC_C(),CC_A(_, _, _))) => 17 
  case CC_A((CC_C(),CC_A(_, _, _)), _, (CC_A(_, _, _),CC_B(_, _))) => 18 
  case CC_A((CC_C(),CC_C()), CC_A(_, _, _), (CC_B(_, _),CC_C())) => 19 
  case CC_A((CC_B(_, _),CC_A(_, _, _)), CC_B(_, _), (CC_C(),CC_A(_, _, _))) => 20 
  case CC_A((CC_B(_, _),CC_C()), _, (CC_C(),CC_A(_, _, _))) => 21 
  case CC_A((CC_A(_, _, _),CC_B(_, _)), CC_C(), (CC_C(),CC_C())) => 22 
  case CC_A((CC_B(_, _),CC_C()), CC_B(_, _), (CC_C(),CC_A(_, _, _))) => 23 
  case CC_A((CC_A(_, _, _),CC_A(_, _, _)), _, (CC_A(_, _, _),CC_B(_, _))) => 24 
  case CC_A((CC_C(),CC_B(_, _)), _, (CC_A(_, _, _),CC_A(_, _, _))) => 25 
  case CC_A((CC_B(_, _),CC_C()), CC_C(), (CC_B(_, _),CC_C())) => 26 
  case CC_A((CC_A(_, _, _),CC_A(_, _, _)), _, (CC_B(_, _),CC_C())) => 27 
  case CC_A((CC_B(_, _),CC_B(_, _)), CC_C(), (CC_C(),CC_A(_, _, _))) => 28 
}
}
// This is not matched: (CC_C T_A)