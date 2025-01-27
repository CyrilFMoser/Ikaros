package Program_5 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: (T_A,T_A), b: T_A, c: (T_A,T_A)) extends T_A
case class CC_B(a: T_B[Byte, CC_A], b: CC_A) extends T_A
case class CC_C() extends T_A
case class CC_D[C]() extends T_B[CC_B, C]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A((CC_C(),CC_C()), CC_C(), (CC_A(_, _, _),CC_A(_, _, _))) => 0 
  case CC_A((CC_C(),CC_C()), CC_C(), (CC_C(),CC_A(_, _, _))) => 1 
  case CC_A((CC_B(_, _),CC_B(_, _)), _, (CC_A(_, _, _),CC_B(_, _))) => 2 
  case CC_A((CC_B(_, _),CC_C()), CC_A(_, _, _), (CC_B(_, _),CC_C())) => 3 
  case CC_A((CC_B(_, _),CC_C()), CC_A(_, _, _), (CC_C(),CC_B(_, _))) => 4 
  case CC_A((CC_C(),CC_C()), _, (CC_C(),CC_A(_, _, _))) => 5 
  case CC_A((CC_C(),CC_A(_, _, _)), CC_A(_, _, _), _) => 6 
  case CC_A((CC_A(_, _, _),CC_C()), CC_C(), (CC_B(_, _),CC_A(_, _, _))) => 7 
  case CC_A((CC_A(_, _, _),CC_C()), CC_B(_, _), (CC_C(),CC_A(_, _, _))) => 8 
  case CC_A((CC_A(_, _, _),CC_B(_, _)), CC_B(_, _), (CC_A(_, _, _),CC_A(_, _, _))) => 9 
  case CC_A((CC_A(_, _, _),CC_A(_, _, _)), CC_C(), (CC_B(_, _),CC_C())) => 10 
  case CC_A((CC_C(),CC_B(_, _)), CC_A(_, _, _), (CC_B(_, _),CC_A(_, _, _))) => 11 
  case CC_A(_, _, (CC_C(),CC_C())) => 12 
  case CC_A((CC_A(_, _, _),CC_C()), _, (CC_C(),CC_B(_, _))) => 13 
  case CC_A((CC_A(_, _, _),CC_A(_, _, _)), CC_A(_, _, _), _) => 14 
  case CC_A(_, _, (CC_A(_, _, _),CC_B(_, _))) => 15 
  case CC_A(_, CC_B(_, _), (CC_B(_, _),CC_C())) => 16 
  case CC_A((CC_C(),CC_B(_, _)), CC_C(), (CC_C(),CC_A(_, _, _))) => 17 
  case CC_A((CC_C(),CC_A(_, _, _)), CC_C(), (CC_A(_, _, _),CC_A(_, _, _))) => 18 
  case CC_A((CC_C(),CC_B(_, _)), CC_B(_, _), (CC_A(_, _, _),CC_C())) => 19 
  case CC_A((CC_C(),CC_B(_, _)), CC_B(_, _), (CC_A(_, _, _),CC_A(_, _, _))) => 20 
  case CC_A((CC_B(_, _),CC_C()), CC_A(_, _, _), (CC_B(_, _),CC_B(_, _))) => 21 
  case CC_A((CC_A(_, _, _),CC_A(_, _, _)), _, (CC_B(_, _),CC_B(_, _))) => 22 
  case CC_A((CC_C(),CC_C()), CC_A(_, _, _), (CC_B(_, _),CC_A(_, _, _))) => 23 
  case CC_A((CC_C(),CC_C()), _, _) => 24 
  case CC_A((CC_B(_, _),CC_B(_, _)), CC_A(_, _, _), (CC_B(_, _),CC_B(_, _))) => 25 
  case CC_A((CC_A(_, _, _),CC_A(_, _, _)), _, (CC_C(),CC_B(_, _))) => 26 
  case CC_A((CC_A(_, _, _),CC_C()), CC_A(_, _, _), (CC_C(),CC_A(_, _, _))) => 27 
  case CC_A((CC_B(_, _),CC_C()), _, (CC_C(),CC_C())) => 28 
  case CC_A((CC_B(_, _),CC_B(_, _)), CC_A(_, _, _), (CC_A(_, _, _),CC_B(_, _))) => 29 
  case CC_A((CC_C(),CC_B(_, _)), CC_A(_, _, _), (CC_A(_, _, _),CC_C())) => 30 
  case CC_A(_, CC_A(_, _, _), (CC_B(_, _),CC_A(_, _, _))) => 31 
  case CC_A(_, CC_A(_, _, _), (CC_A(_, _, _),CC_C())) => 32 
  case CC_A((CC_C(),CC_A(_, _, _)), CC_B(_, _), (CC_B(_, _),CC_C())) => 33 
  case CC_A((CC_B(_, _),CC_C()), CC_A(_, _, _), (CC_C(),CC_C())) => 34 
  case CC_A((CC_B(_, _),CC_A(_, _, _)), CC_B(_, _), _) => 35 
  case CC_A(_, CC_C(), (CC_A(_, _, _),CC_A(_, _, _))) => 36 
  case CC_A(_, CC_A(_, _, _), (CC_C(),CC_B(_, _))) => 37 
}
}
// This is not matched: (CC_C T_A)