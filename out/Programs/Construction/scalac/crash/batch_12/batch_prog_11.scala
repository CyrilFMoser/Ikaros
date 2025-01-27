package Program_11 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_B[D, D]) extends T_A[D]
case class CC_B() extends T_A[Int]
case class CC_C[F, E](a: T_A[E]) extends T_B[F, E]

val v_a: CC_C[T_A[Int], Boolean] = null
val v_b: Int = v_a match{
  case CC_C(CC_A(_)) => 0 
}
}