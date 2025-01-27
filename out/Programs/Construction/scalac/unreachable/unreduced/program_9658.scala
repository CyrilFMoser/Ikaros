package Program_29 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[F, E](a: T_A[T_B[F, E], F]) extends T_A[E, F]
case class CC_B[H, G](a: T_B[H, G], b: T_A[H, H], c: T_A[G, G]) extends T_A[H, G]
case class CC_C[I](a: CC_A[I, I], b: T_A[I, T_A[I, I]]) extends T_B[I, Char]

val v_a: T_A[Char, Char] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_)) => 0 
  case CC_A(CC_B(CC_C(_, _), CC_B(_, _, _), CC_A(_))) => 1 
  case CC_A(CC_B(CC_C(_, _), CC_A(_), CC_B(_, _, _))) => 2 
  case CC_A(CC_B(CC_C(_, _), CC_B(_, _, _), CC_B(_, _, _))) => 3 
  case CC_B(_, _, _) => 4 
}
}
// This is not matched: CC_A(CC_B(CC_C(_, _), CC_A(_), CC_A(_)))