package Program_11 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_A[E, E], b: T_A[E, E]) extends T_A[E, T_B[T_A[E, E], E]]
case class CC_B[F](a: Int, b: F, c: T_A[F, F]) extends T_A[F, T_B[T_A[F, F], F]]
case class CC_C(a: T_B[CC_B[Byte], CC_A[Boolean]], b: CC_B[CC_B[Int]], c: (CC_A[Char],T_A[Char, Char])) extends T_A[T_B[CC_B[Char], T_A[Byte, Byte]], T_A[T_B[Int, (Char,Int)], T_A[Char, Boolean]]]
case class CC_D[G, H](a: CC_C) extends T_B[H, G]
case class CC_E[I, J](a: T_A[J, I], b: CC_D[T_B[J, Byte], J], c: T_B[I, J]) extends T_B[I, J]
case class CC_F[K, L]() extends T_B[L, K]

val v_a: T_B[Byte, Byte] = null
val v_b: Int = v_a match{
  case CC_D(_) => 0 
  case CC_E(_, CC_D(_), _) => 1 
}
}
// This is not matched: CC_F()