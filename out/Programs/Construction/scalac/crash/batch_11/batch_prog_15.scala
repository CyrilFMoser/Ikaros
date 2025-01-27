package Program_15 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_A[E, T_B[Int, Boolean]], b: T_A[E, E], c: T_A[E, T_B[Int, Boolean]]) extends T_A[E, T_B[Int, Boolean]]
case class CC_B[F](a: CC_A[F], b: T_A[F, T_B[Int, Boolean]], c: CC_A[F]) extends T_A[F, T_B[Int, Boolean]]
case class CC_C() extends T_A[T_A[CC_A[Int], T_B[Int, Boolean]], T_A[Char, T_B[Int, Boolean]]]
case class CC_D[G, H](a: (T_A[Char, CC_C],T_B[CC_C, CC_C]), b: T_B[G, H]) extends T_B[G, H]
case class CC_E[J, I](a: I, b: (Char,CC_B[Int])) extends T_B[I, J]
case class CC_F[K](a: CC_D[K, K], b: CC_B[K]) extends T_B[T_A[K, T_B[Int, Boolean]], K]

val v_a: T_A[T_A[CC_A[Int], T_B[Int, Boolean]], T_A[Char, T_B[Int, Boolean]]] = null
val v_b: Int = v_a match{
  case CC_C() => 0 
}
}