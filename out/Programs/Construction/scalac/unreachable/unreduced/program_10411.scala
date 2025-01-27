package Program_29 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[T_B[T_A, T_A], Byte], b: T_A) extends T_A
case class CC_B(a: CC_A, b: (T_B[CC_A, CC_A],T_A), c: CC_A) extends T_A
case class CC_C(a: T_A, b: T_B[Char, CC_A], c: (T_A,T_B[CC_B, CC_A])) extends T_A
case class CC_D[C](a: T_B[C, C], b: CC_B, c: (T_B[CC_B, (Int,Char)],CC_B)) extends T_B[CC_B, C]
case class CC_E[D](a: CC_D[D], b: CC_D[D]) extends T_B[CC_B, D]
case class CC_F[E]() extends T_B[CC_B, E]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, _, _) => 1 
  case CC_C(CC_A(_, CC_A(_, _)), _, (CC_A(_, _),CC_D(_, _, _))) => 2 
  case CC_C(CC_A(_, CC_B(_, _, _)), _, (CC_A(_, _),CC_D(_, _, _))) => 3 
  case CC_C(CC_A(_, CC_C(_, _, _)), _, (CC_A(_, _),CC_D(_, _, _))) => 4 
  case CC_C(CC_B(CC_A(_, _), (_,_), CC_A(_, _)), _, (CC_A(_, _),CC_D(_, _, _))) => 5 
  case CC_C(CC_C(CC_A(_, _), _, _), _, (CC_A(_, _),CC_D(_, _, _))) => 6 
  case CC_C(CC_C(CC_B(_, _, _), _, _), _, (CC_A(_, _),CC_D(_, _, _))) => 7 
  case CC_C(CC_C(CC_C(_, _, _), _, _), _, (CC_A(_, _),CC_D(_, _, _))) => 8 
  case CC_C(CC_A(_, CC_A(_, _)), _, (CC_A(_, _),CC_E(_, _))) => 9 
  case CC_C(CC_A(_, CC_B(_, _, _)), _, (CC_A(_, _),CC_E(_, _))) => 10 
  case CC_C(CC_A(_, CC_C(_, _, _)), _, (CC_A(_, _),CC_E(_, _))) => 11 
  case CC_C(CC_B(CC_A(_, _), (_,_), CC_A(_, _)), _, (CC_A(_, _),CC_E(_, _))) => 12 
  case CC_C(CC_C(CC_A(_, _), _, _), _, (CC_A(_, _),CC_E(_, _))) => 13 
  case CC_C(CC_C(CC_B(_, _, _), _, _), _, (CC_A(_, _),CC_E(_, _))) => 14 
  case CC_C(CC_C(CC_C(_, _, _), _, _), _, (CC_A(_, _),CC_E(_, _))) => 15 
  case CC_C(CC_A(_, CC_A(_, _)), _, (CC_A(_, _),CC_F())) => 16 
  case CC_C(CC_A(_, CC_B(_, _, _)), _, (CC_A(_, _),CC_F())) => 17 
  case CC_C(CC_A(_, CC_C(_, _, _)), _, (CC_A(_, _),CC_F())) => 18 
  case CC_C(CC_B(CC_A(_, _), (_,_), CC_A(_, _)), _, (CC_A(_, _),CC_F())) => 19 
  case CC_C(CC_C(CC_B(_, _, _), _, _), _, (CC_A(_, _),CC_F())) => 20 
  case CC_C(CC_C(CC_C(_, _, _), _, _), _, (CC_A(_, _),CC_F())) => 21 
  case CC_C(CC_A(_, CC_A(_, _)), _, (CC_B(_, _, _),CC_D(_, _, _))) => 22 
  case CC_C(CC_A(_, CC_B(_, _, _)), _, (CC_B(_, _, _),CC_D(_, _, _))) => 23 
  case CC_C(CC_A(_, CC_C(_, _, _)), _, (CC_B(_, _, _),CC_D(_, _, _))) => 24 
  case CC_C(CC_B(CC_A(_, _), (_,_), CC_A(_, _)), _, (CC_B(_, _, _),CC_D(_, _, _))) => 25 
  case CC_C(CC_C(CC_A(_, _), _, _), _, (CC_B(_, _, _),CC_D(_, _, _))) => 26 
  case CC_C(CC_C(CC_B(_, _, _), _, _), _, (CC_B(_, _, _),CC_D(_, _, _))) => 27 
  case CC_C(CC_C(CC_C(_, _, _), _, _), _, (CC_B(_, _, _),CC_D(_, _, _))) => 28 
  case CC_C(CC_A(_, CC_A(_, _)), _, (CC_B(_, _, _),CC_E(_, _))) => 29 
  case CC_C(CC_A(_, CC_B(_, _, _)), _, (CC_B(_, _, _),CC_E(_, _))) => 30 
  case CC_C(CC_A(_, CC_C(_, _, _)), _, (CC_B(_, _, _),CC_E(_, _))) => 31 
  case CC_C(CC_B(CC_A(_, _), (_,_), CC_A(_, _)), _, (CC_B(_, _, _),CC_E(_, _))) => 32 
  case CC_C(CC_C(CC_A(_, _), _, _), _, (CC_B(_, _, _),CC_E(_, _))) => 33 
  case CC_C(CC_C(CC_B(_, _, _), _, _), _, (CC_B(_, _, _),CC_E(_, _))) => 34 
  case CC_C(CC_C(CC_C(_, _, _), _, _), _, (CC_B(_, _, _),CC_E(_, _))) => 35 
  case CC_C(CC_A(_, CC_A(_, _)), _, (CC_B(_, _, _),CC_F())) => 36 
  case CC_C(CC_A(_, CC_B(_, _, _)), _, (CC_B(_, _, _),CC_F())) => 37 
  case CC_C(CC_A(_, CC_C(_, _, _)), _, (CC_B(_, _, _),CC_F())) => 38 
  case CC_C(CC_B(CC_A(_, _), (_,_), CC_A(_, _)), _, (CC_B(_, _, _),CC_F())) => 39 
  case CC_C(CC_C(CC_A(_, _), _, _), _, (CC_B(_, _, _),CC_F())) => 40 
  case CC_C(CC_C(CC_B(_, _, _), _, _), _, (CC_B(_, _, _),CC_F())) => 41 
  case CC_C(CC_C(CC_C(_, _, _), _, _), _, (CC_B(_, _, _),CC_F())) => 42 
  case CC_C(CC_A(_, CC_A(_, _)), _, (CC_C(_, _, _),CC_D(_, _, _))) => 43 
  case CC_C(CC_A(_, CC_B(_, _, _)), _, (CC_C(_, _, _),CC_D(_, _, _))) => 44 
  case CC_C(CC_A(_, CC_C(_, _, _)), _, (CC_C(_, _, _),CC_D(_, _, _))) => 45 
  case CC_C(CC_B(CC_A(_, _), (_,_), CC_A(_, _)), _, (CC_C(_, _, _),CC_D(_, _, _))) => 46 
  case CC_C(CC_C(CC_A(_, _), _, _), _, (CC_C(_, _, _),CC_D(_, _, _))) => 47 
  case CC_C(CC_C(CC_B(_, _, _), _, _), _, (CC_C(_, _, _),CC_D(_, _, _))) => 48 
  case CC_C(CC_C(CC_C(_, _, _), _, _), _, (CC_C(_, _, _),CC_D(_, _, _))) => 49 
  case CC_C(CC_A(_, CC_A(_, _)), _, (CC_C(_, _, _),CC_E(_, _))) => 50 
  case CC_C(CC_A(_, CC_B(_, _, _)), _, (CC_C(_, _, _),CC_E(_, _))) => 51 
  case CC_C(CC_A(_, CC_C(_, _, _)), _, (CC_C(_, _, _),CC_E(_, _))) => 52 
  case CC_C(CC_B(CC_A(_, _), (_,_), CC_A(_, _)), _, (CC_C(_, _, _),CC_E(_, _))) => 53 
  case CC_C(CC_C(CC_A(_, _), _, _), _, (CC_C(_, _, _),CC_E(_, _))) => 54 
  case CC_C(CC_C(CC_B(_, _, _), _, _), _, (CC_C(_, _, _),CC_E(_, _))) => 55 
  case CC_C(CC_C(CC_C(_, _, _), _, _), _, (CC_C(_, _, _),CC_E(_, _))) => 56 
  case CC_C(CC_A(_, CC_A(_, _)), _, (CC_C(_, _, _),CC_F())) => 57 
  case CC_C(CC_A(_, CC_B(_, _, _)), _, (CC_C(_, _, _),CC_F())) => 58 
  case CC_C(CC_A(_, CC_C(_, _, _)), _, (CC_C(_, _, _),CC_F())) => 59 
  case CC_C(CC_B(CC_A(_, _), (_,_), CC_A(_, _)), _, (CC_C(_, _, _),CC_F())) => 60 
  case CC_C(CC_C(CC_A(_, _), _, _), _, (CC_C(_, _, _),CC_F())) => 61 
  case CC_C(CC_C(CC_B(_, _, _), _, _), _, (CC_C(_, _, _),CC_F())) => 62 
  case CC_C(CC_C(CC_C(_, _, _), _, _), _, (CC_C(_, _, _),CC_F())) => 63 
}
}
// This is not matched: CC_C(CC_C(CC_A(_, _), _, _), _, (CC_A(_, _),CC_F()))