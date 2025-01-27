package Program_8 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: (T_A,T_A), b: T_A, c: (T_A,T_A)) extends T_A
case class CC_B(a: T_B[Byte, CC_A], b: CC_A) extends T_A
case class CC_C() extends T_A
case class CC_D[C]() extends T_B[CC_B, C]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_B(_, _) => 0 
  case CC_A((CC_C(),CC_B(_, _)), CC_C(), _) => 1 
  case CC_A((CC_C(),CC_A(_, _, _)), CC_B(_, _), (CC_C(),CC_B(_, _))) => 2 
  case CC_A((CC_A(_, _, _),CC_B(_, _)), CC_B(_, _), (CC_B(_, _),CC_A(_, _, _))) => 3 
  case CC_A((CC_A(_, _, _),CC_B(_, _)), CC_A(_, _, _), (CC_C(),CC_C())) => 4 
  case CC_A(_, CC_C(), (CC_A(_, _, _),CC_C())) => 5 
  case CC_A((CC_C(),CC_C()), CC_B(_, _), (CC_A(_, _, _),CC_B(_, _))) => 6 
  case CC_A((CC_B(_, _),CC_B(_, _)), CC_B(_, _), (CC_C(),CC_A(_, _, _))) => 7 
  case CC_A((CC_A(_, _, _),CC_A(_, _, _)), CC_B(_, _), (CC_A(_, _, _),CC_B(_, _))) => 8 
  case CC_A((CC_C(),CC_A(_, _, _)), _, (CC_A(_, _, _),CC_C())) => 9 
  case CC_A((CC_C(),CC_C()), CC_B(_, _), (CC_B(_, _),CC_C())) => 10 
  case CC_A((CC_B(_, _),CC_B(_, _)), _, (CC_B(_, _),CC_A(_, _, _))) => 11 
  case CC_A((CC_C(),CC_A(_, _, _)), CC_C(), _) => 12 
  case CC_A((CC_B(_, _),CC_B(_, _)), _, (CC_C(),CC_A(_, _, _))) => 13 
  case CC_A((CC_B(_, _),CC_A(_, _, _)), CC_B(_, _), (CC_A(_, _, _),CC_A(_, _, _))) => 14 
  case CC_A((CC_B(_, _),CC_A(_, _, _)), CC_B(_, _), (CC_C(),CC_C())) => 15 
  case CC_A((CC_B(_, _),CC_A(_, _, _)), _, (CC_C(),CC_B(_, _))) => 16 
  case CC_A((CC_B(_, _),CC_B(_, _)), _, _) => 17 
  case CC_A((CC_C(),CC_C()), CC_A(_, _, _), (CC_A(_, _, _),CC_A(_, _, _))) => 18 
  case CC_A((CC_C(),CC_B(_, _)), CC_A(_, _, _), (CC_A(_, _, _),CC_B(_, _))) => 19 
  case CC_A((CC_C(),CC_A(_, _, _)), CC_A(_, _, _), (CC_C(),CC_A(_, _, _))) => 20 
  case CC_A((CC_C(),CC_B(_, _)), CC_A(_, _, _), (CC_B(_, _),CC_C())) => 21 
  case CC_A((CC_A(_, _, _),CC_A(_, _, _)), CC_B(_, _), (CC_B(_, _),CC_C())) => 22 
  case CC_A((CC_C(),CC_A(_, _, _)), CC_B(_, _), (CC_C(),CC_A(_, _, _))) => 23 
  case CC_A((CC_C(),CC_C()), _, (CC_C(),CC_C())) => 24 
  case CC_A((CC_C(),CC_A(_, _, _)), CC_C(), (CC_A(_, _, _),CC_C())) => 25 
  case CC_A((CC_C(),CC_A(_, _, _)), CC_C(), (CC_C(),CC_C())) => 26 
  case CC_A((CC_B(_, _),CC_A(_, _, _)), CC_C(), (CC_B(_, _),CC_A(_, _, _))) => 27 
  case CC_A((CC_B(_, _),CC_A(_, _, _)), CC_C(), (CC_A(_, _, _),CC_A(_, _, _))) => 28 
  case CC_A((CC_C(),CC_A(_, _, _)), CC_A(_, _, _), (CC_C(),CC_C())) => 29 
  case CC_A((CC_C(),CC_C()), _, (CC_A(_, _, _),CC_C())) => 30 
  case CC_A((CC_C(),CC_A(_, _, _)), CC_B(_, _), (CC_A(_, _, _),CC_B(_, _))) => 31 
  case CC_A((CC_A(_, _, _),CC_B(_, _)), CC_C(), (CC_C(),CC_B(_, _))) => 32 
  case CC_A((CC_A(_, _, _),CC_C()), CC_C(), (CC_A(_, _, _),CC_B(_, _))) => 33 
  case CC_A((CC_B(_, _),CC_C()), CC_C(), (CC_A(_, _, _),CC_B(_, _))) => 34 
  case CC_A((CC_A(_, _, _),CC_C()), CC_C(), (CC_C(),CC_C())) => 35 
  case CC_A((CC_A(_, _, _),CC_A(_, _, _)), CC_C(), (CC_B(_, _),CC_B(_, _))) => 36 
  case CC_A((CC_C(),CC_A(_, _, _)), CC_C(), (CC_B(_, _),CC_B(_, _))) => 37 
  case CC_A((CC_B(_, _),CC_A(_, _, _)), CC_A(_, _, _), (CC_A(_, _, _),CC_C())) => 38 
  case CC_A((CC_C(),CC_B(_, _)), _, (CC_C(),CC_B(_, _))) => 39 
  case CC_A((CC_B(_, _),CC_C()), CC_C(), (CC_A(_, _, _),CC_A(_, _, _))) => 40 
  case CC_A((CC_C(),CC_C()), CC_C(), (CC_B(_, _),CC_A(_, _, _))) => 41 
  case CC_A((CC_C(),CC_A(_, _, _)), _, (CC_C(),CC_C())) => 42 
  case CC_A((CC_B(_, _),CC_C()), CC_C(), _) => 43 
  case CC_A((CC_A(_, _, _),CC_A(_, _, _)), CC_A(_, _, _), (CC_A(_, _, _),CC_C())) => 44 
  case CC_A((CC_A(_, _, _),CC_A(_, _, _)), CC_C(), _) => 45 
  case CC_A((CC_A(_, _, _),CC_A(_, _, _)), CC_A(_, _, _), (CC_C(),CC_B(_, _))) => 46 
  case CC_A((CC_C(),CC_B(_, _)), CC_A(_, _, _), (CC_B(_, _),CC_B(_, _))) => 47 
  case CC_A(_, CC_A(_, _, _), (CC_A(_, _, _),CC_A(_, _, _))) => 48 
  case CC_A((CC_A(_, _, _),CC_A(_, _, _)), CC_A(_, _, _), (CC_B(_, _),CC_A(_, _, _))) => 49 
  case CC_A((CC_C(),CC_A(_, _, _)), _, (CC_C(),CC_A(_, _, _))) => 50 
  case CC_A((CC_A(_, _, _),CC_B(_, _)), _, (CC_A(_, _, _),CC_B(_, _))) => 51 
  case CC_A((CC_C(),CC_A(_, _, _)), _, _) => 52 
  case CC_A((CC_B(_, _),CC_C()), _, (CC_A(_, _, _),CC_A(_, _, _))) => 53 
  case CC_A((CC_B(_, _),CC_C()), CC_C(), (CC_C(),CC_C())) => 54 
  case CC_A((CC_A(_, _, _),CC_A(_, _, _)), CC_C(), (CC_B(_, _),CC_A(_, _, _))) => 55 
  case CC_A((CC_B(_, _),CC_B(_, _)), CC_A(_, _, _), (CC_A(_, _, _),CC_C())) => 56 
  case CC_A(_, CC_A(_, _, _), (CC_A(_, _, _),CC_B(_, _))) => 57 
  case CC_A((CC_A(_, _, _),CC_C()), CC_B(_, _), (CC_C(),CC_C())) => 58 
  case CC_A((CC_B(_, _),CC_C()), CC_C(), (CC_B(_, _),CC_B(_, _))) => 59 
  case CC_A((CC_C(),CC_C()), CC_A(_, _, _), (CC_B(_, _),CC_B(_, _))) => 60 
  case CC_A((CC_C(),CC_B(_, _)), CC_C(), (CC_C(),CC_C())) => 61 
  case CC_A((CC_A(_, _, _),CC_B(_, _)), CC_A(_, _, _), (CC_A(_, _, _),CC_A(_, _, _))) => 62 
  case CC_A((CC_A(_, _, _),CC_A(_, _, _)), CC_A(_, _, _), (CC_B(_, _),CC_B(_, _))) => 63 
  case CC_A((CC_A(_, _, _),CC_B(_, _)), _, (CC_C(),CC_A(_, _, _))) => 64 
  case CC_A((CC_A(_, _, _),CC_A(_, _, _)), CC_B(_, _), (CC_C(),CC_A(_, _, _))) => 65 
  case CC_A((CC_A(_, _, _),CC_A(_, _, _)), CC_C(), (CC_C(),CC_B(_, _))) => 66 
  case CC_A((CC_C(),CC_B(_, _)), _, _) => 67 
  case CC_A((CC_C(),CC_C()), CC_A(_, _, _), (CC_C(),CC_A(_, _, _))) => 68 
  case CC_A(_, _, (CC_B(_, _),CC_C())) => 69 
  case CC_A(_, CC_B(_, _), (CC_A(_, _, _),CC_B(_, _))) => 70 
  case CC_A((CC_C(),CC_A(_, _, _)), CC_A(_, _, _), (CC_A(_, _, _),CC_C())) => 71 
  case CC_A((CC_B(_, _),CC_B(_, _)), CC_B(_, _), (CC_A(_, _, _),CC_B(_, _))) => 72 
  case CC_A((CC_B(_, _),CC_C()), _, (CC_B(_, _),CC_A(_, _, _))) => 73 
}
}
// This is not matched: (CC_C T_A)