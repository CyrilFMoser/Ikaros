package Program_0 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_A[E, E], b: (T_A[Byte, Byte],T_B[Char, Char]), c: E) extends T_A[T_B[E, E], E]
case class CC_B[F]() extends T_A[T_B[F, F], F]
case class CC_C[G](a: Byte, b: T_B[G, G], c: T_A[G, G]) extends T_A[T_B[G, G], G]
case class CC_D[H](a: T_A[T_B[H, H], H], b: T_A[T_B[H, H], H]) extends T_B[T_A[T_B[H, H], H], H]
case class CC_E[I]() extends T_B[T_A[T_B[I, I], I], I]

val v_a: T_B[T_A[T_B[Char, Char], Char], Char] = null
val v_b: Int = v_a match{
  case CC_D(CC_A(_, _, _), CC_A(_, _, _)) => 0 
  case CC_D(CC_A(_, _, _), CC_B()) => 1 
  case CC_D(CC_A(_, _, _), CC_C(_, _, _)) => 2 
  case CC_D(CC_B(), CC_A(_, _, _)) => 3 
  case CC_D(CC_B(), CC_B()) => 4 
  case CC_D(CC_B(), CC_C(_, _, _)) => 5 
  case CC_D(CC_C(_, _, _), CC_A(_, _, _)) => 6 
  case CC_D(CC_C(_, _, _), CC_B()) => 7 
  case CC_E() => 8 
}
}
// This is not matched: CC_D(CC_C(_, _, _), CC_C(_, _, _))