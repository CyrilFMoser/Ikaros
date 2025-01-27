package Program_14 

package Program_7 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A[C](a: T_B[T_A, C], b: T_A) extends T_A
case class CC_B(a: T_A, b: CC_A[T_A], c: T_B[T_A, Char]) extends T_A
case class CC_C[E, D](a: CC_A[E], b: CC_B, c: CC_A[E]) extends T_B[D, E]
case class CC_D[G, F]() extends T_B[G, F]
case class CC_E[H, I](a: CC_D[Int, H], b: CC_B, c: CC_A[I]) extends T_B[H, I]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(CC_E(_, _, _), _) => 0 
  case CC_A(CC_C(_, _, _), CC_B(_, _, _)) => 1 
  case CC_A(CC_C(_, _, _), _) => 2 
  case CC_A(CC_D(), CC_A(_, _)) => 3 
  case CC_A(CC_E(_, _, _), CC_B(_, _, _)) => 4 
  case CC_A(CC_D(), CC_B(_, _, _)) => 5 
  case CC_A(CC_E(_, _, _), CC_A(_, _)) => 6 
  case CC_B(_, CC_A(_, _), _) => 7 
  case CC_B(CC_A(_, _), CC_A(_, _), _) => 8 
  case CC_B(_, CC_A(_, _), CC_D()) => 9 
  case CC_B(CC_A(_, _), CC_A(_, _), CC_C(_, _, _)) => 10 
  case CC_B(_, _, CC_D()) => 11 
  case CC_B(CC_B(_, _, _), CC_A(_, _), CC_E(_, _, _)) => 12 
}
}
// This is not matched: (CC_A T_A Wildcard Wildcard T_A)
// This is not matched: (CC_A (Tuple (CC_B T_A) (CC_B T_A)) Wildcard Wildcard T_A)