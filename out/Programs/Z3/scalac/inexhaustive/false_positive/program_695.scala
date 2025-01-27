package Program_31 

package Program_2 

object Test {
sealed trait T_A
case class CC_A(a: (T_A,T_A), b: Boolean, c: T_A) extends T_A
case class CC_B() extends T_A
case class CC_C[A](a: CC_B, b: CC_B, c: Int) extends T_A

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C(CC_B(), _, _) => 1 
  case CC_A((CC_C(_, _, _),CC_A(_, _, _)), _, CC_A(_, _, _)) => 2 
  case CC_A((CC_A(_, _, _),CC_C(_, _, _)), _, CC_C(_, _, _)) => 3 
  case CC_A((CC_A(_, _, _),CC_C(_, _, _)), _, CC_A(_, _, _)) => 4 
  case CC_A((CC_B(),CC_A(_, _, _)), _, CC_C(_, _, _)) => 5 
  case CC_A((CC_A(_, _, _),CC_B()), _, _) => 6 
  case CC_A((CC_A(_, _, _),CC_B()), _, CC_A(_, _, _)) => 7 
  case CC_A((CC_B(),CC_B()), _, CC_C(_, _, _)) => 8 
  case CC_A((CC_A(_, _, _),CC_A(_, _, _)), _, CC_A(_, _, _)) => 9 
  case CC_A((CC_B(),CC_C(_, _, _)), _, _) => 10 
  case CC_A((CC_A(_, _, _),CC_A(_, _, _)), _, CC_B()) => 11 
  case CC_A((CC_C(_, _, _),CC_C(_, _, _)), _, CC_A(_, _, _)) => 12 
  case CC_A((CC_B(),CC_B()), _, _) => 13 
  case CC_A((CC_B(),CC_C(_, _, _)), _, CC_A(_, _, _)) => 14 
  case CC_A((CC_B(),CC_B()), _, CC_B()) => 15 
  case CC_A(_, _, CC_B()) => 16 
  case CC_A(_, _, _) => 17 
  case CC_A((CC_C(_, _, _),CC_B()), _, CC_B()) => 18 
  case CC_A((CC_C(_, _, _),CC_A(_, _, _)), _, _) => 19 
  case CC_A((CC_B(),CC_A(_, _, _)), _, CC_A(_, _, _)) => 20 
  case CC_A((CC_C(_, _, _),CC_A(_, _, _)), _, CC_C(_, _, _)) => 21 
  case CC_A((CC_B(),CC_B()), _, CC_A(_, _, _)) => 22 
  case CC_A((CC_C(_, _, _),CC_B()), _, CC_C(_, _, _)) => 23 
  case CC_A(_, _, CC_A(_, _, _)) => 24 
  case CC_A((CC_A(_, _, _),CC_B()), _, CC_B()) => 25 
  case CC_A((CC_B(),CC_C(_, _, _)), _, CC_C(_, _, _)) => 26 
}
}
// This is not matched: (CC_C T_A Wildcard Wildcard Wildcard T_A)
// This is not matched: (CC_B T_A)