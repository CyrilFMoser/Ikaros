package Program_26 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: Char, b: Boolean) extends T_A[E, Boolean]
case class CC_B[F, G](a: T_A[T_A[G, Boolean], F], b: G, c: T_B[F, F]) extends T_A[F, Boolean]

val v_a: T_A[Int, Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, _, _) => 1 
}
}