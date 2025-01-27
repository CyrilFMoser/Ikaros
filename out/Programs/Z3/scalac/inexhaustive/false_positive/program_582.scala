package Program_31 

package Program_5 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D, E](a: T_A[E], b: T_B[E, E], c: T_B[E, Char]) extends T_A[D]
case class CC_B[F](a: T_B[F, F], b: Char, c: T_A[F]) extends T_A[F]
case class CC_C[H, G](a: T_B[G, G]) extends T_B[G, H]

val v_a: T_A[Byte] = null
val v_b: Int = v_a match{
  case CC_B(_, _, CC_A(_, _, _)) => 0 
  case CC_B(CC_C(_), 'x', _) => 1 
  case CC_B(_, _, _) => 2 
  case CC_B(CC_C(_), _, CC_A(_, _, _)) => 3 
  case CC_B(_, _, CC_B(_, _, _)) => 4 
  case CC_B(CC_C(_), 'x', CC_B(_, _, _)) => 5 
  case CC_B(_, 'x', CC_B(_, _, _)) => 6 
  case CC_A(CC_B(_, _, _), CC_C(_), _) => 7 
  case CC_A(CC_B(_, _, _), _, CC_C(_)) => 8 
  case CC_A(CC_B(_, _, _), CC_C(_), CC_C(_)) => 9 
  case CC_A(_, _, CC_C(_)) => 10 
  case CC_A(CC_A(_, _, _), CC_C(_), _) => 11 
  case CC_A(CC_A(_, _, _), CC_C(_), CC_C(_)) => 12 
  case CC_A(CC_A(_, _, _), _, _) => 13 
  case CC_A(_, _, _) => 14 
  case CC_A(_, CC_C(_), CC_C(_)) => 15 
  case CC_A(_, CC_C(_), _) => 16 
}
}
// This is not matched: (CC_A Byte (T_A Boolean) Wildcard Wildcard Wildcard (T_A Byte))
// This is not matched: (CC_B Wildcard Wildcard Wildcard T_A)