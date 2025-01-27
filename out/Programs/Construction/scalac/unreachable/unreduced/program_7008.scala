package Program_1 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D, E](a: T_A[E, T_B[E]], b: T_A[E, T_A[E, E]]) extends T_A[D, T_B[D]]
case class CC_B[F](a: CC_A[F, F], b: F) extends T_A[F, T_B[F]]
case class CC_C[G](a: T_A[G, T_B[G]]) extends T_A[G, T_B[G]]

val v_a: T_A[Char, T_B[Char]] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_, _), _) => 0 
  case CC_C(CC_A(_, _)) => 1 
  case CC_C(CC_B(CC_A(_, _), _)) => 2 
  case CC_C(CC_C(CC_A(_, _))) => 3 
  case CC_C(CC_C(CC_B(_, _))) => 4 
  case CC_C(CC_C(CC_C(_))) => 5 
}
}
// This is not matched: CC_A(_, _)