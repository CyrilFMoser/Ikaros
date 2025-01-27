package Program_12 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: E, b: T_A[E, E]) extends T_A[E, T_B[E, E]]
case class CC_B[F](a: (T_B[Int, Char],CC_A[(Char,Int)])) extends T_A[F, T_B[F, F]]
case class CC_C[G](a: G, b: T_A[G, T_B[G, G]], c: G) extends T_A[G, T_B[G, G]]
case class CC_D[I, H](a: T_A[I, T_B[I, I]], b: T_A[I, T_B[I, I]], c: I) extends T_B[H, I]
case class CC_E[K, J]() extends T_B[K, J]
case class CC_F[L, M](a: M, b: CC_A[M], c: T_A[M, T_B[M, M]]) extends T_B[M, L]

val v_a: CC_C[Boolean] = null
val v_b: Int = v_a match{
  case CC_C(_, CC_A(_, _), true) => 0 
  case CC_C(_, CC_B(_), true) => 1 
  case CC_C(_, CC_C(_, _, _), true) => 2 
  case CC_C(_, CC_A(_, _), false) => 3 
  case CC_C(_, CC_B(_), false) => 4 
  case CC_C(_, CC_C(_, _, _), false) => 5 
}
}