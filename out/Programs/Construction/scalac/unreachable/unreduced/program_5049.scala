package Program_14 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: D) extends T_A[D, T_A[T_B[Int], Int]]
case class CC_B[E](a: T_B[E], b: T_B[E]) extends T_B[E]
case class CC_C[F](a: T_A[F, F]) extends T_B[F]
case class CC_D[G]() extends T_B[G]

val v_a: T_B[Boolean] = null
val v_b: Int = v_a match{
  case CC_B(_, _) => 0 
  case CC_C(_) => 1 
}
}
// This is not matched: CC_D()