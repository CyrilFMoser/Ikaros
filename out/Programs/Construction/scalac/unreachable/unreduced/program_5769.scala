package Program_25 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_A[D, D]) extends T_A[T_B[D], D]
case class CC_B[E](a: CC_A[E], b: Char) extends T_A[E, T_B[E]]
case class CC_C[F]() extends T_A[T_B[F], F]
case class CC_D[G](a: Int) extends T_B[G]
case class CC_E[H](a: Boolean) extends T_B[H]
case class CC_F[I](a: CC_A[T_B[I]], b: CC_C[I]) extends T_B[I]

val v_a: T_B[Byte] = null
val v_b: Int = v_a match{
  case CC_D(12) => 0 
  case CC_D(_) => 1 
  case CC_E(_) => 2 
  case CC_F(CC_A(_), CC_C()) => 3 
}
}