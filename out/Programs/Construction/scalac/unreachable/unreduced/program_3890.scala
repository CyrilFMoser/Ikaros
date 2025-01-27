package Program_24 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[F, E](a: T_A[E, E], b: T_A[E, T_A[E, F]], c: T_A[E, F]) extends T_A[F, E]
case class CC_B[G, H](a: T_B[H, G], b: T_A[G, H], c: T_A[H, H]) extends T_A[G, H]
case class CC_C[I](a: CC_B[I, I]) extends T_A[I, T_A[CC_B[I, Char], I]]
case class CC_D[J](a: CC_B[J, J]) extends T_B[Boolean, J]
case class CC_E(a: CC_B[CC_B[Char, Int], Int]) extends T_B[Boolean, CC_D[CC_D[Boolean]]]
case class CC_F[K](a: T_B[Boolean, K], b: CC_A[K, T_A[K, CC_E]]) extends T_B[Boolean, K]

val v_a: T_A[Int, Int] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _, _), CC_A(_, _, _), CC_A(_, _, _)) => 0 
  case CC_A(CC_A(_, _, _), CC_B(_, CC_A(_, _, _), _), CC_A(_, _, _)) => 1 
  case CC_A(CC_A(_, _, _), CC_B(_, CC_B(_, _, _), _), CC_A(_, _, _)) => 2 
  case CC_A(CC_B(_, _, _), CC_A(_, _, _), CC_A(_, _, _)) => 3 
  case CC_A(CC_B(_, _, _), CC_B(_, CC_A(_, _, _), _), CC_A(_, _, _)) => 4 
  case CC_A(CC_B(_, _, _), CC_B(_, CC_B(_, _, _), _), CC_A(_, _, _)) => 5 
  case CC_A(CC_A(_, _, _), CC_B(_, CC_A(_, _, _), _), CC_B(_, _, _)) => 6 
  case CC_A(CC_A(_, _, _), CC_B(_, CC_B(_, _, _), _), CC_B(_, _, _)) => 7 
  case CC_A(CC_B(_, _, _), CC_A(_, _, _), CC_B(_, _, _)) => 8 
  case CC_A(CC_B(_, _, _), CC_B(_, CC_A(_, _, _), _), CC_B(_, _, _)) => 9 
  case CC_A(CC_B(_, _, _), CC_B(_, CC_B(_, _, _), _), CC_B(_, _, _)) => 10 
  case CC_B(_, _, CC_A(_, _, _)) => 11 
  case CC_B(_, _, CC_B(_, _, _)) => 12 
}
}
// This is not matched: CC_A(CC_A(_, _, _), CC_A(_, _, _), CC_B(_, _, _))