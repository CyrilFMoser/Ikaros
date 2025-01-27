package Program_7 

package Program_19 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A[B, C](a: Int) extends T_A[B]
case class CC_B[D](a: Int) extends T_A[D]
case class CC_C(a: (T_B,T_B), b: CC_A[T_B, T_B]) extends T_B
case class CC_D[E](a: Char) extends T_B
case class CC_E(a: T_A[T_B], b: Int) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_D('x') => 0 
  case CC_D(_) => 1 
  case CC_E(CC_A(_), _) => 2 
  case CC_E(CC_A(_), 12) => 3 
  case CC_E(_, 12) => 4 
  case CC_E(_, _) => 5 
  case CC_C((CC_C(_, _),CC_E(_, _)), _) => 6 
  case CC_C((CC_C(_, _),CC_D(_)), _) => 7 
  case CC_C((CC_C(_, _),CC_C(_, _)), CC_A(_)) => 8 
  case CC_C(_, CC_A(_)) => 9 
  case CC_C((CC_D(_),CC_D(_)), CC_A(_)) => 10 
  case CC_C((CC_C(_, _),CC_E(_, _)), CC_A(_)) => 11 
  case CC_C((CC_D(_),CC_E(_, _)), CC_A(_)) => 12 
  case CC_C((CC_C(_, _),CC_C(_, _)), _) => 13 
  case CC_C((CC_C(_, _),CC_D(_)), CC_A(_)) => 14 
  case CC_C((CC_D(_),CC_C(_, _)), CC_A(_)) => 15 
  case CC_C((CC_D(_),CC_E(_, _)), _) => 16 
  case CC_C(_, _) => 17 
  case CC_C((CC_D(_),CC_D(_)), _) => 18 
  case CC_C((CC_E(CC_B(_), _),CC_C(_, _)), CC_A(_)) => 19 
  case CC_C((CC_E(CC_A(_), _),CC_C(_, _)), CC_A(_)) => 19 
  case CC_C((CC_D(_),CC_C(_, _)), _) => 20 
  case CC_C((CC_E(_, _),CC_D(_)), _) => 21 
  case CC_C((CC_E(_, _),CC_D(_)), CC_A(_)) => 22 
}
}
// This is not matched: (CC_D T_B Wildcard T_B)
// Mutation information: 
// Expanded _ at position 19 into: 
// {
//  CC_A(_)
//  CC_B(_)
// }
//
// This is not matched: (CC_E Wildcard Wildcard T_B)
// Mutation information: 
// Expanded _ at position 1 into: 
// {
//  CC_A(_)
// }
//