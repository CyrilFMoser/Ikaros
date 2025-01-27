package Program_31 

package Program_5 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E, F](a: F, b: T_A[E, E], c: T_A[F, F]) extends T_A[E, F]
case class CC_B[H, G](a: CC_A[G, H], b: Int) extends T_A[H, G]
case class CC_C[J, I, K](a: CC_B[J, I], b: I, c: I) extends T_A[J, I]
case class CC_D[L, M](a: T_B[M, L], b: T_A[L, L]) extends T_B[M, L]
case class CC_E[N]() extends T_B[N, T_A[N, N]]
case class CC_F[O](a: T_A[O, O], b: T_A[O, O]) extends T_B[O, T_A[O, O]]

val v_a: T_A[Byte, Int] = null
val v_b: Int = v_a match{
  case CC_C(CC_B(_, _), 12, _) => 0 
  case CC_C(_, 12, _) => 1 
  case CC_C(CC_B(_, _), _, _) => 2 
  case CC_B(CC_A(_, _, _), _) => 3 
  case CC_A(_, CC_A(_, _, _), CC_A(_, _, _)) => 4 
  case CC_A(_, _, CC_A(_, _, _)) => 5 
  case CC_A(_, CC_B(_, _), _) => 6 
  case CC_A(12, CC_B(_, _), CC_B(_, _)) => 7 
  case CC_A(_, CC_C(_, _, _), _) => 8 
  case CC_A(_, CC_C(_, _, _), CC_C(_, _, _)) => 9 
  case CC_A(_, CC_B(_, _), CC_B(_, _)) => 10 
  case CC_A(12, _, CC_C(_, _, _)) => 11 
  case CC_A(_, _, CC_C(_, _, _)) => 12 
  case CC_A(_, _, _) => 13 
  case CC_A(_, CC_A(_, _, _), CC_B(_, _)) => 14 
}
}
// This is not matched: (CC_C Byte Int Boolean Wildcard Wildcard Int (T_A Byte Int))
// This is not matched: (CC_A T_A)