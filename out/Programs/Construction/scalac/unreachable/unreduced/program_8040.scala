package Program_0 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: Byte) extends T_A[Int, D]
case class CC_B[E](a: E, b: CC_A[E], c: T_A[T_A[E, E], E]) extends T_A[Int, E]
case class CC_C[F](a: F, b: Char, c: CC_A[F]) extends T_B[F]
case class CC_D[G](a: G) extends T_B[G]

val v_a: T_A[Int, Char] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, _, _) => 1 
}
}