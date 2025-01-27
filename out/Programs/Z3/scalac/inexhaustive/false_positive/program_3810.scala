package Program_15 

package Program_0 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_A, b: T_A) extends T_A
case class CC_B[C](a: (T_A,CC_A), b: Byte, c: T_A) extends T_A
case class CC_C(a: CC_B[CC_A]) extends T_A

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_C(_) => 0 
  case CC_A(_, CC_B(_, _, _)) => 1 
  case CC_A(CC_B(_, _, _), CC_C(_)) => 2 
  case CC_A(CC_A(_, _), CC_B(_, _, _)) => 3 
  case CC_A(CC_A(_, _), _) => 4 
  case CC_A(CC_C(_), CC_C(_)) => 5 
  case CC_A(CC_A(_, _), CC_C(_)) => 6 
  case CC_A(CC_C(_), _) => 7 
  case CC_A(CC_B(_, _, _), CC_B(_, _, _)) => 8 
  case CC_A(CC_A(_, _), CC_A(_, _)) => 9 
  case CC_A(CC_B(_, _, _), _) => 10 
  case CC_A(_, CC_C(_)) => 11 
  case CC_A(CC_B(_, _, _), CC_A(_, _)) => 12 
  case CC_B((CC_B(_, _, _),CC_A(_, _)), 0, CC_B(_, _, _)) => 13 
  case CC_B(_, _, _) => 14 
  case CC_B((CC_A(_, _),CC_A(_, _)), _, CC_B(_, _, _)) => 15 
  case CC_B((CC_B(_, _, _),CC_A(_, _)), 0, CC_A(_, _)) => 16 
  case CC_B(_, 0, CC_A(_, _)) => 17 
  case CC_B((CC_A(_, _),CC_A(_, _)), _, CC_A(_, _)) => 18 
  case CC_B((CC_B(_, _, _),CC_A(_, _)), _, CC_C(_)) => 19 
  case CC_B((CC_A(_, _),CC_A(_, _)), 0, CC_A(_, _)) => 20 
  case CC_B((CC_A(_, _),CC_A(_, _)), 0, _) => 21 
  case CC_B((CC_B(_, _, _),CC_A(_, _)), 0, _) => 22 
  case CC_B((CC_A(_, _),CC_A(_, _)), _, _) => 23 
  case CC_B((CC_C(_),CC_A(_, _)), 0, CC_B(_, _, _)) => 24 
  case CC_B((CC_C(_),CC_A(_, _)), _, CC_A(_, _)) => 25 
  case CC_B((CC_A(_, _),CC_A(_, _)), 0, CC_C(_)) => 26 
  case CC_B(_, _, CC_A(_, _)) => 27 
  case CC_B(_, 0, CC_B(_, _, _)) => 28 
  case CC_B(_, 0, CC_C(_)) => 29 
  case CC_B(_, _, CC_C(_)) => 30 
  case CC_B((CC_C(_),CC_A(_, _)), 0, CC_A(_, _)) => 31 
  case CC_B((CC_C(_),CC_A(_, _)), _, _) => 32 
}
}
// This is not matched: (CC_A (CC_B T_A Wildcard Byte Wildcard T_A) (CC_A Wildcard Wildcard T_A) T_A)
// This is not matched: (CC_B Wildcard Wildcard Wildcard (T_A (T_A Char)))