package Program_15 

package Program_0 

object Test {
sealed trait T_A
sealed trait T_B
case class CC_A(a: T_B) extends T_A
case class CC_B(a: CC_A, b: CC_A) extends T_A
case class CC_C(a: T_A, b: T_A) extends T_A
case class CC_D[A](a: CC_C, b: T_A, c: T_A) extends T_B
case class CC_E(a: (CC_A,T_A), b: (CC_B,T_B)) extends T_B
case class CC_F(a: (CC_C,CC_A)) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_F((CC_C(_, _),CC_A(_))) => 0 
  case CC_D(_, CC_A(_), _) => 1 
  case CC_D(_, CC_B(_, _), CC_B(_, _)) => 2 
  case CC_D(CC_C(_, _), CC_A(_), _) => 3 
  case CC_D(_, CC_C(_, _), _) => 4 
  case CC_D(_, CC_A(_), CC_C(_, _)) => 5 
  case CC_D(_, _, CC_C(_, _)) => 6 
  case CC_D(_, _, CC_A(_)) => 7 
  case CC_D(CC_C(_, _), CC_C(_, _), CC_B(_, _)) => 8 
  case CC_D(CC_C(_, _), CC_C(_, _), _) => 9 
  case CC_D(CC_C(_, _), _, CC_C(_, _)) => 10 
  case CC_D(CC_C(_, _), CC_A(_), CC_C(_, _)) => 11 
  case CC_D(CC_C(_, _), CC_A(_), CC_A(_)) => 12 
  case CC_D(CC_C(_, _), CC_B(_, _), CC_C(_, _)) => 13 
  case CC_D(_, CC_C(_, _), CC_B(_, _)) => 14 
  case CC_D(CC_C(_, _), _, _) => 15 
  case CC_D(_, CC_C(_, _), CC_C(_, _)) => 16 
  case CC_D(_, CC_A(_), CC_B(_, _)) => 17 
  case CC_D(CC_C(_, _), _, CC_A(_)) => 18 
  case CC_D(CC_C(_, _), _, CC_B(_, _)) => 19 
  case CC_D(CC_C(_, _), CC_B(_, _), CC_B(_, _)) => 20 
  case CC_D(_, CC_C(_, _), CC_A(_)) => 21 
  case CC_D(CC_C(_, _), CC_C(_, _), CC_A(_)) => 22 
  case CC_D(CC_C(_, _), CC_C(_, _), CC_C(_, _)) => 23 
  case CC_D(_, _, _) => 24 
  case CC_D(CC_C(_, _), CC_B(_, _), _) => 25 
  case CC_D(_, _, CC_B(_, _)) => 26 
  case CC_D(CC_C(_, _), CC_B(_, _), CC_A(_)) => 27 
  case CC_D(_, CC_B(_, _), CC_C(_, _)) => 28 
  case CC_D(_, CC_B(_, _), CC_A(_)) => 29 
  case CC_D(_, CC_B(_, _), _) => 30 
  case CC_D(CC_C(_, _), CC_A(_), CC_B(_, _)) => 31 
  case CC_E((CC_A(_),CC_A(_)), (CC_B(_, _),CC_D(_, _, _))) => 32 
  case CC_E(_, (CC_B(_, _),CC_F(_))) => 33 
  case CC_E(_, (CC_B(_, _),CC_E(_, _))) => 34 
  case CC_E((CC_A(_),CC_A(_)), (CC_B(_, _),CC_F(_))) => 35 
  case CC_E((CC_A(_),CC_B(_, _)), (CC_B(_, _),CC_F(_))) => 36 
  case CC_E((CC_A(_),CC_C(_, _)), (CC_B(_, _),CC_E(_, _))) => 37 
  case CC_E(_, (CC_B(_, _),CC_D(_, _, _))) => 38 
  case CC_E((CC_A(_),CC_C(_, _)), (CC_B(_, _),CC_F(_))) => 39 
  case CC_E((CC_A(_),CC_A(_)), (CC_B(_, _),CC_E(_, _))) => 40 
  case CC_E((CC_A(_),CC_B(_, _)), (CC_B(_, _),CC_D(_, _, _))) => 41 
  case CC_E((CC_A(_),CC_C(_, _)), (CC_B(_, _),CC_D(_, _, _))) => 42 
  case CC_E((CC_A(_),CC_A(_)), _) => 43 
}
}
// This is not matched: (CC_D T_A
//      (CC_C Wildcard (CC_A (CC_F Wildcard T_B) T_A) T_A)
//      Wildcard
//      Wildcard
//      T_B)
// This is not matched: Pattern match is empty without constants