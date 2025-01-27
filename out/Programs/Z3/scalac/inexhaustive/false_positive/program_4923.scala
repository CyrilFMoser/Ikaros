package Program_14 

package Program_5 

object Test {
sealed trait T_A
case class CC_A(a: (T_A,T_A), b: Char, c: T_A) extends T_A
case class CC_B[A]() extends T_A
case class CC_C(a: Byte) extends T_A

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C(0) => 1 
  case CC_C(_) => 2 
  case CC_A((CC_C(_),CC_C(_)), _, CC_C(_)) => 3 
  case CC_A((CC_B(),CC_B()), 'x', _) => 4 
  case CC_A((CC_A(_, _, _),CC_A(_, _, _)), _, CC_B()) => 5 
  case CC_A((CC_C(_),CC_A(_, _, _)), _, CC_A(_, _, _)) => 6 
  case CC_A((CC_C(_),CC_B()), _, CC_B()) => 7 
  case CC_A((CC_A(_, _, _),CC_B()), 'x', CC_C(_)) => 8 
  case CC_A((CC_B(),CC_B()), _, _) => 9 
  case CC_A((CC_C(_),CC_C(_)), 'x', CC_C(_)) => 10 
  case CC_A(_, _, _) => 11 
  case CC_A((CC_C(_),CC_A(_, _, _)), _, CC_C(_)) => 12 
  case CC_A((CC_B(),CC_C(_)), 'x', CC_C(_)) => 13 
  case CC_A((CC_C(_),CC_C(_)), 'x', CC_A(_, _, _)) => 14 
  case CC_A((CC_B(),CC_C(_)), 'x', CC_A(_, _, _)) => 15 
  case CC_A((CC_C(_),CC_B()), 'x', CC_A(_, _, _)) => 16 
  case CC_A((CC_A(_, _, _),CC_C(_)), 'x', CC_B()) => 17 
  case CC_A((CC_B(),CC_B()), 'x', CC_C(_)) => 18 
  case CC_A((CC_A(_, _, _),CC_A(_, _, _)), _, _) => 19 
  case CC_A((CC_A(_, _, _),CC_B()), 'x', CC_A(_, _, _)) => 20 
  case CC_A((CC_B(),CC_A(_, _, _)), 'x', CC_A(_, _, _)) => 21 
  case CC_A((CC_B(),CC_A(_, _, _)), _, CC_B()) => 22 
  case CC_A(_, 'x', CC_C(_)) => 23 
  case CC_A((CC_B(),CC_A(_, _, _)), _, CC_A(_, _, _)) => 24 
  case CC_A((CC_C(_),CC_C(_)), _, CC_B()) => 25 
  case CC_A((CC_A(_, _, _),CC_C(_)), _, CC_C(_)) => 26 
  case CC_A((CC_A(_, _, _),CC_C(_)), _, CC_A(_, _, _)) => 27 
  case CC_A((CC_A(_, _, _),CC_A(_, _, _)), _, CC_C(_)) => 28 
  case CC_A((CC_B(),CC_C(_)), _, _) => 29 
  case CC_A((CC_B(),CC_A(_, _, _)), 'x', _) => 30 
  case CC_A((CC_C(_),CC_A(_, _, _)), 'x', CC_B()) => 31 
  case CC_A(_, _, CC_A(_, _, _)) => 32 
  case CC_A((CC_C(_),CC_A(_, _, _)), 'x', _) => 33 
  case CC_A((CC_B(),CC_B()), _, CC_A(_, _, _)) => 34 
  case CC_A((CC_B(),CC_C(_)), 'x', _) => 35 
  case CC_A((CC_B(),CC_A(_, _, _)), 'x', CC_C(_)) => 36 
  case CC_A((CC_A(_, _, _),CC_A(_, _, _)), _, CC_A(_, _, _)) => 37 
  case CC_A((CC_A(_, _, _),CC_B()), _, _) => 38 
  case CC_A((CC_B(),CC_C(_)), 'x', CC_B()) => 39 
  case CC_A(_, _, CC_B()) => 40 
  case CC_A((CC_B(),CC_B()), 'x', CC_B()) => 41 
  case CC_A((CC_B(),CC_A(_, _, _)), _, _) => 42 
  case CC_A((CC_A(_, _, _),CC_A(_, _, _)), 'x', CC_C(_)) => 43 
  case CC_A((CC_C(_),CC_A(_, _, _)), _, CC_B()) => 44 
  case CC_A((CC_A(_, _, _),CC_A(_, _, _)), 'x', CC_B()) => 45 
}
}
// This is not matched: (CC_B T_A T_A)
// This is not matched: (CC_C (T_A (Tuple Byte Boolean)) (T_A (T_A (Tuple Byte Boolean))))