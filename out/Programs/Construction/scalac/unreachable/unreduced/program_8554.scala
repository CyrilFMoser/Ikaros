package Program_21 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_A[E, E], b: T_A[T_A[E, E], E]) extends T_A[T_A[E, E], E]
case class CC_B[F](a: CC_A[T_B[F, F]], b: CC_A[F]) extends T_A[F, (Int,T_B[Char, Boolean])]
case class CC_C[G](a: T_A[T_A[G, G], G]) extends T_A[T_A[G, G], G]
case class CC_D[H, I]() extends T_B[H, I]

val v_a: T_A[T_A[(Int,T_B[Char, Boolean]), (Int,T_B[Char, Boolean])], (Int,T_B[Char, Boolean])] = null
val v_b: Int = v_a match{
  case CC_A(CC_B(CC_A(_, _), CC_A(_, _)), CC_A(CC_B(_, _), CC_A(_, _))) => 0 
  case CC_A(CC_B(CC_A(_, _), CC_A(_, _)), CC_A(CC_B(_, _), CC_B(_, _))) => 1 
  case CC_A(CC_B(CC_A(_, _), CC_A(_, _)), CC_A(CC_B(_, _), CC_C(_))) => 2 
  case CC_A(CC_B(CC_A(_, _), CC_A(_, _)), CC_B(_, CC_A(_, _))) => 3 
  case CC_A(CC_B(CC_A(_, _), CC_A(_, _)), CC_C(CC_A(_, _))) => 4 
  case CC_A(CC_B(CC_A(_, _), CC_A(_, _)), CC_C(CC_B(_, _))) => 5 
  case CC_A(CC_B(CC_A(_, _), CC_A(_, _)), CC_C(CC_C(_))) => 6 
  case CC_B(_, _) => 7 
  case CC_C(_) => 8 
}
}