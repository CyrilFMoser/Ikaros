package Program_7 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D]() extends T_A[T_A[(Int,Int), Boolean], D]
case class CC_B[E](a: CC_A[E], b: T_A[E, E]) extends T_B[E]
case class CC_C[F](a: Int, b: T_B[F]) extends T_B[F]
case class CC_D() extends T_B[T_A[CC_A[Int], CC_A[Boolean]]]

val v_a: T_B[Boolean] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(), _) => 0 
  case CC_C(_, _) => 1 
}
}