package Program_15 

package Program_7 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: (T_A,T_A), b: Boolean, c: (Boolean,Byte)) extends T_A
case class CC_B(a: T_B[CC_A]) extends T_A
case class CC_C[B](a: B, b: Byte, c: T_B[B]) extends T_A
case class CC_D[C]() extends T_B[C]
case class CC_E[D](a: CC_C[D]) extends T_B[D]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_C(_, _, CC_E(_)) => 0 
  case CC_C(_, _, _) => 1 
  case CC_A((CC_A(_, _, _),CC_A(_, _, _)), _, (_,_)) => 2 
  case CC_A((CC_A(_, _, _),CC_C(_, _, _)), _, _) => 3 
  case CC_A((CC_C(_, _, _),CC_B(_)), _, (_,_)) => 4 
  case CC_A((CC_B(_),CC_C(_, _, _)), _, (_,0)) => 5 
  case CC_A((CC_C(_, _, _),CC_C(_, _, _)), _, (_,0)) => 6 
  case CC_A((CC_C(_, _, _),CC_B(_)), _, (_,0)) => 7 
  case CC_A((CC_B(_),CC_C(_, _, _)), _, (_,_)) => 8 
  case CC_A((CC_A(_, _, _),CC_A(_, _, _)), _, (_,0)) => 9 
  case CC_A((CC_B(_),CC_B(_)), _, (_,0)) => 10 
  case CC_A((CC_A(_, _, _),CC_B(_)), _, _) => 11 
  case CC_A(_, _, _) => 12 
  case CC_A((CC_A(_, _, _),CC_C(_, _, _)), _, (_,0)) => 13 
  case CC_A((CC_A(_, _, _),CC_B(_)), _, (_,_)) => 14 
  case CC_A((CC_A(_, _, _),CC_A(_, _, _)), _, _) => 15 
  case CC_A((CC_A(_, _, _),CC_B(_)), _, (_,0)) => 16 
  case CC_A((CC_B(_),CC_A(_, _, _)), _, _) => 17 
  case CC_A((CC_C(_, _, _),CC_A(_, _, _)), _, (_,_)) => 18 
  case CC_A((CC_C(_, _, _),CC_C(_, _, _)), _, _) => 19 
  case CC_A((CC_B(_),CC_A(_, _, _)), _, (_,_)) => 20 
  case CC_A(_, _, (_,_)) => 21 
  case CC_A((CC_C(_, _, _),CC_C(_, _, _)), _, (_,_)) => 22 
  case CC_A((CC_C(_, _, _),CC_B(_)), _, _) => 23 
  case CC_A((CC_B(_),CC_B(_)), _, (_,_)) => 24 
  case CC_B(CC_E(_)) => 25 
  case CC_B(_) => 26 
}
}
// This is not matched: (CC_C T_A Wildcard Wildcard Wildcard T_A)
// This is not matched: Pattern match is empty without constants