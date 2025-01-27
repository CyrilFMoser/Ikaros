package Program_29 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_A[E, E], b: Char, c: T_B[E, E]) extends T_A[E, T_A[T_B[Boolean, Boolean], Char]]
case class CC_B[F](a: F, b: T_A[F, F], c: Byte) extends T_A[F, T_A[T_B[Boolean, Boolean], Char]]
case class CC_C[G]() extends T_A[G, T_A[T_B[Boolean, Boolean], Char]]
case class CC_D[I, H](a: (Boolean,CC_A[Byte]), b: T_B[H, H]) extends T_B[I, H]
case class CC_E[J, K](a: T_B[J, K], b: K, c: T_B[Int, K]) extends T_B[J, K]

val v_a: T_A[Boolean, T_A[T_B[Boolean, Boolean], Char]] = null
val v_b: Int = v_a match{
  case CC_B(_, _, _) => 0 
  case CC_C() => 1 
}
}
// This is not matched: CC_A(_, _, _)