package Program_15 

package Program_0 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[T_A, Char]) extends T_A
case class CC_B(a: T_B[CC_A, CC_A], b: Char, c: T_A) extends T_A
case class CC_C[C](a: T_B[C, T_A], b: Byte, c: Int) extends T_A
case class CC_D[D](a: D) extends T_B[T_A, D]
case class CC_E[E](a: T_B[T_A, E], b: CC_B, c: E) extends T_B[T_A, E]
case class CC_F[F]() extends T_B[T_A, F]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(CC_D(_)) => 0 
  case CC_A(_) => 1 
  case CC_B(_, 'x', CC_B(_, _, _)) => 2 
  case CC_B(_, 'x', _) => 3 
  case CC_B(_, _, CC_A(_)) => 4 
  case CC_B(_, 'x', CC_A(_)) => 5 
  case CC_B(_, _, _) => 6 
  case CC_C(_, _, _) => 7 
  case CC_C(CC_F(), 0, 12) => 8 
  case CC_C(CC_E(_, _, _), _, _) => 9 
  case CC_C(CC_F(), _, _) => 10 
  case CC_C(CC_D(_), 0, _) => 11 
  case CC_C(CC_F(), 0, _) => 12 
  case CC_C(CC_E(_, _, _), 0, _) => 13 
}
}
// This is not matched: (CC_C T_A Wildcard Wildcard Wildcard T_A)
// This is not matched: (CC_A Char (CC_B Char Char (T_A Char)) (T_A Char))