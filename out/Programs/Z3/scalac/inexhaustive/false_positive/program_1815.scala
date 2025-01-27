package Program_30 

package Program_4 

object Test {
sealed trait T_A
case class CC_A(a: T_A, b: Char) extends T_A
case class CC_B[A](a: (CC_A,T_A), b: CC_A, c: (CC_A,T_A)) extends T_A

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, 'x') => 0 
  case CC_A(CC_B(_, _, _), _) => 1 
  case CC_A(CC_A(_, _), _) => 2 
  case CC_B((CC_A(_, _),CC_B(_, _, _)), CC_A(_, _), (CC_A(_, _),CC_B(_, _, _))) => 3 
  case CC_B((CC_A(_, _),CC_A(_, _)), CC_A(_, _), (CC_A(_, _),CC_B(_, _, _))) => 4 
  case CC_B((CC_A(_, _),CC_B(_, _, _)), _, (CC_A(_, _),CC_A(_, _))) => 5 
  case CC_B((CC_A(_, _),CC_B(_, _, _)), _, _) => 6 
  case CC_B(_, _, (CC_A(_, _),CC_B(_, _, _))) => 7 
  case CC_B(_, CC_A(_, _), (CC_A(_, _),CC_A(_, _))) => 8 
  case CC_B((CC_A(_, _),CC_B(_, _, _)), CC_A(_, _), (CC_A(_, _),CC_A(_, _))) => 9 
  case CC_B(_, CC_A(_, _), _) => 10 
  case CC_B(_, _, _) => 11 
  case CC_B((CC_A(_, _),CC_B(_, _, _)), CC_A(_, _), _) => 12 
  case CC_B((CC_A(_, _),CC_A(_, _)), _, (CC_A(_, _),CC_B(_, _, _))) => 13 
  case CC_B((CC_A(_, _),CC_B(_, _, _)), _, (CC_A(_, _),CC_B(_, _, _))) => 14 
  case CC_B((CC_A(_, _),CC_A(_, _)), CC_A(_, _), _) => 15 
}
}
// This is not matched: (CC_B (CC_A T_A T_A T_A) Wildcard Wildcard Wildcard T_A)
// This is not matched: (CC_B Boolean (T_A (T_A Char)))