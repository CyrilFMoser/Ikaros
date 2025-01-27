package Program_6 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E, F](a: T_B[E, F], b: Char) extends T_A[F, E]
case class CC_B[G](a: T_A[G, G]) extends T_B[T_B[Boolean, Boolean], G]
case class CC_C[H](a: Byte, b: Boolean) extends T_B[T_B[Boolean, Boolean], H]
case class CC_D[I](a: CC_C[CC_B[I]], b: I, c: T_B[T_B[Boolean, Boolean], I]) extends T_B[T_B[Boolean, Boolean], I]

val v_a: T_B[T_B[Boolean, Boolean], Char] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_, _)) => 0 
  case CC_C(_, _) => 1 
  case CC_D(_, _, _) => 2 
}
}