package Program_15 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: Int, b: T_A[E, T_A[E, E]]) extends T_A[E, T_A[E, E]]
case class CC_B[F](a: CC_A[F], b: T_A[F, T_A[F, F]], c: T_A[F, F]) extends T_A[F, T_A[F, F]]
case class CC_C[G, H](a: T_A[H, T_A[H, H]]) extends T_B[H, G]
case class CC_D[I](a: (CC_A[Int],Boolean)) extends T_B[T_B[I, I], I]

val v_a: T_B[T_B[Boolean, Boolean], Boolean] = null
val v_b: Int = v_a match{
  case CC_C(CC_A(12, CC_A(_, _))) => 0 
  case CC_C(CC_A(_, CC_A(_, _))) => 1 
  case CC_C(CC_A(12, CC_B(_, _, _))) => 2 
  case CC_C(CC_A(_, CC_B(_, _, _))) => 3 
  case CC_C(CC_B(_, _, _)) => 4 
  case CC_D((CC_A(_, _),_)) => 5 
}
}