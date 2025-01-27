package Program_28 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E]() extends T_A[E, T_A[T_A[Char, Byte], Char]]
case class CC_B[F](a: CC_A[F]) extends T_A[CC_A[T_B[Char, (Char,Boolean)]], F]
case class CC_C[G](a: T_B[G, T_A[G, G]]) extends T_B[G, T_A[G, G]]
case class CC_D[H](a: CC_B[H], b: T_A[H, H]) extends T_B[H, T_A[H, H]]
case class CC_E[I]() extends T_B[I, T_A[I, I]]

val v_a: T_B[Char, T_A[Char, Char]] = null
val v_b: Int = v_a match{
  case CC_C(CC_C(CC_C(_))) => 0 
  case CC_C(CC_C(CC_D(_, _))) => 1 
  case CC_C(CC_C(CC_E())) => 2 
  case CC_C(CC_D(_, _)) => 3 
  case CC_D(_, _) => 4 
  case CC_E() => 5 
}
}
// This is not matched: CC_C(CC_E())