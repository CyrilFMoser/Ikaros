package Program_13 

package Program_10 

object Test {
sealed trait T_A[A, B]
case class CC_A[D, C, E](a: T_A[D, E]) extends T_A[C, D]
case class CC_B[F, G](a: T_A[G, F], b: G, c: T_A[G, F]) extends T_A[G, F]

val v_a: T_A[Char, Int] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(CC_B(_, _, _), _, CC_B(_, _, _)) => 1 
  case CC_B(CC_B(_, _, _), _, CC_A(_)) => 2 
  case CC_B(CC_A(_), 'x', _) => 3 
  case CC_B(_, _, _) => 4 
  case CC_B(CC_A(_), 'x', CC_A(_)) => 5 
  case CC_B(_, 'x', CC_B(_, _, _)) => 6 
  case CC_B(_, 'x', CC_A(_)) => 7 
  case CC_B(CC_B(_, _, _), 'x', CC_A(_)) => 8 
}
}
// This is not matched: (CC_A Int Char Boolean Wildcard (T_A Char Int))
// This is not matched: (CC_B Wildcard Wildcard Wildcard T_A)