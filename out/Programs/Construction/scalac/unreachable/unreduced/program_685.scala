package Program_26 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_A[E, Char], b: T_A[E, E], c: Boolean) extends T_A[E, Boolean]
case class CC_B() extends T_A[CC_A[T_A[Boolean, Boolean]], Boolean]
case class CC_C[F](a: T_B[F, F], b: CC_A[T_A[F, CC_B]]) extends T_A[T_A[T_B[CC_B, CC_B], Boolean], F]
case class CC_D[G, H](a: T_A[H, Boolean], b: CC_C[G], c: T_B[G, H]) extends T_B[G, H]
case class CC_E[J, I](a: T_A[I, Boolean], b: T_B[I, J]) extends T_B[I, J]

val v_a: T_A[CC_A[T_A[Boolean, Boolean]], Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B() => 1 
}
}