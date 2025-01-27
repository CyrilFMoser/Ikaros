package Program_13 

package Program_7 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_B[T_A]) extends T_A
case class CC_B[B](a: CC_A, b: B, c: T_A) extends T_A
case class CC_C(a: (T_A,T_A), b: CC_A, c: CC_B[T_A]) extends T_A
case class CC_D(a: CC_C) extends T_B[CC_A]
case class CC_E() extends T_B[T_A]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(CC_E()) => 0 
  case CC_B(CC_A(_), _, CC_C(_, _, _)) => 1 
  case CC_B(_, _, CC_C(_, _, _)) => 2 
  case CC_B(_, _, _) => 3 
  case CC_B(CC_A(_), _, CC_B(_, _, _)) => 4 
  case CC_C(_, CC_A(_), _) => 5 
  case CC_C((CC_B(_, _, _),CC_C(_, _, _)), _, CC_B(_, _, _)) => 6 
  case CC_C((CC_B(_, _, _),CC_A(_)), _, _) => 7 
  case CC_C((CC_A(_),CC_C(_, _, _)), _, _) => 8 
  case CC_C((CC_C(_, _, _),CC_A(_)), _, _) => 9 
  case CC_C(_, _, _) => 10 
  case CC_C((CC_C(_, _, _),CC_C(_, _, _)), _, CC_B(_, _, _)) => 11 
  case CC_C((CC_B(_, _, _),CC_B(_, _, _)), CC_A(_), CC_B(_, _, _)) => 12 
  case CC_C((CC_A(_),CC_A(_)), _, CC_B(_, _, _)) => 13 
  case CC_C(_, CC_A(_), CC_B(_, _, _)) => 14 
  case CC_C((CC_A(_),CC_B(_, _, _)), CC_A(_), CC_B(_, _, _)) => 15 
  case CC_C((CC_A(_),CC_A(_)), CC_A(_), CC_B(_, _, _)) => 16 
  case CC_C((CC_C(_, _, _),CC_C(_, _, _)), CC_A(_), _) => 17 
  case CC_C((CC_B(_, _, _),CC_B(_, _, _)), CC_A(_), _) => 18 
  case CC_C((CC_B(_, _, _),CC_C(_, _, _)), CC_A(_), CC_B(_, _, _)) => 19 
  case CC_C(_, _, CC_B(_, _, _)) => 20 
  case CC_C((CC_C(_, _, _),CC_A(_)), CC_A(_), CC_B(_, _, _)) => 21 
  case CC_C((CC_A(_),CC_C(_, _, _)), CC_A(_), _) => 22 
}
}
// This is not matched: (CC_B T_A Wildcard Wildcard (CC_A Wildcard T_A) T_A)
// This is not matched: (CC_C Int Int Int Int (T_A Int Int))