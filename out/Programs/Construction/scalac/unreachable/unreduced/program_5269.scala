package Program_6 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_A, b: T_A) extends T_A
case class CC_B(a: T_A, b: T_B[CC_A, CC_A]) extends T_A
case class CC_C(a: (T_B[Int, Boolean],CC_B)) extends T_A
case class CC_D[C](a: CC_A, b: Char, c: Int) extends T_B[CC_A, C]
case class CC_E[D](a: T_A) extends T_B[CC_A, D]
case class CC_F[E]() extends T_B[CC_A, E]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_, _), CC_A(_, _)), _) => 0 
  case CC_A(CC_A(CC_B(_, _), CC_A(_, _)), _) => 1 
  case CC_A(CC_A(CC_C(_), CC_A(_, _)), _) => 2 
  case CC_A(CC_A(CC_A(_, _), CC_B(_, _)), _) => 3 
  case CC_A(CC_A(CC_B(_, _), CC_B(_, _)), _) => 4 
  case CC_A(CC_A(CC_C(_), CC_B(_, _)), _) => 5 
  case CC_A(CC_A(CC_A(_, _), CC_C(_)), _) => 6 
  case CC_A(CC_A(CC_B(_, _), CC_C(_)), _) => 7 
  case CC_A(CC_A(CC_C(_), CC_C(_)), _) => 8 
  case CC_A(CC_B(CC_A(_, _), CC_D(_, _, _)), _) => 9 
  case CC_A(CC_B(CC_B(_, _), CC_D(_, _, _)), _) => 10 
  case CC_A(CC_B(CC_C(_), CC_D(_, _, _)), _) => 11 
  case CC_A(CC_B(CC_A(_, _), CC_E(_)), _) => 12 
  case CC_A(CC_B(CC_B(_, _), CC_E(_)), _) => 13 
  case CC_A(CC_B(CC_C(_), CC_E(_)), _) => 14 
  case CC_A(CC_B(CC_A(_, _), CC_F()), _) => 15 
  case CC_A(CC_B(CC_B(_, _), CC_F()), _) => 16 
  case CC_A(CC_B(CC_C(_), CC_F()), _) => 17 
  case CC_A(CC_C((_,_)), _) => 18 
  case CC_B(CC_A(_, _), CC_D(_, _, _)) => 19 
  case CC_B(CC_A(_, _), CC_E(_)) => 20 
  case CC_B(CC_A(_, _), CC_F()) => 21 
  case CC_B(CC_B(CC_A(_, _), CC_D(_, _, _)), CC_D(_, _, _)) => 22 
  case CC_B(CC_B(CC_A(_, _), CC_D(_, _, _)), CC_E(_)) => 23 
  case CC_B(CC_B(CC_A(_, _), CC_D(_, _, _)), CC_F()) => 24 
  case CC_B(CC_B(CC_B(_, _), CC_D(_, _, _)), CC_D(_, _, _)) => 25 
  case CC_B(CC_B(CC_B(_, _), CC_D(_, _, _)), CC_E(_)) => 26 
  case CC_B(CC_B(CC_B(_, _), CC_D(_, _, _)), CC_F()) => 27 
  case CC_B(CC_B(CC_C(_), CC_D(_, _, _)), CC_D(_, _, _)) => 28 
  case CC_B(CC_B(CC_C(_), CC_D(_, _, _)), CC_E(_)) => 29 
  case CC_B(CC_B(CC_C(_), CC_D(_, _, _)), CC_F()) => 30 
  case CC_B(CC_B(CC_A(_, _), CC_E(_)), CC_D(_, _, _)) => 31 
  case CC_B(CC_B(CC_A(_, _), CC_E(_)), CC_E(_)) => 32 
  case CC_B(CC_B(CC_A(_, _), CC_E(_)), CC_F()) => 33 
  case CC_B(CC_B(CC_B(_, _), CC_E(_)), CC_D(_, _, _)) => 34 
  case CC_B(CC_B(CC_B(_, _), CC_E(_)), CC_E(_)) => 35 
  case CC_B(CC_B(CC_B(_, _), CC_E(_)), CC_F()) => 36 
  case CC_B(CC_B(CC_C(_), CC_E(_)), CC_D(_, _, _)) => 37 
  case CC_B(CC_B(CC_C(_), CC_E(_)), CC_E(_)) => 38 
  case CC_B(CC_B(CC_C(_), CC_E(_)), CC_F()) => 39 
  case CC_B(CC_B(CC_A(_, _), CC_F()), CC_D(_, _, _)) => 40 
  case CC_B(CC_B(CC_A(_, _), CC_F()), CC_E(_)) => 41 
  case CC_B(CC_B(CC_A(_, _), CC_F()), CC_F()) => 42 
  case CC_B(CC_B(CC_B(_, _), CC_F()), CC_D(_, _, _)) => 43 
  case CC_B(CC_B(CC_B(_, _), CC_F()), CC_E(_)) => 44 
  case CC_B(CC_B(CC_B(_, _), CC_F()), CC_F()) => 45 
  case CC_B(CC_B(CC_C(_), CC_F()), CC_D(_, _, _)) => 46 
  case CC_B(CC_B(CC_C(_), CC_F()), CC_E(_)) => 47 
  case CC_B(CC_B(CC_C(_), CC_F()), CC_F()) => 48 
  case CC_B(CC_C((_,_)), CC_D(_, _, _)) => 49 
  case CC_B(CC_C((_,_)), CC_E(_)) => 50 
  case CC_B(CC_C((_,_)), CC_F()) => 51 
  case CC_C((_,CC_B(_, _))) => 52 
}
}