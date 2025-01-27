package Program_29 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_A[D, D], b: T_A[D, D], c: T_B[D]) extends T_A[T_A[T_B[Boolean], (Int,Boolean)], D]
case class CC_B[E](a: Byte, b: E) extends T_A[T_A[T_B[Boolean], (Int,Boolean)], E]
case class CC_C[F](a: CC_B[F]) extends T_A[T_A[T_B[Boolean], (Int,Boolean)], F]
case class CC_D[G, H](a: G, b: G, c: Byte) extends T_B[G]
case class CC_E[I](a: T_B[I], b: Int, c: CC_D[I, CC_A[I]]) extends T_B[I]
case class CC_F[J](a: CC_B[T_B[J]], b: Int) extends T_B[J]

val v_a: T_A[T_A[T_B[Boolean], (Int,Boolean)], Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_, _, CC_D(_, _, _)) => 0 
  case CC_A(_, _, CC_E(_, _, _)) => 1 
  case CC_A(_, _, CC_F(_, _)) => 2 
  case CC_B(_, true) => 3 
  case CC_B(_, false) => 4 
  case CC_C(CC_B(_, _)) => 5 
}
}