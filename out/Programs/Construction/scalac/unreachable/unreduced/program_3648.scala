package Program_27 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_A) extends T_A
case class CC_B(a: T_A, b: T_B[T_A, T_B[CC_A, CC_A]], c: (T_A,CC_A)) extends T_A
case class CC_C(a: T_B[CC_B, (CC_B,T_A)], b: T_B[(CC_A,Char), CC_B], c: T_B[CC_B, CC_B]) extends T_A
case class CC_D[C](a: Char, b: Char, c: CC_B) extends T_B[CC_C, C]
case class CC_E(a: CC_D[CC_A], b: Int) extends T_B[CC_C, CC_C]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_))) => 0 
  case CC_A(CC_A(CC_B(_, _, _))) => 1 
  case CC_A(CC_A(CC_C(_, _, _))) => 2 
  case CC_A(CC_B(CC_A(_), _, (_,_))) => 3 
  case CC_A(CC_B(CC_B(_, _, _), _, (_,_))) => 4 
  case CC_A(CC_B(CC_C(_, _, _), _, (_,_))) => 5 
  case CC_A(CC_C(_, _, _)) => 6 
  case CC_B(CC_A(CC_A(_)), _, (CC_A(_),CC_A(_))) => 7 
  case CC_B(CC_A(CC_A(_)), _, (CC_B(_, _, _),CC_A(_))) => 8 
  case CC_B(CC_A(CC_A(_)), _, (CC_C(_, _, _),CC_A(_))) => 9 
  case CC_B(CC_A(CC_B(_, _, _)), _, (CC_A(_),CC_A(_))) => 10 
  case CC_B(CC_A(CC_B(_, _, _)), _, (CC_B(_, _, _),CC_A(_))) => 11 
  case CC_B(CC_A(CC_B(_, _, _)), _, (CC_C(_, _, _),CC_A(_))) => 12 
  case CC_B(CC_A(CC_C(_, _, _)), _, (CC_A(_),CC_A(_))) => 13 
  case CC_B(CC_A(CC_C(_, _, _)), _, (CC_B(_, _, _),CC_A(_))) => 14 
  case CC_B(CC_A(CC_C(_, _, _)), _, (CC_C(_, _, _),CC_A(_))) => 15 
  case CC_B(CC_B(CC_A(_), _, _), _, (CC_A(_),CC_A(_))) => 16 
  case CC_B(CC_B(CC_A(_), _, _), _, (CC_B(_, _, _),CC_A(_))) => 17 
  case CC_B(CC_B(CC_A(_), _, _), _, (CC_C(_, _, _),CC_A(_))) => 18 
  case CC_B(CC_B(CC_B(_, _, _), _, _), _, (CC_A(_),CC_A(_))) => 19 
  case CC_B(CC_B(CC_B(_, _, _), _, _), _, (CC_B(_, _, _),CC_A(_))) => 20 
  case CC_B(CC_B(CC_B(_, _, _), _, _), _, (CC_C(_, _, _),CC_A(_))) => 21 
  case CC_B(CC_B(CC_C(_, _, _), _, _), _, (CC_A(_),CC_A(_))) => 22 
  case CC_B(CC_B(CC_C(_, _, _), _, _), _, (CC_B(_, _, _),CC_A(_))) => 23 
  case CC_B(CC_B(CC_C(_, _, _), _, _), _, (CC_C(_, _, _),CC_A(_))) => 24 
  case CC_B(CC_C(_, _, _), _, (CC_A(_),CC_A(_))) => 25 
  case CC_B(CC_C(_, _, _), _, (CC_B(_, _, _),CC_A(_))) => 26 
  case CC_B(CC_C(_, _, _), _, (CC_C(_, _, _),CC_A(_))) => 27 
  case CC_C(_, _, _) => 28 
}
}