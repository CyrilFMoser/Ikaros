package Program_31 

package Program_13 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C, D](a: C, b: T_B[Char]) extends T_A[C]
case class CC_B[E](a: T_A[E], b: E, c: T_A[E]) extends T_A[E]
case class CC_C[F](a: T_A[F], b: T_A[F]) extends T_A[F]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_A('x', _) => 0 
  case CC_A(_, _) => 1 
  case CC_C(CC_B(_, _, _), _) => 2 
  case CC_C(CC_A(_, _), CC_C(_, _)) => 3 
  case CC_C(CC_C(_, _), CC_C(_, _)) => 4 
  case CC_C(CC_B(_, _, _), CC_A(_, _)) => 5 
  case CC_C(CC_B(_, _, _), CC_C(_, _)) => 6 
  case CC_C(CC_A(_, _), CC_B(_, _, _)) => 7 
  case CC_C(_, _) => 8 
  case CC_C(_, CC_A(_, _)) => 9 
  case CC_B(_, 'x', CC_A(_, _)) => 10 
  case CC_B(_, 'x', CC_C(_, _)) => 11 
  case CC_B(CC_C(_, _), _, CC_B(_, _, _)) => 12 
  case CC_B(CC_C(_, _), _, CC_A(_, _)) => 13 
  case CC_B(CC_B(_, _, _), 'x', CC_A(_, _)) => 14 
  case CC_B(CC_A(_, _), _, CC_C(_, _)) => 15 
  case CC_B(CC_A(_, _), 'x', CC_B(_, _, _)) => 16 
  case CC_B(CC_C(_, _), _, _) => 17 
  case CC_B(CC_B(_, _, _), 'x', CC_B(_, _, _)) => 18 
  case CC_B(CC_B(_, _, _), 'x', CC_C(_, _)) => 19 
  case CC_B(_, _, CC_A(_, _)) => 20 
  case CC_B(CC_C(_, _), _, CC_C(_, _)) => 21 
  case CC_B(CC_A(_, _), 'x', CC_A(_, _)) => 22 
  case CC_B(CC_C(_, _), 'x', CC_B(_, _, _)) => 23 
  case CC_B(CC_B(_, _, _), _, CC_B(_, _, _)) => 24 
  case CC_B(_, _, CC_B(_, _, _)) => 25 
  case CC_B(_, 'x', _) => 26 
  case CC_B(CC_B(_, _, _), _, _) => 27 
  case CC_B(_, 'x', CC_B(_, _, _)) => 28 
  case CC_B(_, _, CC_C(_, _)) => 29 
  case CC_B(CC_B(_, _, _), _, CC_A(_, _)) => 30 
  case CC_B(CC_B(_, _, _), 'x', _) => 31 
}
}
// This is not matched: (CC_A Char Boolean Char Wildcard (T_A Char))
// This is not matched: Pattern match is empty without constants